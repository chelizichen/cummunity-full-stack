package com.example.project.mapper;

import com.example.project.pojo.Menu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MenuMapper {
    List<Menu> getMenuList(@Param("permission")String permission);
    Integer addMenu(Menu menu);
    Integer updateMenu(Menu menu);
    Integer delMenuById(@Param("id")String id);
    Integer getOneById(@Param("id")String id);
}
