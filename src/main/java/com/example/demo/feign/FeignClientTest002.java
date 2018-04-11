package com.example.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/4/11 0011.
 */
@FeignClient(value = "service-8762",fallback = SayHelloHystric.class)
public interface FeignClientTest002 {
    @RequestMapping(value = "/get8762Test003")
    String get8762Test003();
}
