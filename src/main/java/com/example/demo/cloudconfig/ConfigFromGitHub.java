package com.example.demo.cloudconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Cloud Config 配置中心客户端
 * Created by lizhen on 2018/4/11 0011.
 * RefreshScope 动态刷新  必须是post请求  注意！注意！注意！
 * http://localhost:8763/refresh
 */
@RestController
@RefreshScope
public class ConfigFromGitHub {
    //返回从配置中心读取的foo变量的值
    @Value("${foo}")
    String foo;
    @Value("${name}")
    String name;

    @RequestMapping(value = "/getCongig")
    public String hi() {
        return name + foo;
    }

}
