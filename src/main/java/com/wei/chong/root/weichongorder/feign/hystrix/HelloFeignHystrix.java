package com.wei.chong.root.weichongorder.feign.hystrix;

import com.wei.chong.root.weichongorder.feign.HelloFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wc
 * @date 2020/5/9 16:24
 */
@Component
public class HelloFeignHystrix implements HelloFeign {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sever is miss";
    }
}
