package com.example.project.service;

import com.example.project.pojo.CarPort;

import java.util.List;

public interface CarPortService {
    List<CarPort> getCarPortList(String keyword, String page, String size);
}
