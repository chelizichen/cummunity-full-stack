package com.example.project.service.impl;

import com.example.project.mapper.CarPortMapper;
import com.example.project.pojo.CarPort;
import com.example.project.service.CarPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPortServiceImpl implements CarPortService {

    @Autowired
    CarPortMapper carPortMapper;

    @Override
    public List<CarPort> getCarPortList(String keyword, String page, String size) {
        keyword = "%" + keyword + "%";
        Integer getPage = Integer.parseInt(page) - 1;
        return carPortMapper.getCarPortList(keyword, getPage, size);
    }

    @Override
    public List<CarPort> getCarPortListByCommunityId(String community_id) {
        return carPortMapper.getPortListByCommunityId(community_id);
    }
}
