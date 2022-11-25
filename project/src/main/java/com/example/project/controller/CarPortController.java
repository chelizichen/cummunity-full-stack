package com.example.project.controller;

import com.example.project.config.Ret;
import com.example.project.pojo.CarPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 单独给管理员
 * 管理者功能 设置功能 办理停车点
 */
@RequestMapping("carport")
@RestController
public class CarPortController {
    // 管理员处理预约功能
    @GetMapping("deal_bespeak")
    public Ret delBespeak(){
        return null;
    }

    // 修改停车位数据
    @PostMapping("update")
    public Ret updateCarPot(CarPort carPort){
        return null;
    }

    @GetMapping("list")
    public Ret getCarPortList(){
        return null;
    }

    @GetMapping("del")
    public Ret delCarPortList(){
        return null;
    }
}
