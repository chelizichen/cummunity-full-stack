package com.example.project.service;

import com.example.project.dto.Bespeak;
import com.example.project.pojo.CarPort;
import com.example.project.pojo.Servant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServantService {
    List<CarPort> getPortList(String communityId);
    List<CarPort> getOwnServant(String userId);
    Integer bespeakCar(Bespeak bespeak);
    Integer addServant(Servant servant);
}
