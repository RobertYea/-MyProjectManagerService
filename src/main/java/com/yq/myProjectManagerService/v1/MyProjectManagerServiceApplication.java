package com.yq.myProjectManagerService.v1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MyProjectManagerServiceApplication
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/16
 */
@SpringBootApplication
@MapperScan("com.yq.myProjectManagerService.v1.mapper")
public class MyProjectManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectManagerServiceApplication.class, args);
    }
}
