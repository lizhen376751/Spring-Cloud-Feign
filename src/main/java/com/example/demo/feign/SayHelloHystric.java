package com.example.demo.feign;

import org.springframework.stereotype.Component;

/**
 * Created by lizhen on 2018/4/10 0010.
 */
@Component
public class SayHelloHystric implements FeignClientTest , FeignClientTest002 {
    @Override
    public String sayFromClientOne() {
        return "FeignClientTest ,sorry ,Error!!!";
    }

    @Override
    public String get8762Test003() {
        return  "FeignClientTest002,sorry ,Error!!!";
    }
}
