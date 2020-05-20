package com.maple.smaple.service.impl;

import com.maple.smaple.dao.mapper.UserMapper;
import com.maple.smaple.dao.mapper.UserSMapper;
import com.maple.smaple.dao.mapper.bo.User;
import com.maple.smaple.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 
 * param: 
 * return: 
 * author: hanyu
 * date: 2020/5/20 19:12
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserSMapper userSmapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public User findUserById(Integer userId) {
        return  userMapper.selectByPrimaryKey(userId);
    }
    /**
     * Description: selectList
     * param: [user]
     * return: java.util.List<com.maple.smaple.dao.mapper.bo.User>
     * author: hanyu
     * date: 2020/5/9 18:53
     */
    @Override
    public List<User> selectList(User user) {
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        List<User> users = userSmapper.selectList(user);
        redisTemplate.opsForValue().set("user",users);
        return userSmapper.selectList(user);
    }
}
