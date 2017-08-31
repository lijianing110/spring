package com.lijianing.spring.config;

import com.lijianing.spring.Bean1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lijianing on 17-8-31.
 */
@Configuration
@ComponentScan(basePackageClasses = {Bean1.class})
public class SpringConfigAutoWired {
}
