package com.ysdrzp.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 生产者启动类
 * @author 向往的生活
 */
public class ProviderApp {

    public static void main(String[] args) throws InterruptedException {
        new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        System.out.println("服务启动啦...");
        Thread.sleep(Long.MAX_VALUE);
    }

}
