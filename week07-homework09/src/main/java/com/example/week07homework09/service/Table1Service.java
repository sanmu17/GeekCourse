package com.example.week07homework09.service;

import com.example.week07homework09.entity.Table1;

import java.util.List;



/**
 * (Table1)表服务接口
 *
 * @author makejava
 * @since 2021-12-19 17:31:04
 */
public interface Table1Service {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Table1 queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Table1> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param table1 实例对象
     * @return 实例对象
     */
    Table1 insert(Table1 table1);

    /**
     * 修改数据
     *
     * @param table1 实例对象
     * @return 实例对象
     */
    Table1 update(Table1 table1);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}