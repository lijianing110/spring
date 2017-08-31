package com.lijianing.spring.test;

import com.lijianing.spring.Bean4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springbasetest.xml");
        Bean4 bean4 = context.getBean(Bean4.class);
        bean4.execute();
    }
}
