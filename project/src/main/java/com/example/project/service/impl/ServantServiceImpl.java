package com.example.project.service.impl;

import com.example.project.dto.Bespeak;
import com.example.project.mapper.CarPortMapper;
import com.example.project.mapper.ServantMapper;
import com.example.project.pojo.CarPort;
import com.example.project.pojo.Servant;
import com.example.project.service.ServantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServantServiceImpl implements ServantService {

    @Autowired
    ServantMapper servantMapper;

    @Autowired
    CarPortMapper carPortMapper;

    @Override
    public List<CarPort> getPortList(String communityId) {
        return null;
    }

    @Override
    public List<Servant> getOwnServant(String userId) {
        return servantMapper.getOwnServant(userId);
    }

    @Override
    public Integer bespeakCar(Bespeak bespeak) {
        return null;
    }

    @Override
    public Integer updateServant(Servant servant) {
        if (servant.getId() == null){
            Integer integer = servantMapper.addServant(servant);
            return integer;
        }else {
            Integer integer = servantMapper.updateServant(servant);
            return integer;
        }
    }

    @Override
    public List<Servant> getServantList(String keyword, String page, String size) {
        Integer getPage = Integer.parseInt(page) - 1;
        keyword = "%" + keyword + "%";
        return servantMapper.getServantList(keyword,getPage,size);
    }
}
