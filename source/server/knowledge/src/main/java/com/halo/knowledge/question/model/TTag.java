package com.halo.knowledge.question.model;

import java.io.Serializable;

public class TTag implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7942798881327287693L;

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
