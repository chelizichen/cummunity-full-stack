package com.example.project.service;

import com.example.project.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {
    List<Menu> getMenuList(String permission);
    Integer updateMenu(Menu menu);
    Integer delMenuById(String id);
    Integer getOneById(String id);
}
