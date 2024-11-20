package com.chocohql.boot.service;

import com.chocohql.boot.domain.dto.UserResp;

public interface UserService {
    String login(String username, String password);

    void logout();

    UserResp me();
}
