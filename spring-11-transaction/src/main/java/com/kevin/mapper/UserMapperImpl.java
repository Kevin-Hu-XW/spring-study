package com.kevin.mapper;

import com.kevin.pojo.User;
import lombok.Setter;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author Kevin
 * @date 2025/6/21 22:08
 */
@Setter
public class UserMapperImpl implements UserMapper{

    //在原来所有的操作都使用sqlSession来执行，现在使用sqlSessionTemplate来执行
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * @return
     */
    @Override
    public List<User> queryUserList() {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.queryUserList();
    }
}
