package com.maple.smaple.service.impl;

import com.maple.smaple.dao.mapper.UserMapper;
import com.maple.smaple.dao.mapper.UserSMapper;
import com.maple.smaple.dao.mapper.bo.User;
import com.maple.smaple.service.IUserService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
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
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public User findUserById(Integer userId) {
        return  userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> selectList(User user) {
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        List<User> users = userSMapper.selectList(user);
        redisTemplate.opsForValue().set("user",users);
        return userSMapper.selectList(user);
    }
}
