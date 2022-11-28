package com.example.project.service;

import com.example.project.pojo.Community;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommunityService {
    List<Community> getCommunityList(String keyword, String page,String size);
    Community getOneById(String id);
    Integer updateCommunity(Community community);
    Integer delCommunity(String id);
}
