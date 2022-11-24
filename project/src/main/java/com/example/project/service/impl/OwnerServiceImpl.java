package com.example.project.service.impl;

import com.example.project.dto.Bespeak;
import com.example.project.mapper.OwnerMapper;
import com.example.project.pojo.CarPort;
import com.example.project.pojo.Owner;
import com.example.project.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    OwnerMapper ownerMapper;

    @Override
    public List<Owner> getOwnerList(String keyword, String page, String size) {
        keyword = "%" + keyword + "%";
        return ownerMapper.getOwnerList(keyword, page, size);
    }

    @Override
    public Integer updateOwner(Owner owner) {
        if(owner.getId().equals("")){
            return ownerMapper.addOwner(owner);
        }else {
            return ownerMapper.updateOwner(owner);
        }
    }

    @Override
    public Owner getOne(String id) {
        return ownerMapper.getOne(id);
    }

    @Override
    public Integer del(String id) {
      return ownerMapper.del(id);
    }

    @Override
    public Integer bespeakCar(CarPort carPort) {
        return null;
    }

    @Override
    public Integer bespeakServer(Bespeak bespeak) {
        return null;
    }
}

