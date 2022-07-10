package com.example.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Printer myPrinter(){
        return new HpPrinter();
    }
}
