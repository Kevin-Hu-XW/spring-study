package com.kevin.pojo;

/**
 * @author Admin
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

//    public User(){
//        System.out.println("无参构造！");
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}