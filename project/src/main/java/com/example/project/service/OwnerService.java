package com.example.project.service;

import com.example.project.dto.Bespeak;
import com.example.project.pojo.CarPort;
import com.example.project.pojo.Owner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OwnerService {
    List<Owner> getOwnerList(String keyword, String page, String size);
    Owner getOne(String id);
    Integer updateOwner(Owner owner);
    Integer del(String id);

    Owner getOneByUserId(String id);

    // 预约车位
    Integer bespeakCar(CarPort carPort);

    // 预约服务 添加描述和服务 添加照片
    Integer bespeakServer(Bespeak bespeak);

    Owner getInfoByUserId(String id);
}
