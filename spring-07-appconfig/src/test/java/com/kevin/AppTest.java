package com.kevin;

import com.kevin.config.AppConfig;
import com.kevin.pojo.User;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    public static void main(String[] args) {

        //如果使用了配置类去做，那么只能通过AnnotationConfigApplicationContext来获取上下文的容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.hashCode());
        System.out.println(user.getName());
        User user1 = (User) context.getBean("user");
        System.out.println(user1.hashCode());
        System.out.println(user.getName());
    }
}
