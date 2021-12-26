package com.example.week08homework02.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.week08homework02.dao.TOrderDao;
import com.example.week08homework02.entity.TOrder;
import com.example.week08homework02.service.TOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-12-26 11:03:55
 */
@Service("tOrderService")
public class TOrderServiceImpl implements TOrderService {
    @Resource
    private TOrderDao tOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public List<TOrder> queryById(Integer id,Integer order_no) {
        QueryWrapper<TOrder> tOrderQueryWrapper = new QueryWrapper<>();
        tOrderQueryWrapper.eq("user_id",id);
        tOrderQueryWrapper.eq("order_no",order_no);
        return tOrderDao.selectList(tOrderQueryWrapper);
    }

    @Override
    public TOrder insert(TOrder tOrder) {
        this.tOrderDao.insert(tOrder);
        return tOrder;
    }
}