package com.cxhello.hero;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cxhello.hero.mapper")
@SpringBootApplication
public class HeroGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroGatewayApplication.class, args);
    }

}
