package com.zr.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

  
public class ApplicationMain {
    public static void main(String[] args) throws Exception {
         SpringApplication.run(ApplicationMain.class, args);
     }
}