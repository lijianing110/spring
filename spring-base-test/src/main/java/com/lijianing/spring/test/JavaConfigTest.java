package com.lijianing.spring.test;

import com.lijianing.spring.Bean4;
import com.lijianing.spring.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lijianing on 17-8-31.
 */
public class JavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Bean4 bean4 = context.getBean(Bean4.class);
        bean4.execute();
    }
}
