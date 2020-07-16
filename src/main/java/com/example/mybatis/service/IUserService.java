package com.example.mybatis.service;

import com.example.mybatis.dto.ResponseDto;
import com.example.mybatis.dto.UserDto;

/**
 * <h2>用户服务</h2>
 *
 * @author March
 * @date 2020/7/15
 */
public interface IUserService {

    /**
     * <h2>获取所有用户列表</h2>
     * @return {@link ResponseDto}
     */
    ResponseDto list();

    /**
     *  <h2>保存用户</h2>
     * @param userDto
     * @return {@link ResponseDto}
     */
    ResponseDto save(UserDto userDto);

    /**
     * <h2>通过主键删除用户</h2>
     * @param id
     * @return {@link ResponseDto}
     */
    ResponseDto delete(String id);
}
