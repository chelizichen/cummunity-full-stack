package com.example.project.mapper;

import com.example.project.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface MenuMapper {
    List<Menu> getMenuList(@Param("permission")String permission);
    Integer addMenu(Menu menu);
    Integer updateMenu(Menu menu);
    Integer delMenuById(@Param("id")String id);
    Menu getOneById(@Param("id")String id);
}
