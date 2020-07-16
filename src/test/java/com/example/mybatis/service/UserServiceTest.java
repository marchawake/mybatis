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
        userDto.setId("E227OIPN");
        userDto.setName("测试修改");
        userDto.setAge(23);
        userDto.setSex("女");
        System.out.println(JSON.toJSONString(service.save(userDto)));
    }

    @Test
    void delete() {
        System.out.println(JSON.toJSONString(service.delete("3AfUz9Vx")));
    }
}