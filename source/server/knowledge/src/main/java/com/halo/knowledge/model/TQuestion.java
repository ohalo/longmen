package com.halo.knowledge.model;

import java.io.Serializable;

/**
 * 问题
 */
public class TQuestion implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1778005358188165378L;

	private Integer id;

    private String title;

    private String remark;

    private String tags;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
