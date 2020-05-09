package com.son.quizlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
// Work with Eureka
@EnableDiscoveryClient
// Manually refresh when you push something to repo config: call /refresh
// works on an @Configuration class
@RefreshScope

@EnableResourceServer

// tells Spring Cloud Stream to bind the application to a message broker
@EnableBinding(Source.class) // enable this to use default output channel
public class LE_QuizletMain {
    public static void main(String[] arguments) {
        SpringApplication.run(LE_QuizletMain.class, arguments);
    }
}
