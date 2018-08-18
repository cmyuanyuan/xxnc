package com.xxnc.service;

import com.xxnc.dao.UserMapper;
import com.xxnc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑实现类
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User>find(String yname){
        return userMapper.findByName(yname);
    }

    public User find(String yname,String ypassword){
        return userMapper.findByParam(yname,ypassword);
    }

    public int add(User user){
        return userMapper.add(user);
    }

    public int modify(User user){
        return userMapper.modify(user);
    }

    public int remove(Integer yid){
        return userMapper.remove(yid);
    }
}
