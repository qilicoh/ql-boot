package template.service;

import template.domain.dto.UserResp;

public interface UserService {
    String login(String username, String password);

    void logout();

    UserResp me();
}
