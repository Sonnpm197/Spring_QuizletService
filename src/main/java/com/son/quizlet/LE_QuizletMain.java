package com.son.quizlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
// Work with Eureka
@EnableDiscoveryClient
// Manually refresh when you push something to repo config: call /refresh
// works on an @Configuration class
@RefreshScope
public class LE_QuizletMain {
    public static void main(String[] arguments) {
        SpringApplication.run(LE_QuizletMain.class, arguments);
    }
}
