package com.lijianing.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lijianing on 17-8-31.
 */
public class Bean4 {
    private Bean3 bean3;

    public Bean4(Bean3 bean3) {
        this.bean3 = bean3;
    }

    public void execute() {
        bean3.play();
    }
}
