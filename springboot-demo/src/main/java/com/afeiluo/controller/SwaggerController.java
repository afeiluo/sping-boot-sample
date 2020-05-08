package com.afeiluo.controller;

import com.afeiluo.model.User;
import com.afeiluo.service.SwaggerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "测试swagger")
@RestController
@RequestMapping(value = "swagger")
public class SwaggerController {

    @Autowired
    private SwaggerService swaggerService;

    @ApiOperation(value = "获取所有用户")
    @GetMapping("users")
    public List<User> getAll() {
        return swaggerService.getUsers();
    }

    @PostMapping("user")
    public Boolean addOrUpdate(@RequestBody User user) {
        return swaggerService.addOrUpdateUser(user);
    }
}