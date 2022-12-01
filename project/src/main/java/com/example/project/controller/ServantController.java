package com.example.project.controller;

import com.example.project.config.Ret;
import com.example.project.dto.Bespeak;
import com.example.project.pojo.CarPort;
import com.example.project.pojo.Servant;
import com.example.project.service.CarPortService;
import com.example.project.service.ServantService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    CarPortService carPortService;

    @Autowired
    ServantService servantService;

    // 查看车位列表
    @GetMapping("port_list_by_community_id")
    public  Ret getCarPortListById(@RequestParam("community_id")String communityId){
        return Ret.Success(carPortService.getCarPortListByCommunityId(communityId));
    }

    // 预约车位
    @PostMapping("port_bespeak")
    public Ret bespeakCar(@RequestBody Bespeak bespeak){
        return null;
    }

    // 缴纳物业费
    @PostMapping("pay_property")
    public Ret payProperty(@RequestBody Servant servant){
        return null;
    }

    // 申请投诉
    @PostMapping("post_complaint")
    public Ret postComplaint(@RequestBody Servant servant){
        return null;
    }

    // 上传东西
    @PostMapping("post_server")
    public Ret postServer(@RequestBody Servant servant){
        return null;
    }


   // 申请门禁卡丢失补办
    @PostMapping("post_card_lost")
    public Ret postCardLost(@RequestBody Servant servant){
        return null;
    }

    @GetMapping("list")
    public Ret getServantList(@RequestParam(value = "keyword",defaultValue = "")String keyword, @RequestParam(value = "page",defaultValue = "0")String page, @RequestParam(value = "size",defaultValue = "10")String size){
        return Ret.Success(servantService.getServantList(keyword,page,size));
    }

    @PostMapping("update")
    public Ret updateServant(@RequestBody Servant servant){
            return Ret.Success(servantService.updateServant(servant));
    }

    @GetMapping("del")
    public Ret delOneById(@RequestParam("id")String id){
        return null;
    }

}
