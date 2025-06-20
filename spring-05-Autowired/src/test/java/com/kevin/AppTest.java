package com.kevin;

import com.kevin.pojo.People;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().jiao();
        people.getDog().jiao();

    }
}
