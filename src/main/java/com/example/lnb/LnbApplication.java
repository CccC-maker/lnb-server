package com.example.lnb;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication
@MapperScan("com.example.lnb.mapper")
public class LnbApplication {

    public static void main(String[] args) {
        SpringApplication.run(LnbApplication.class, args);
    }

}
