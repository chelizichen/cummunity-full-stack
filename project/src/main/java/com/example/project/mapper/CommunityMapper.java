package com.example.project.mapper;

import com.example.project.pojo.Community;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommunityMapper {
    List<Community> getCommunityList(@Param("keyword")String keyword, @Param("page")String page, @Param("size")String size);
    Community getOneById(@Param("id")String id);
    Integer updateCommunity(Community community);
    Integer addCommunity(Community community);
    Integer delCommunity(@Param("id")String id);
}
