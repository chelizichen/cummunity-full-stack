package com.example.project.service;

import com.example.project.dto.MenuRouter;
import com.example.project.pojo.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    List<Menu> getMenuList(String permission);
    Menu getOneById(String id);
    Integer updateMenu(Menu menu);
    Integer delMenuById(String id);

    List<MenuRouter> getMenuRouter(String permission);
}
