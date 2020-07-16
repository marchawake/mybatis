package com.example.mybatis.dto;

import com.example.mybatis.constant.ResponseTypeEnum;
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

    /** 状态码 */
    private int state;

    /** 状态码对应的信息描述 */
    private String desc;

    /** 响应数据 */
    private Object data;

    public ResponseDto(Object data) {
        this.data = data;
        this.state = ResponseTypeEnum.SUCCESS.getSeq();
        this.desc = ResponseTypeEnum.SUCCESS.getDesc();
    }

    /**
     * <h2>成功空响应</h2>
     */
    public static ResponseDto success() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setState(ResponseTypeEnum.SUCCESS.getSeq());
        responseDto.setDesc(ResponseTypeEnum.SUCCESS.getDesc());
        return responseDto;
    }

    /**
     * <h2>错误空响应</h2>
     */
    public static ResponseDto failure() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setState(ResponseTypeEnum.FAILURE.getSeq());
        responseDto.setDesc(ResponseTypeEnum.FAILURE.getDesc());
        return responseDto;
    }

    /**
     * <h2>服务器错误</h2>
     */
    public static ResponseDto serverError() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setState(ResponseTypeEnum.SERVER_ERROR.getSeq());
        responseDto.setDesc(ResponseTypeEnum.SERVER_ERROR.getDesc());
        return responseDto;
    }

}
