package com.example.project.controller;

import com.example.project.config.Ret;
import com.example.project.pojo.Menu;
import com.example.project.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 超级管理员获得所有菜单列表
 * 其他权限的角色获得各自的菜单
 * 增加 删除 修改
 */

@RestController
@RequestMapping("menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("list")
    public Ret getMenuList(@RequestParam("permission")String permission){
        permission = "%" + permission + "%";
        return Ret.Success(menuService.getMenuList(permission));
    }

    @GetMapping("del")
    public Ret delMenu(@RequestParam("id")String id){
        return null;
    }

    @PostMapping ("update")
    public Ret updateMenu(Menu menu){
        return null;
    }

    @GetMapping("router")
    public Ret getRouterList(@RequestParam("permission")String permission){
        permission = "%" + permission + "%";
        return Ret.Success(menuService.getMenuRouter(permission));
    }

}
