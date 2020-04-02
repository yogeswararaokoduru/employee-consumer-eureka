package com.org.yogi;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.org.yogi.controllers.ConsumerClientController;

@SpringBootApplication
public class ConsumerClientApplication {

    public static void main(String[] args) throws RestClientException, IOException {
        ApplicationContext ctx = SpringApplication.run(
                ConsumerClientApplication.class, args);

        ConsumerClientController consumerControllerClient = ctx.getBean(ConsumerClientController.class);
        System.out.println(consumerControllerClient);
        consumerControllerClient.getEmployee();
    }

    @Bean
    public ConsumerClientController consumerControllerClient() {
        return new ConsumerClientController();
    }
}