package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void teste() {
        System.out.println("");
        System.out.println("teste 1");
        System.out.println("teste 2");
        System.out.println("teste 3");
    }


}
