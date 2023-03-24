package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"pkg2"})
public class Main2 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(Main2.class, args);
    }

}