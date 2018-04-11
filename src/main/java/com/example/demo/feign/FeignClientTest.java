package com.example.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lizhen on 2018/4/10 0010.
 */
@FeignClient(value = "service-8761",fallback = SayHelloHystric.class)
public interface FeignClientTest {
    @RequestMapping(value = "/get8761")
    String sayFromClientOne();
}
