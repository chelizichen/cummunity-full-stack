package com.example.project.service;

import com.example.project.pojo.CarPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPortService {
    List<CarPort> getCarPortList(String keyword, String page, String size);
    List<CarPort> getCarPortListByCommunityId(String community_id);
    Integer updateBespeak(CarPort carPort);
    Integer updateCarPort(CarPort carPort);
    Integer delOneById(String id);
    Integer dealBespeak(CarPort carPort);
    List<CarPort> listBespeak(String portCommunityId);

}
