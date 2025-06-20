package com.kevin.demo02;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/18 20:19
 */
@Log4j2
public class UserServiceProxy implements UserService{

    //面向接口编程
    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     *
     */
    @Override
    public void add() {
        log("add");
        userService.add();
    }

    /**
     *
     */
    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    /**
     *
     */
    @Override
    public void update() {
        log("update");
        userService.update();
    }

    /**
     *
     */
    @Override
    public void query() {
        log("query");
        userService.query();
    }

    private void log(String msg) {

        log.info("执行{}方法！", msg);
    }



}
