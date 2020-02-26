package io.mhl.mhl_opencart;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.mhl.mhl_opencart.dao")
public class MhlOpencartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MhlOpencartApplication.class, args);
    }

}