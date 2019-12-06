package com.ylw.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class TopicProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Topic topic;

    @Scheduled(fixedDelay = 5000)
    public void send() {
        String msg = System.currentTimeMillis() + "";
        System.out.println("采用发布订阅方式,生产者向消费者发送内容:" + msg);
        jmsMessagingTemplate.convertAndSend(topic, msg);
    }
}
