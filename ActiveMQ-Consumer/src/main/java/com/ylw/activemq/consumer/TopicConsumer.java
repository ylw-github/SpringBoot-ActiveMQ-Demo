package com.ylw.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer {

    @JmsListener(destination = "spring-topic")
    public void receive(String msg) {
        System.out.println("发布与订阅消费者接受，生产者内容:" + msg);
    }
}