package com.example.demo.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
@RestController
public class ControllerTest {
    @Value("${server.port}")
    private String port;
   @Autowired
    FeignClientTest feignClientTest;
    @RequestMapping("/get8763")
    public String sayHello(){
        System.out.println("======================== I am "+port);
        return feignClientTest.sayFromClientOne();
    }
}
