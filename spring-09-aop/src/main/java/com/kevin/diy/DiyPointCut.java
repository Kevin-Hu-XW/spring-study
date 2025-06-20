package com.kevin.diy;

import lombok.extern.log4j.Log4j2;

/**
 * @author Kevin
 * @date 2025/6/19 22:25
 */
@Log4j2
public class DiyPointCut {

    public void before()
    {
        log.info("方法执行前");
    }
    public void after()
    {
        log.info("方法执行后");
    }
    public void around()
    {
        log.info("方法执行 around");
    }
    public void afterReturning()
    {
        log.info("方法正常返回 advice");
    }
}
