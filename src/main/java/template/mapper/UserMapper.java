package template.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import template.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
