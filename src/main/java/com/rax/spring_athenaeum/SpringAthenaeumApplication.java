package com.rax.spring_athenaeum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringAthenaeumApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAthenaeumApplication.class, args);
    }

}
