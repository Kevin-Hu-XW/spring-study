package com.kevin.log;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Kevin
 * @date 2025/6/19 21:30
 */
@Log4j2
public class Logging implements MethodBeforeAdvice {


    /**
     * @param method 要执行的目标对象方法
     * @param args  参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.info("{}执行了{}方法", target.getClass().getName(), method.getName());
    }
}
