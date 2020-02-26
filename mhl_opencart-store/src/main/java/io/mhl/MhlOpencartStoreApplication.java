package io.mhl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.mhl.dao")
public class MhlOpencartStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(MhlOpencartStoreApplication.class, args);
    }

}
