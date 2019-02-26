package com.dhw.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 段华微
 * @version V1.0
 * @description 描述
 * @ClassName: RabbitConfig
 * @Date 2018/9/11 Copyright(c) 2015 www.wallet.com All rights
 * reserved
 */
@Configuration
public class RabbitConfig {
//    @Bean
//    public Queue Queue() {
//        return new Queue("hello");
//    }

    @Bean
    public Queue Queue() {
        return new Queue("object");
    }

}
