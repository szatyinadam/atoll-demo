package com.atollgroup.redis;

import com.atollgroup.model.MessageModel;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class RedisPublisher {
    private final RedisTemplate<String, Object> template;
    private final ChannelTopic topic;
    private final AtomicLong counter = new AtomicLong(0);

    public RedisPublisher(final RedisTemplate<String, Object> template, final ChannelTopic topic) {
        this.template = template;
        this.topic = topic;
    }

    public void publish() {
        template.convertAndSend(topic.getTopic(), new MessageModel(counter.incrementAndGet(), "Message " + counter.incrementAndGet() + ", " + Thread.currentThread().getName(),new Date()));
    }
}
