package com.lijianing.spring.test;

import com.lijianing.spring.Bean2;
import com.lijianing.spring.Bean4;
import com.lijianing.spring.config.SpringConfigAutoWired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lijianing on 17-8-31.
 */
public class TestAutoWired {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAutoWired.class);
        Bean2 bean2 = context.getBean(Bean2.class);
        bean2.execute();
    }
}
