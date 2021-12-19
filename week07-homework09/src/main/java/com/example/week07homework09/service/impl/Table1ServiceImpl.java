package com.example.week07homework09.service.impl;

import com.example.week07homework09.dao.Table1Dao;
import com.example.week07homework09.entity.Table1;
import com.example.week07homework09.enums.CurDataSource;
import com.example.week07homework09.enums.DataSourceChanges;
import com.example.week07homework09.service.Table1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (Table1)表服务实现类
 *
 * @author makejava
 * @since 2021-12-19 17:31:04
 */
@Service("table1Service")
public class Table1ServiceImpl implements Table1Service {
    @Resource
    private Table1Dao table1Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    @CurDataSource(name = DataSourceChanges.SLAVE)
    public Table1 queryById(Integer id) {
        return this.table1Dao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    @CurDataSource(name = DataSourceChanges.SLAVE)
    public List<Table1> queryAllByLimit(int offset, int limit) {
        return this.table1Dao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param table1 实例对象
     * @return 实例对象
     */
    @Override
    @CurDataSource(name = DataSourceChanges.MASTER)
    public Table1 insert(Table1 table1) {
        this.table1Dao.insert(table1);
        return table1;
    }

    /**
     * 修改数据
     *
     * @param table1 实例对象
     * @return 实例对象
     */
    @Override
    @CurDataSource(name = DataSourceChanges.MASTER)
    public Table1 update(Table1 table1) {
        this.table1Dao.update(table1);
        return this.queryById(table1.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    @CurDataSource(name = DataSourceChanges.MASTER)
    public boolean deleteById(Integer id) {
        return this.table1Dao.deleteById(id) > 0;
    }
}