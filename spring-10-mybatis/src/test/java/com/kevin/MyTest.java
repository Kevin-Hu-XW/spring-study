package com.kevin;

import com.kevin.mapper.UserMapper;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.kevin.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class MyTest
{

    @Test
    public void testApp() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sqlSessionFactory.openSession(true);
//        UserMapper userMapper = session.getMapper(UserMapper.class);
//        List<User> userList = userMapper.queryUserList();
//        userList.forEach(System.out::println);
//        session.close();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> userList = userMapper.queryUserList();
        userList.forEach(System.out::println);

    }
}
