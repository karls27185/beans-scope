package com.javastart.beanscope.service;

import org.springframework.stereotype.Service;

/**
 * @author Karl
 * @link <a href="https://web.babayan.keenetic.link/">https://web.babayan.keenetic.link</a>
 */

@Service
public class AccountServiceSingleton {

    private String name = "Lori";

    public void changeName(String name){
        this.name = name + " ----- " + name;
    }

    public String getName() {
        return name;
    }
}
