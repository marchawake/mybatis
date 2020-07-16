package com.example.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>用户实体类</h1>
 *
 * @author March
 * @date 2020/7/15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    /** 用户 id */
    private String id;

    /** 用户名称 */
    private String name;

    /** 用户年龄 */
    private Integer age;

    /** 用户性别 */
    private String sex;
}
