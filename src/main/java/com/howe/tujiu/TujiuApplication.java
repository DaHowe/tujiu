package com.howe.tujiu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.howe.tujiu.mapper")
public class TujiuApplication {

    public static void main(String[] args) {
        SpringApplication.run(TujiuApplication.class, args);
    }

}
