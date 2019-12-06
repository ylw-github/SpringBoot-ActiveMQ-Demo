package com.ylw.activemq.producer;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class QueueConfig {
    @Value("${queue}")
    private String queue;

    @Bean
    public Queue logQueue() {
        return new ActiveMQQueue(queue);
    }
}
