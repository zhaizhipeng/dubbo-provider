package com.ysdrzp.provider.service;

import com.ysdrzp.provider.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * 体验一下Dubbo的实现类
 * @author 翟志鹏
 */
public class HelloServiceImpl implements HelloService {

    /**
     * 打个招呼
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "hello," + name;
    }
}
