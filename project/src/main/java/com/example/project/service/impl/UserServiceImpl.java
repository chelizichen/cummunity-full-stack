package com.example.project.service.impl;

import com.example.project.mapper.UserMapper;
import com.example.project.pojo.User;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList(String keyword, String page, String size) {
        keyword = "%" + keyword + "%";
        Integer getPage = Integer.parseInt(page) - 1;
        return userMapper.getUserList(keyword,getPage,size);
    }

    @Override
    public Integer updateUser(User user) {
        System.out.println(user);
        if(user.id == null){
            userMapper.addUser(user);
            return Integer.parseInt(user.getId());
        }else {
            return userMapper.updateUser(user);
        }
    }

    @Override
    public Integer del(String id) {
        return userMapper.del(id);
    }

    @Override
    public User getOne(String id){
        return userMapper.getOne(id);
    }
 }
