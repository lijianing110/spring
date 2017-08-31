package com.lijianing.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lijianing on 17-8-31.
 */
@Component
public class Bean2 {
    @Autowired
    private Bean1 bean1;

    public void execute() {
        bean1.play();
    }
}
