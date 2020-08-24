package com.wei.chong.root.weichongorder.controller;

import com.wei.chong.root.weichongorder.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wc
 * @date 2020/5/9 15:14
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/app")
    public String name(@RequestParam("name") String userName){
        return helloService.hello(userName);
    }

}
