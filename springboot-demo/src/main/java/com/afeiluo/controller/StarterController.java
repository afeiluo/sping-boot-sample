package com.afeiluo.controller;

import com.afeiluo.sevice.HelloService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = "测试starter")
@RestController
@RequestMapping("starter")
public class StarterController {

    @Autowired
    private HelloService helloService;

    @ApiIgnore
    @GetMapping("hello")
    public String service() {
        return helloService.sayHello();
    }

}

