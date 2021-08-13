package com.healthmanagement.sportmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.healthmanagement.sportmanage.dao")
@SpringBootApplication
public class SportmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportmanageApplication.class, args);
    }

}
