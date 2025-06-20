package com.kevin.demo3;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Kevin
 * @date 2025/6/18 22:12
 */
// 动态代理
@Log4j2
public class LogHandler implements InvocationHandler {

    // 目标对象
    private final Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        Object invoke = method.invoke(target, args);
        after(method);
        return invoke;
    }

    private void before(Method method) {
        log.info("{}方法执行前", method.getName());
    }

    private void after(Method method) {
        log.info("{}方法执行后", method.getName());
    }

    /**
     * 获取代理对象
     * <T>：声明一个类型变量 T
     * T：返回值的类型是 T
     */
    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
