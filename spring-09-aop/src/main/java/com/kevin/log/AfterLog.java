package com.kevin.log;

import lombok.extern.log4j.Log4j2;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author Kevin
 * @date 2025/6/19 21:40
 */
@Log4j2
public class AfterLog implements AfterReturningAdvice {
    /**
     * @param returnValue
     * @param method
     * @param args
     * @param target
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("执行了{}返回结果为{}", method.getName(), returnValue);
    }
}
