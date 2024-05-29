package com.example.lab01.buoi08.config;

import com.example.lab01.buoi08.entity.AnotherCompany;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public AnotherCompany getAnotherCompany(){
        return new AnotherCompany("Viettel");
    }
}
