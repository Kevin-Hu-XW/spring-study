package com.kevin.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Admin
 */

public class Hello {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}