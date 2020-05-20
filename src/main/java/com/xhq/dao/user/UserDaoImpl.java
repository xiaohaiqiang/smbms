package com.xhq.dao.user;

import com.xhq.dao.BaseDao;
import com.xhq.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements  UserDao{
    //从数据库中得到要登录的用户
    public User getLoginUser(Connection connection, String userCode,String userPassword) throws SQLException {

        PreparedStatement pstm = null;
        ResultSet rs = null;
        User user = null;

        if(connection != null){
            String sql = "select * from smbms_user where userCode =? and userPassword=?";
            Object[] params = {userCode,userPassword};


                rs = BaseDao.execute(connection, pstm, rs, sql, params);

                if(rs.next()){
                    user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUserCode(rs.getString("userCode"));
                    user.setUserName(rs.getString("userName"));
                    user.setUserPassword(rs.getString("userPassword"));
                    user.setGender(rs.getInt("gender"));
                    user.setBirthday(rs.getDate("birthday"));
                    user.setPhone(rs.getString("phone"));
                    user.setAddress(rs.getString("address"));
                    user.setUserRole(rs.getInt("userRole"));
                    user.setCreatedBy(rs.getInt("createdBy"));
                    user.setCreationDate(rs.getTimestamp("modifyDate"));
                }
                BaseDao.closeResource(null, pstm, rs);//connection在事务处关闭

        }

        return user;
    }
}
