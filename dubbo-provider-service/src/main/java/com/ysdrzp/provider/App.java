package com.ysdrzp.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 生产者启动类
 * @author 向往的生活
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        Thread.sleep(Long.MAX_VALUE);
    }

}
