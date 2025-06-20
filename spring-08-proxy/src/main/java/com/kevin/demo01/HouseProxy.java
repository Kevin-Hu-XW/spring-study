package com.kevin.demo01;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/17 22:12
 */
// 代理类: 中介
@Log4j2
public class HouseProxy implements RentService{

    //面向接口编程
    //这样写的原因：代理所有实现了 RentService 接口的“房东”类，提升了代码的通用性与扩展性
    private  RentService rentService;

    public HouseProxy(RentService rentService) {
        this.rentService = rentService;
    }


    /**
     *
     */
    @Override
    public void rentHouse() {
        log.info("中介开始代理...");
        before();
        rentService.rentHouse();
        after();
    }

    public void before() {
        log.info("中介开始带客户看房");
    }
    public void after() {
        log.info("中介开始签合同");
    }
}
