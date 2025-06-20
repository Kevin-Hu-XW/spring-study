package com.kevin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Kevin
 * @date 2025/6/15 22:54
 */
//等价于<bean id="user" class="com.kevin.pojo.User"/>
//@Component组件
@Component
public class User {

    //public String name = "kevin";


    //等价于<property name="name" value="kevin"/>
    //@Value("kevin")
    public String name;

    //等价于<property name="name" value="kevin"/>
    @Value("kevin")
    public void setName(String name){
        this.name = name;
    }
}
