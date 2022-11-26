package com.example.project.service;

import com.example.project.pojo.Community;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommunityService {
    List<Community> getCommunityList(String keyword, String page,String size);
    Community getOneById(String id);
    Integer updateCommunity(Community community);
    Integer delCommunity(String id);
}
