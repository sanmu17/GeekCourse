package com.example.week07homework09.entity;

import java.io.Serializable;

/**
 * (Table1)实体类
 *
 * @author makejava
 * @since 2021-12-19 17:31:02
 */
public class Table1 implements Serializable {
    private static final long serialVersionUID = 232942143518610436L;
    
    private Integer id;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}