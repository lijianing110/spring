package com.lijianing.spring.config;

import com.lijianing.spring.Bean1;
import com.lijianing.spring.Bean3;
import com.lijianing.spring.Bean4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by lijianing on 17-8-31.
 */
@Configuration
@PropertySource("prop.properties")
public class JavaConfig {

    @Autowired
    Environment environment;
    @Bean
    public Bean3 getBean3() {
        return new Bean3(environment.getProperty("fuck"));
    }

    @Bean
    public Bean4 getBean4(Bean3 bean3) {
        return new Bean4(bean3);
    }
}
