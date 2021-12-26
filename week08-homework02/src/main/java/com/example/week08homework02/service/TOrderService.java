package com.example.week08homework02.service;

import com.example.week08homework02.entity.TOrder;

import java.util.List;

/**
 * (TOrder)表服务接口
 *
 * @author makejava
 * @since 2021-12-26 11:03:55
 */
public interface TOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    List<TOrder> queryById(Integer id,Integer order_no);


    /**
     * 新增数据
     *
     * @param tOrder 实例对象
     * @return 实例对象
     */
    TOrder insert(TOrder tOrder);


}