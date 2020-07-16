package com.example.mybatis.service;

import com.alibaba.fastjson.JSON;
import com.example.mybatis.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private IUserService service;

    @Test
    void list() {
        System.out.println(JSON.toJSONString(service.list()));
    }

    @Test
    void save() {
        UserDto userDto = new UserDto();
        userDto.setName("hello");
        userDto.setAge(22);
        userDto.setSex("男");
        System.out.println(JSON.toJSONString(service.save(userDto)));
    }
}