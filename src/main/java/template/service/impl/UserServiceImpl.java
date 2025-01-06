package template.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import template.domain.dto.UserResp;
import template.exception.auth.PasswordErrorException;
import template.exception.auth.UsernameNotFountException;
import template.mapper.UserMapper;
import template.domain.entity.User;
import template.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public String login(String username, String password) {
        User user = userMapper.selectOne(new LambdaQueryWrapper<User>()
                .eq(User::getUsername, username));
        if (user == null) {
            throw new UsernameNotFountException();
        }
        if (DigestUtil.bcryptCheck(password, user.getPassword())) {
            StpUtil.login(user.getId());
            return StpUtil.getTokenInfo().getTokenValue();
        } else {
            throw new PasswordErrorException();
        }
    }

    @Override
    public void logout() {
        StpUtil.logout();
    }

    @Override
    public UserResp me() {
        return getUserResp(userMapper.selectById(StpUtil.getLoginIdAsLong()));
    }

    private UserResp getUserResp(User user) {
        UserResp userResp = new UserResp();
        BeanUtils.copyProperties(user, userResp);
        return userResp;
    }
}
