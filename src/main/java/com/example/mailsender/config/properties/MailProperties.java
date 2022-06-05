package com.example.mailsender.config.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Component
@ConfigurationProperties(prefix = "spring.mail")
public class MailProperties {

    private String host;
    private int port;
    private String username;
    private String password;

}
