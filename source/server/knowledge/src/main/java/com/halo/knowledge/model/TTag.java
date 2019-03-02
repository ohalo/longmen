package com.halo.knowledge.model;

import java.io.Serializable;

public class TTag implements Serializable {

    /**
     * 唯一标识
     */
    private Integer id;

    /**
     *  标签名称
     */
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