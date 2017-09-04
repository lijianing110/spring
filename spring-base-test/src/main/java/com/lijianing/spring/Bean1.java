package com.lijianing.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by lijianing on 17-8-31.
 */
@Component
public class Bean1 {
    @Value("${fuck}")
    private String str;

    public Bean1() {
    }

    public void play() {
        System.out.println(str);
    }
}
