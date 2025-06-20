package com.kevin.dao;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/14 17:00
 */
@Log4j2
public class UserOracleDao implements UserDao{

    @Override
    public void getUserInfo() {
        log.info("Oracle获取用户信息");
    }
}
