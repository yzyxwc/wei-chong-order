package com.wei.chong.root.weichongorder.service.impl;

import com.wei.chong.root.weichongorder.feign.HelloFeign;
import com.wei.chong.root.weichongorder.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wc
 * @date 2020/5/9 15:18
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    HelloFeign helloFeign;
    @Override
    public String hello(String userName) {
        return helloFeign.hello(userName);
    }
}
