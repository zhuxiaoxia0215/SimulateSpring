package com.simulate.service;

import com.simulate.spring.ApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext(AppConfig.class);

        System.out.println(context.getBean("userService"));
        System.out.println(context.getBean("userService"));
        System.out.println(context.getBean("userService"));
        System.out.println(context.getBean("userService"));
    }
}
