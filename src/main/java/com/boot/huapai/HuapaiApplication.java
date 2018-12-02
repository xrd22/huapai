package com.boot.huapai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.huapai.scan.*")
@MapperScan({"com.huapai.mybatis.dao","com.huapai.mybatis.daoext"})
public class HuapaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuapaiApplication.class, args);
    }
}
