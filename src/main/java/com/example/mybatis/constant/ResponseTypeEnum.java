package com.example.mybatis.constant;

/**
 * <h1>响应类型枚举</h1>
 *
 * @author March
 * @date 2020/7/16
 */
public enum  ResponseTypeEnum {

    /** 通用响应成功类型 */
    SUCCESS(0, "响应成功"),

    /** 通用响应失败类型 */
    FAILURE(1, "响应失败"),

    /** 只允许服务层使用 */
    SERVER_ERROR(-1, "服务器错误");

    /** 类型序列号 */
    private int seq;

    /** 类型描述 */
    private String desc;

    ResponseTypeEnum(Integer seq, String desc) {
        this.seq = seq;
        this.desc = desc;
    }

    /** 获取枚举序列号 */
    public int getSeq() {
        return seq;
    }

    /** 获取枚举描述 */
    public String getDesc() {
        return desc;
    }
}
