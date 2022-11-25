package com.example.project.controller;


import com.example.project.config.Ret;
import com.example.project.pojo.Community;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("community")
public class CommunityController {

    @GetMapping("list")
    public Ret getCommunityList(){
        return null;
    }

    @PostMapping("update")
    public Ret updateCommunity(Community community){
        return null;
    }

    @GetMapping("del")
    public Ret delOneCommunity(@RequestParam("id")String id){
        return null;
    }

    @GetMapping("one")
    public Ret getOneCommunity(@RequestParam("id")String id){
        return null;
    }
}
