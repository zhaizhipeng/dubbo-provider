package com.ysdrzp.provider;

import com.ysdrzp.provider.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 翟志鹏
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        context.start();

        HelloService helloService = (HelloService) context.getBean("helloService");
        System.out.println(helloService);
        Thread.sleep(1000000000);
    }

}
