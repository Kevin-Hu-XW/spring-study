package com.kevin.demo02;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/18 20:18
 */
@Log4j2
public class UserServiceImpl implements UserService{
    /**
     *
     */
    @Override
    public void add() {
        log.info("添加用户...");
    }

    /**
     *
     */
    @Override
    public void delete() {
        log.info("删除用户...");
    }

    /**
     *
     */
    @Override
    public void update() {
        log.info("修改用户...");
    }

    /**
     *
     */
    @Override
    public void query() {
        log.info("查询用户...");
    }
}
