package com.example.project.controller;

import com.example.project.config.Ret;
import com.example.project.pojo.Owner;
import com.example.project.pojo.User;
import com.example.project.service.OwnerService;
import com.example.project.service.UserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/** 权限
 * 超级管理员 6 拥有所有菜单
 * 社区管理员 5 商家管理 安保管理
 * 分为停车场管理员 4
 * 社区保安 3
 * 社区便民服务商家 2
 * 业主 1
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("list")
    public Ret getUserList(@RequestParam(value = "keyword",defaultValue = "")String keyword,@RequestParam(value = "page",defaultValue = "0")String page,@RequestParam(value = "size",defaultValue = "10")String size){
        final List<User> userList = userService.getUserList(keyword, page, size);
        return Ret.Success(userList);
    }

    @GetMapping("del")
    public Ret delUser(@RequestParam("id") String id){
        final val integer = userService.del(id);
        return Ret.Success(integer);
    }
    @GetMapping("one")
    public Ret getOne(@RequestParam("id")String id){
        final User one = userService.getOne(id);
        return Ret.Success(one);
    }

    @PostMapping("update")
    public Ret update(@RequestBody User user){
        Integer integer = userService.updateUser(user);
        return Ret.Success(integer);
    }

    @GetMapping("test")
    public Ret test(@RequestHeader Map<String, String> headerMap){
        System.out.println(headerMap);
        System.out.println(headerMap.get("token"));
        return Ret.Success("测试");
    }

    @PostMapping("login")
    public Ret Login(@RequestBody User user){
        return Ret.Success(userService.login(user));
    }

}
