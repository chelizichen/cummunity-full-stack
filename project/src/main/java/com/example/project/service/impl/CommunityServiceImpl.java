package com.example.project.service.impl;

import com.example.project.mapper.CommunityMapper;
import com.example.project.pojo.Community;
import com.example.project.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    CommunityMapper communityMapper;

    @Override
    public List<Community> getList(String keyword, String page, String size) {
        keyword = "%" + keyword + "%";
        Integer getPage = Integer.parseInt(page) - 1;

        return communityMapper.getList(keyword,getPage,size);
    }

    @Override
    public Community getOne(String id) {
        return communityMapper.getOneById(id);
    }

    @Override
    public Integer update(Community community) {
        if(community.getId() == null){
            return communityMapper.add(community);
        }else {
            return communityMapper.update(community);
        }
    }

    @Override
    public Integer del(String id) {
        return communityMapper.delOne(id);
    }
}
