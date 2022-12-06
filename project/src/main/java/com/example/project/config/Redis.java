package com.example.project.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Redis {

    @Autowired
    RedisTemplate redisTemplate;

}
