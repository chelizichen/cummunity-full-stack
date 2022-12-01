package com.example.project.service;

import com.example.project.dto.Bespeak;
import com.example.project.pojo.CarPort;
import com.example.project.pojo.Servant;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServantService {
    List<CarPort> getPortList(String communityId);
    List<Servant> getOwnServant(String userId);
    Integer bespeakCar(Bespeak bespeak);
    Integer updateServant(Servant servant);

    List<Servant> getServantList(
           String keyword,
           String page,
           String size
    );
}
