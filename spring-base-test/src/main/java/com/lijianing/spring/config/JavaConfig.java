package com.lijianing.spring.config;

import com.lijianing.spring.Bean1;
import com.lijianing.spring.Bean3;
import com.lijianing.spring.Bean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lijianing on 17-8-31.
 */
@Configuration
public class JavaConfig {
    @Bean
    public Bean3 getBean3() {
        return new Bean3("auto wired fucks");
    }

    @Bean
    public Bean4 getBean4(Bean3 bean3) {
        return new Bean4(bean3);
    }
}
