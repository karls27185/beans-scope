package com.javastart.beanscope;

import com.javastart.beanscope.service.BaseService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Karl
 * @link <a href="https://web.babayan.keenetic.link/">https://web.babayan.keenetic.link</a>
 */

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        BaseService2 baseService2 = (BaseService2) applicationContext.getBean("BaseService2");
//        System.out.println("baseService2.run()");
        baseService2.run();

        AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();
        beanFactory.destroyBean(baseService2);
    }
}
