package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-05-12 10:45:08
 */
@RestController
@RequestMapping("user")
@Api(value = "user处理接口", tags = "user相关")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ApiOperation(value = "value：根据id获取用户", notes = "notes：根据id获取用户", httpMethod = "GET")
    public User selectOne(
            @ApiParam(required=true, name="id", value="用户id")
            @RequestParam(name = "id", required=true) Integer id) {
        return this.userService.queryById(id);
    }

}