package com.xhq.service.user;

import com.xhq.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode, String password);
}
