package com.kevin;

import com.kevin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kevin
 * @date 2025/6/14 17:20
 */
public class MyTest {


    public static void main(String[] args) {

//        UserService userService = new UserServiceImpl();
//        //通过第三方创建对象
//        ((UserServiceImpl)userService).setUserDao(new UserMysqlDao());
//        ((UserServiceImpl)userService).setUserDao(new UserOracleDao());
//        userService.getUserInfo();

        //容器在手，天下我有
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getUserInfo();
    }
}
