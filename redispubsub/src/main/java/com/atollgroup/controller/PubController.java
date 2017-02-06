package com.atollgroup.controller;

import com.atollgroup.redis.RedisPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubController {
    @Autowired
    private RedisPublisher publisher;

    @GetMapping("pub")
    public void publishMessage(){
        publisher.publish();
    }
}
