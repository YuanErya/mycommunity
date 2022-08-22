package com.yuanerya.mycommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuanerya.mycommunity.mapper")
public class MycommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycommunityApplication.class, args);
    }

}
