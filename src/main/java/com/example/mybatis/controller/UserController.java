package com.example.mybatis.controller;

import com.example.mybatis.dto.ResponseDto;
import com.example.mybatis.dto.UserDto;
import com.example.mybatis.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户请求响应控制器
 *
 * @author March
 * @date 2020/7/16
 */
@Slf4j
@RestController
@RequestMapping("/mybatis")
public class UserController {

    /** 用户服务接口 */
    private final IUserService service;

    @Autowired
    public UserController(IUserService service) {
        this.service = service;
    }

    /**
     * <h2>获取用户列表</h2>
     * @return {@link ResponseDto}
     */
    @RequestMapping("/list")
    public ResponseDto list() {
        return service.list();
    }

    @PostMapping("/save")
    public ResponseDto save(@RequestBody UserDto userDto) {
        return service.save(userDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable String id) {
        return service.delete(id);
    }


}
