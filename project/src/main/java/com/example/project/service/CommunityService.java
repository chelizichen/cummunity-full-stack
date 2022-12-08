package com.example.project.service;

import com.example.project.pojo.Community;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommunityService {
    List<Community> getList(String keyword, String page,String size);
    Community getOne(String id);
    Integer update(Community community);
    Integer del(String id);
}
