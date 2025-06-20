package com.kevin.demo01;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/17 22:32
 */
// 房东2
@Log4j2
public class LandOwner2 implements RentService{
    /**
     *
     */
    @Override
    public void rentHouse() {
       log.info("房东2出租房屋...");
    }
}
