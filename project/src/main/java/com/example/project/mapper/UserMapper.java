package com.example.project.mapper;

import com.example.project.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUserList(@Param("keyword")String keyword, @Param("page")String page, @Param("size")String size);
    User getOne(@Param("id") String id);
    Integer updateUser(User user);
    Integer addUser(User user);
    Integer del(@Param("id") String id);
}
