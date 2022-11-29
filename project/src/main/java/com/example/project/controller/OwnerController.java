package com.example.project.controller;

import com.example.project.config.Ret;
import com.example.project.pojo.CarPort;
import com.example.project.pojo.Owner;
import com.example.project.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("owner")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @PostMapping("update")
    public Ret updateUser(@RequestBody Owner owner){
        Integer integer = ownerService.updateOwner(owner);
        return Ret.Success("添加成功");
    }

    // 管理者
    @GetMapping("list")
    public Ret getOwnerList(@RequestParam(value = "keyword",defaultValue = "")String keyword, @RequestParam(value = "page",defaultValue = "0")String page, @RequestParam(value = "size",defaultValue = "10")String size){
        final List<Owner> ownerList = ownerService.getOwnerList(keyword, page, size);
        return Ret.Success(ownerList);
    }


    @GetMapping("servant_list")
    public Ret getServantList(@RequestParam("id")String ownerId){
        return null;
    }


    @GetMapping("del")
    public Ret delOneById(@RequestParam("id")String id){
        return Ret.Success(ownerService.del(id));
    }

    @GetMapping("one")
    public Ret getOneById(@RequestParam("id")String id){
        return Ret.Success(ownerService.getOne(id));
    }

    @GetMapping("oneByUserId")
    public Ret getOneByUserId(@RequestParam("id")String id){
        return Ret.Success(ownerService.getOneByUserId(id));
    }

}
