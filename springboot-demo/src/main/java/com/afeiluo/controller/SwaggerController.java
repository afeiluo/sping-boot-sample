package com.afeiluo.controller;

import com.afeiluo.model.User;
import com.afeiluo.service.SwaggerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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

    @ApiOperation(value = "获取所有用户接口")
    @GetMapping("users")
    public List<User> getAll() {
        return swaggerService.getUsers();
    }

    @ApiOperation(value = "增加或更新用户接口")
    @PostMapping("user")
    public Boolean addOrUpdate(@RequestBody User user) {
        return swaggerService.addOrUpdateUser(user);
    }

    @ApiOperation(value = "增加用户接口")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "form", dataType = "string", name = "name", value = "用户名", example = "ben"),
            @ApiImplicitParam(paramType = "form", dataType = "int", name = "age", value = "年龄", example = "20")
    })
    @PostMapping("v1/user")
    public Boolean add(String name, Integer age) {
        return swaggerService.add(name, age);
    }
}