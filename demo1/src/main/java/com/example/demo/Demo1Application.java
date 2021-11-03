package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
//        SpringApplication.run(Demo1Application.class, args);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//        MyBean con=applicationContext.getBean(MyBean.class);
//        System.out.println(con.toString());

        TokenMachine machine = applicationContext.getBean(TokenMachine.class);
        machine.findToken();
        machine = applicationContext.getBean(TokenMachine.class);
        machine.findToken();
//        applicationContext.close();
    }

}
