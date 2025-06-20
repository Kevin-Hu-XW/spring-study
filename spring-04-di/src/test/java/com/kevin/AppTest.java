package com.kevin;


import com.kevin.pojo.Student;
import com.kevin.pojo.User;
import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        User user = (User) context.getBean("user1");
        System.out.println(user.toString());
        User user1 = (User) context.getBean("user1");
        System.out.println(user1== user);
    }
}
