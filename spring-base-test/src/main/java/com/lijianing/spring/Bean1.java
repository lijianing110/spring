package com.lijianing.spring;

import org.springframework.stereotype.Component;

/**
 * Created by lijianing on 17-8-31.
 */
@Component
public class Bean1 {
    public void play() {
        System.out.println("auto wire fucks");
    }
}
