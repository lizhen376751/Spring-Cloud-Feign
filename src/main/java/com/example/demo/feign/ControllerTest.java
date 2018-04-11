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
    //8761的feign
   @Autowired
    FeignClientTest feignClientTest;

   //8762的feign
   @Autowired
   FeignClientTest002 feignClientTest002;
   //调用8761项目接口
    @RequestMapping("/get8763Test001")
    public String get8763Test001(){
        System.out.println("======================== I am "+port);
        return feignClientTest.sayFromClientOne();
    }
    //调用8762项目接口
    @RequestMapping("/get8763Test002")
    public String get8763Test002(){
        System.out.println("======================== I am "+port);
        return feignClientTest002.get8762Test003();
    }
    //暴露本项目的接口
    @RequestMapping("/get8763Test003")
    public String get8763Test003(){
        System.out.println("======================== I am "+port);
        return "I am 8763 ,you like me!";
    }

}
