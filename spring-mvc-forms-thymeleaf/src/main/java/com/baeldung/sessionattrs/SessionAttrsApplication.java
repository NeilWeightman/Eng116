package com.baeldung.sessionattrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
        exclude = {DataSourceAutoConfiguration.class})
// https://www.baeldung.com/spring-mvc-session-attributes
public class SessionAttrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionAttrsApplication.class, args);
    }
}
