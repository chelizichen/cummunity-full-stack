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
        Integer getPage = Integer.parseInt(page) - 1;
        List<Owner> list = ownerMapper.getOwnerList(keyword, getPage, size);
        System.out.println(list);
        return list;
    }

    @Override
    public Integer updateOwner(Owner owner) {
        if(owner.getId() == null){
            Integer integer = ownerMapper.addOwner(owner);
            System.out.println("owner.getId()"+owner.getId());
            return integer;
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
    public Owner getOneByUserId(String id) {
        return ownerMapper.getOneByUserId(id);
    }

    @Override
    public Integer bespeakCar(CarPort carPort) {
        return null;
    }

    @Override
    public Integer bespeakServer(Bespeak bespeak) {
        return null;
    }

    @Override
    public Owner getInfoByUserId(String id) {
        return ownerMapper.getInfoByUserId(id);
    }
}

