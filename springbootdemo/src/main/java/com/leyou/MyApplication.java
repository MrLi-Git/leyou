package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 固定的注解
public class MyApplication {
    public static void main(String[] args) {
		
		System.out.println('成功了');

        SpringApplication.run(MyApplication.class,args);
    }
}
