package com.healthcenter.service;

import com.healthcenter.mapper.ObjectMapper;
import com.healthcenter.pojo.User;
import com.healthcenter.mapper.UserMapper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ObjectMapper objectMapper;

    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 新增用户
     */
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    //按照账号检索用户
    public User queryUserByUserId(String userId) {
        return userMapper.queryUserByUserId(userId);
    }

    //用户注册


    //用户登录



    //按照账号或用户名关键字模糊查找
    public List<User> queryUserByKey(String key1, String key2) {
        return userMapper.queryUserByKey(key1, key2);
    }

    //查找所有用户
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    //查询在线的用户人数
    public int queryAllOnlineUsersCount()
    {
        return userMapper.queryAllOnlineUsersCount();
    }

//    //按照账号关键字模糊查找
//    public List<User> queryUserByUserIdKey(String key)
//    {
//        return userMapper.queryUserByUserIdKey(key);
//    }

    //用户信息更新（设置全部项）
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    //用户信息更新（设置用户名、性别、出生日期、手机号码）
    public int updateUserBasicInfo(User user) {
        return userMapper.updateUserBasicInfo(user);
    }

    //用户密码修改
    public int updateUserPassword(User user) {
        return userMapper.updateUserPassword(user);
    }

    //更新用户最后登录时间和登录状态
    public int updateUserLoginState(User user) {
        return userMapper.updateUserLoginState(user);
    }

    //更新用户最后离线时间和登录状态
    public int updateUserLogoutState(User user) {
        return userMapper.updateUserLogoutState(user);
    }

    //删除用户，用于多步骤操作信息错误回溯处理
    public int deleteUserByUserId(String userId) {
        return userMapper.deleteUserByUserId(userId);
    }
}
