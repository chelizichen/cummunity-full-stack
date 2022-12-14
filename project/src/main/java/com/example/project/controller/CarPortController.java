package com.example.project.controller;

import com.example.project.config.Ret;
import com.example.project.pojo.CarPort;
import com.example.project.service.CarPortService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 单独给管理员
 * 管理者功能 设置功能 办理停车点
 */
@RequestMapping("carport")
@RestController
public class CarPortController {

    @Autowired
    CarPortService carPortService;

    // 管理员处理预约功能
    @PostMapping("deal_bespeak")
    public Ret delBespeak(@RequestBody CarPort carPort){
        return Ret.Success( carPortService.dealBespeak(carPort));
    }

    // 管理员拿到预约的列表
    @GetMapping("list_bespeak")
    public Ret listBespeak(@RequestParam("id")String id){
        return Ret.Success(carPortService.listBespeak(id));
    }

    // 修改停车位数据
    @PostMapping("updateBespeak")
    public Ret updateCarPot(@RequestBody  CarPort carPort){
        System.out.println(carPort);
//        return carPortService;
        return Ret.Success(carPortService.updateBespeak(carPort));
    }

    @GetMapping("list")
    public Ret getCarPortList(@RequestParam(value = "keyword",defaultValue = "")String keyword, @RequestParam(value = "page",defaultValue = "0")String page, @RequestParam(value = "size",defaultValue = "10")String size){
        final List<CarPort> carPortList = carPortService.getCarPortList(keyword, page, size);
        return Ret.Success(carPortList);
    }

    @GetMapping("del")
    public Ret delCarPortList(@RequestParam("id")String id){
        return Ret.Success(carPortService.delOneById(id));
    }


    @PostMapping("update")
    public Ret updateCarPort(@RequestBody CarPort carPort){
        final val integer = carPortService.updateCarPort(carPort);
        return Ret.Success(integer);
    }


}
