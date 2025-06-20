package com.kevin.config;

import com.kevin.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kevin
 * @date 2025/6/16 19:31
 */

//这个也会被Spring容器托管，注册到容器中，因为它本身就是一个@Component
//@Configuration是一个配置类，和之前的beans.xml作用一样
@Configuration
@ComponentScan("com.kevin.*")
public class AppConfig {


    //注册一个bean，就相当于我们之前写的一个bean标签,
    // id属性就是方法的名子
    // class属性就是方法的返回值
    @Bean
    public User getUser() {
        //返回注入到bean的对象
        return new User();
    }
}
