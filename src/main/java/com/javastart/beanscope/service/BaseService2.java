package com.javastart.beanscope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Karl
 * @link <a href="https://web.babayan.keenetic.link/">https://web.babayan.keenetic.link</a>
 */

@Service("BaseService2")
public class BaseService2 implements CommandLineRunner {

    @Autowired
    private AccountServicePrototype accountServicePrototype;

    @Autowired
    private AccountServiceSingleton accountServiceSingleton;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("BaseService2");

        System.out.println("---Prototype---");
        System.out.println(accountServicePrototype.getName());

        System.out.println("---Singleton---");
        System.out.println(accountServiceSingleton.getName());

    }

    @PostConstruct
    public void init() {
        System.out.println("*** " + getClass().getName() + " *** init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("*** " + getClass().getName() + " *** destroy method");
    }

//    @PreDestroy
//    public void destroyPrototype() {
//        accountServicePrototype.destroy();
//    }
}
