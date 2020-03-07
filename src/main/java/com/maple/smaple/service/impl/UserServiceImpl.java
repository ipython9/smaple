package com.maple.smaple.service.impl;

import com.maple.smaple.dao.mapper.UserMapper;
import com.maple.smaple.dao.mapper.bo.User;
import com.maple.smaple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    @Override
    public User findUserById(Integer userId) {
        return  userMapper.selectByPrimaryKey(userId);
    }
}
