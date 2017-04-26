package com.dubboclub.dk.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

//@EnableCaching
@EnableAutoConfiguration
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/dubbo-all.xml", "classpath:META-INF/spring/*.xml"})
@ComponentScan({"com.dubboclub.dk"})
public class CheryWebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CheryWebApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CheryWebApplication.class, args);
    }
}
