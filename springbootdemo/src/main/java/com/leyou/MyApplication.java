package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 固定的注解
public class MyApplication {
    public static void main(String[] args) {
		
		System.out.println('张三修改了代码');

        SpringApplication.run(MyApplication.class,args);
    }
}
