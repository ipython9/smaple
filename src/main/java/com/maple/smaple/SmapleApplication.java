package com.maple.smaple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.maple.smaple.dao.mapper")
public class SmapleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmapleApplication.class, args);
    }

}
