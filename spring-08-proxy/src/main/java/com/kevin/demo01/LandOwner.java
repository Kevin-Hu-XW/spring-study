package com.kevin.demo01;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/17 22:09
 */
// 房东,有出租房子的需求
@Log4j2
public class LandOwner implements RentService{
    /**
     *
     */
    @Override
    public void rentHouse() {
        log.info("房东出租house！");
    }
}
