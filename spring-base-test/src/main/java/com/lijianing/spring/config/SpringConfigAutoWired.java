package com.lijianing.spring.config;

import com.lijianing.spring.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by lijianing on 17-8-31.
 */
@Configuration
@ComponentScan(basePackageClasses = {Bean1.class})
@PropertySource("prop.properties")
public class SpringConfigAutoWired {
    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
