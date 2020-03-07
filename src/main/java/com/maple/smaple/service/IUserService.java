package com.maple.smaple.service;

import com.maple.smaple.dao.mapper.bo.User;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/7 23:41
 */
public interface IUserService {
    User findUserById(Integer userId);
}
