package com.javastart.beanscope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * @author Karl
 * @link <a href="https://web.babayan.keenetic.link/">https://web.babayan.keenetic.link</a>
 */

@Service
public class BaseService implements CommandLineRunner {

    @Autowired
    private AccountServicePrototype accountServicePrototype;

    @Autowired
    private AccountServiceSingleton accountServiceSingleton;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("BaseService");

        System.out.println("---Prototype---");
        accountServicePrototype.changeName("Bax");
        System.out.println(accountServicePrototype.getName());

        System.out.println("---Singleton---");
        accountServiceSingleton.changeName("Bax");
        System.out.println(accountServiceSingleton.getName());

    }
}
