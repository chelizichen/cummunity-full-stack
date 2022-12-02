package com.example.project.service.impl;

import com.example.project.dto.MenuRouter;
import com.example.project.mapper.MenuMapper;
import com.example.project.pojo.Menu;
import com.example.project.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuList(String permission) {
        final List<Menu> menuList = menuMapper.getMenuList(permission);
        return menuList;
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
    public List<MenuRouter> getMenuRouter(String permission) {
        final List<Menu> menuList = menuMapper.getMenuList(permission);
        List<MenuRouter> arrayList = new ArrayList<MenuRouter>();
        for(Menu menu : menuList){
            if(menu.getMenuIsRoot().equals("1")){
                final MenuRouter menuRouter = new MenuRouter(menu.getMenuName(),menu.getId(), menu.getMenuPath(),menu.getMenuComponent(),new ArrayList<>());
                arrayList.add(menuRouter);
            }
        }
        for (Menu menu: menuList){
            if(menu.getMenuIsRoot().equals("0")){
                final MenuRouter menuRouter = new MenuRouter(menu.getMenuName(),menu.getId(), menu.getMenuPath(),menu.getMenuComponent());
                final String menuRootId = menu.getMenuRootId();
                final Optional<MenuRouter> first = arrayList.stream().filter(el -> el.id.equals(menuRootId)).findFirst();
                final MenuRouter menuRouter1 = first.get();
                menuRouter1.children.add(menuRouter);
            }
        }
        return arrayList;
    }

    @Override
    public Menu getOneById(String id) {
        return menuMapper.getOneById(id);
    }
}
