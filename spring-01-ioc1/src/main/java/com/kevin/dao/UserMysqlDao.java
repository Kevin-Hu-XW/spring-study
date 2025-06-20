package com.kevin.dao;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/14 16:59
 */
@Log4j2
public class UserMysqlDao implements UserDao{



    @Override
    public void getUserInfo() {
        log.info("mysql获取用户信息");
    }
}
