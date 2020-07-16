package com.example.mybatis.constant;

/**
 * 持久化状态
 *
 * @author March
 * @date 2020/7/16
 */
public abstract class PersistentState {

    /** 删除状态 */
    public static final String DELETE_SUCCESS = "删除成功";
    public static final String DELETE_FAILURE = "删除失败";

    /** 添加状态 */
    public static final String INSERT_SUCCESS = "添加成功";
    public static final String INSERT_FAILURE = "添加失败";

    /** 更新状态 */
    public static final String UPDATE_SUCCESS = "修改成功";
    public static final String UPDATE_FAILURE = "修改失败";


}
