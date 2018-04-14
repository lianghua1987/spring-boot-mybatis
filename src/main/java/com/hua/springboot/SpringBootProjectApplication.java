package com.hua.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hua.*")
@MapperScan(basePackages = "com.hua.springboot.dao")
public class SpringBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProjectApplication.class, args);
    }
}
