package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-05-12 10:45:03
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 404921783261069575L;

    @ApiModelProperty(name = "id",value = "主键ID", example = "0")
    private Integer id;

    @ApiModelProperty(name = "username",value = "用户名", example = "liuxiaobin")
    private String username;

    @ApiModelProperty(name = "sex",value = "性别", example = "男")
    private String sex;

    @ApiModelProperty(name = "birthday",value = "生日", example = "2019-08-28")
    private Date birthday;

    @ApiModelProperty(name = "address",value = "地址", example = "上海市宝山区大场镇")
    private String address;

    @ApiModelProperty(name = "password",value = "密码", example = "123456")
    private String password;

}