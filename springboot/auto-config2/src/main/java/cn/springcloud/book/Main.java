package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import pkg.WebConfig;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(WebConfig.class, args);
    }

}