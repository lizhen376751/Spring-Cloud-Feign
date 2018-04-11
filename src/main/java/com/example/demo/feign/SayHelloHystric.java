package com.example.demo.feign;

import org.springframework.stereotype.Component;

/**
 * Created by lizhen on 2018/4/10 0010.
 */
@Component
public class SayHelloHystric implements FeignClientTest {
    @Override
    public String sayFromClientOne() {
        return "sorry ,Error!!!";
    }
}
