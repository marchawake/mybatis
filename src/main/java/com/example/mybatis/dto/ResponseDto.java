package com.example.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用数据传输对象
 *
 * @author March
 * @date 2020/7/15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    /** 0 代表响应成功，-1 代表响应失败 */
    private Integer statusCode;

    /** 状态码对应的信息 */
    private String message;

    /** 响应数据 */
    private Object data;

    public ResponseDto(Object data) {
        this.data = data;
        ResponseDto.success();
    }

    /**
     * <h2>空响应</h2>
     */
    public static ResponseDto success() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStatusCode(0);
        responseDto.setMessage("Success");
        return responseDto;
    }

    /**
     * <h2>错误响应</h2>
     */
    public static ResponseDto failure(String message) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStatusCode(-1);
        responseDto.setMessage(message);
        return responseDto;
    }

}
