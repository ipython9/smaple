package com.maple.smaple.service;

import com.maple.smaple.dao.mapper.bo.User;

import java.util.List;


public interface IUserService {
   /**
    * Description: 
    * param: 
    * return: 
    * author: hanyu
    * date: 2020/5/20 19:11
    */
    User findUserById(Integer userId);

    /**
     * Description: 
     * param: 
     * return: 
     * author: hanyu
     * date: 2020/5/20 19:11
     */
    List<User> selectList (User user);

}
