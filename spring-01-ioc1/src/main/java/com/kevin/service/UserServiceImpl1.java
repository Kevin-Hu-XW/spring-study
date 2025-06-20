package com.kevin.service;

import com.kevin.dao.UserDao;

/**
 * @author Kevin
 * @date 2025/6/14 17:16
 */
public class UserServiceImpl1 implements UserService{


    /*
      * 没有控制反转时，程序中的对象是由程序自己创建的
     */
    //private final UserDao userDao = new UserMysqlDao();


    private UserDao userDao;
    /**
     * 控制反转
     * 通过set方法来实现对象的创建，将对象创建权交给第三方
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void getUserInfo() {
        userDao.getUserInfo();
    }
}
