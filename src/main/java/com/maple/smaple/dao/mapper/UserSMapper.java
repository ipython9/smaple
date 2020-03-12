package com.maple.smaple.dao.mapper;

import com.maple.smaple.dao.mapper.bo.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: hanyu
 * @Description:
 * @copyright @hanyu
 * @Date: Create in  2020/3/12 10:04
 */
@Repository
public interface UserSMapper {

    List<User> selectList (User user);
}
