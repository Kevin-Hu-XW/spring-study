package com.kevin.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Kevin
 * @date 2025/6/19 23:15
 */
//标注这个类是一个切面
//使用注解方式实现AOP
@Aspect
public class Annotation {

    @Before("execution(* com.kevin.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }

    @After("execution(* com.kevin.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }

    //在环绕增强中，我们可以给地暖管一个参数，代表我们要获取切入的点
    @Around("execution(* com.kevin.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");

        Object proceed = joinPoint.proceed();

        System.out.println("after around");
    }

}
