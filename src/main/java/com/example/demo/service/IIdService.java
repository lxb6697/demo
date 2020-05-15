package com.example.demo.service;

import java.util.UUID;

/**
 * Id生成器
 *
 * @author defei
 * @data 6/25/18.
 */
public interface IIdService {

    /**
     * 获取一个唯一的long类型的id
     *
     * @return id
     */
    Long nextLongId();

    /**
     * 获取一个唯一的String类型的id
     *
     * @return id
     */
    String nextStringId();

    /**
     * 获取UUID，没有'-'
     *
     * @return id
     */
    default String nextUUID(){

        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
