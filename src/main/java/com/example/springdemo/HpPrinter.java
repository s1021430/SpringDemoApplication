package com.example.springdemo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer, InitializingBean {

    @Value("${printer.name}")
    private String name;
    @Value("${printer.count:20}")
    private int count;

    @PostConstruct
    //PostConstruct method should be public, return void and could not contains any parameter.
    public void initialize(){
        //count = 5;
    }

    @Override
    //Don't use InitializingBean with @PostConstruct at the same time.
    public void afterPropertiesSet() throws Exception {
        //count = 20;
    }

    @Override
    public void print(String message) {
        count--;
        System.out.println(name + ": " + message);
        System.out.println("剩餘使用次數: " + count);
    }
}
