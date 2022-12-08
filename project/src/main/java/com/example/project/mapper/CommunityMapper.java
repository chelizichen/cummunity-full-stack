package com.example.project.mapper;

import com.example.project.pojo.Community;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommunityMapper {
    List<Community> getList(@Param("keyword")String keyword, @Param("page")Integer page, @Param("size")String size);
    Community getOneById(@Param("id")String id);
    Integer update(Community community);
    Integer add(Community community);
    Integer delOne(@Param("id")String id);
}
