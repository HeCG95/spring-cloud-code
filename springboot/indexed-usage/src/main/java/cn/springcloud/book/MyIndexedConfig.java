package cn.springcloud.book;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"cn.springcloud.book"}) 扫描不到Controller
@ComponentScan(basePackages = {"cn.springcloud"})
public class MyIndexedConfig {
}
