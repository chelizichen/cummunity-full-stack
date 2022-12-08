package com.example.project.controller;


import com.example.project.config.Ret;
import com.example.project.pojo.Community;
import com.example.project.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("community")
public class CommunityController {

    @Autowired
    CommunityService communityService;

    @GetMapping("list")
    public Ret getCommunityList(@RequestParam(value = "keyword",defaultValue = "")String keyword, @RequestParam(value = "page",defaultValue = "0")String page, @RequestParam(value = "size",defaultValue = "10")String size){
        return Ret.Success(communityService.getList(keyword, page, size));
    }

    @PostMapping("update")
    public Ret updateCommunity(@RequestBody Community community){
        return Ret.Success(communityService.update(community));
    }

    @GetMapping("del")
    public Ret delOneCommunity(@RequestParam("id")String id){
        return Ret.Success(communityService.del(id));
    }

    @GetMapping("one")
    public Ret getOneCommunity(@RequestParam("id")String id){
        return Ret.Success(communityService.getOne(id));
    }
}
