package com.example.project.service;

import com.example.project.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getUserList(String keyword, String page, String size);
    User getOne(String id);
    Integer updateUser(User user);
    Integer del(String id);
    List<User> login(User user);
}
