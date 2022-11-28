package com.example.project.service.impl;

import com.example.project.mapper.MenuMapper;
import com.example.project.pojo.Menu;
import com.example.project.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuList(String permission) {
        return menuMapper.getMenuList(permission);
    }

    @Override
    public Integer updateMenu(Menu menu) {
        if(menu.getId().equals("")){
            return menuMapper.addMenu(menu);
        }else {
            return menuMapper.updateMenu(menu);
        }
    }

    @Override
    public Integer delMenuById(String id) {
        return menuMapper.delMenuById(id);
    }

    @Override
    public Menu getOneById(String id) {
        return menuMapper.getOneById(id);
    }
}
