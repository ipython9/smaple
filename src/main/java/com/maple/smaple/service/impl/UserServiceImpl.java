package com.maple.smaple.service.impl;

import com.maple.smaple.dao.mapper.UserMapper;
import com.maple.smaple.dao.mapper.UserSMapper;
import com.maple.smaple.dao.mapper.bo.User;
import com.maple.smaple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/7 23:42
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserSMapper userSMapper;

    @Override
    public User findUserById(Integer userId) {
        return  userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectList(User user) {
        return userSMapper.selectList(user);
    }
}
