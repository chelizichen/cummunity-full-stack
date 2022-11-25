package com.example.project.controller;

import com.example.project.config.Ret;
import com.example.project.pojo.CarPort;
import org.springframework.web.bind.annotation.*;

/**
 * 客户功能 查看小区停车位剩余数 根据小区ID 和 具体位置
 * 客户功能 提交预约停车点
 * 客户功能 预约业务上门维修
 * 客户功能 交付水电燃气费用
 * 客户功能 缴纳物业费
 * 客户功能 申请投诉
 * 客户功能 申请便民服务
 * 客户功能 申请门禁卡挂失补办
 */
@RequestMapping("servant")
@RestController
public class ServantController {

    // 查看车位列表
    @GetMapping("port_list")
    public  Ret getCarPortList(){
        return null;
    }

    // 预约车位
    @PostMapping("port_bespeak")
    public Ret bespeakCar(@RequestBody CarPort carPort){
        return null;
    }

    // 缴纳物业费
    @PostMapping("pay_property")
    public Ret payProperty(){
        return null;
    }

    // 申请投诉
    @PostMapping("post_complaint")
    public Ret postComplaint(){
        return null;
    }

    @PostMapping("post_server")
    public Ret postServer(){
        return null;
    }


}
