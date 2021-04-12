package com.github.sqlaudit.base.entity;

/**
 * @author Jin Wang
 * @version 1.0
 * @date 2021-04-12 4:55 下午
 */
public interface IResultCode {

    /**
     * 响应码
     *
     * @return Integer
     */
    int getCode();

    /**
     * 响应消息
     *
     * @return String
     */
    String getMessage();
}
