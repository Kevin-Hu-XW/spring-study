package com.kevin.demo3;

import com.kevin.demo01.LandOwner;
import com.kevin.demo01.RentService;

import java.lang.reflect.Proxy;

/**
 * @author Kevin
 * @date 2025/6/18 22:33
 */
public class Client {


    public static void main(String[] args) {


        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //通过动态代理为不同的目标对象，生成不同的代理对象
        //目标对象1
        RentService target = new LandOwner();
        //代理对象,动态生成的代理对象
        RentService proxy = (RentService)Proxy.newProxyInstance(
                LandOwner.class.getClassLoader(),
                LandOwner.class.getInterfaces(),
                new LogHandler(target));
        proxy.rentHouse();


        //目标对象2
//        UserService userService = new UserServiceImpl();
//        UserService proxy2 = new LogHandler(userService).getProxy(UserService.class);
//        proxy2.add();
//        proxy2.delete();
//        proxy2.update();
//        proxy2.query();

    }




}
