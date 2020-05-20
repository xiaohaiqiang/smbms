package com.xhq.dao.user;

import com.xhq.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

public interface UserDao {
    //得到要登陆的用户
    public User getLoginUser(Connection connection, String userCode,String userPassword) throws SQLException;


}
