package com.afeiluo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "用户类")
public class User {

    @ApiModelProperty(value = "ID", name = "id", dataType = "Integer", example = "1")
    private Integer id;
    @ApiModelProperty(value = "姓名", name = "name", dataType = "String", example = "王菲")
    private String name;
    @ApiModelProperty(value = "年龄", name = "age", dataType = "Integer", example = "20")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
