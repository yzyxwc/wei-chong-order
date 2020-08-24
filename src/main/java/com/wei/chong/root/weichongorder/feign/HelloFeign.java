package com.wei.chong.root.weichongorder.feign;

import com.wei.chong.root.weichongorder.feign.hystrix.HelloFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wc
 * @date 2020/5/9 15:12
 */
@FeignClient(name = "server-user",fallback = HelloFeignHystrix.class)
public interface HelloFeign {

    @GetMapping("/test/hello")
    String hello(@RequestParam(value = "name") String name);
}
