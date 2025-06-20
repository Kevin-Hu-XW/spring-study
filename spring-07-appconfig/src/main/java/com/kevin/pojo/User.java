package com.kevin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Kevin
 * @date 2025/6/15 22:54
 */

@Component("user")
public class User {

    private String name;

    @Value("kevin")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
