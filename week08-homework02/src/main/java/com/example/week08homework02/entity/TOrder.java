package com.example.week08homework02.entity;

import lombok.ToString;

import java.io.Serializable;

/**
 * (TOrder)实体类
 *
 * @author makejava
 * @since 2021-12-26 11:03:54
 */
@ToString
public class TOrder implements Serializable {
    private static final long serialVersionUID = -91503016777671783L;
    
    private Long orderNo;
    
    private Integer id;
    
    private Double price;
    
    private Object deleted;
    
    private Integer userId;


    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Object getDeleted() {
        return deleted;
    }

    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}