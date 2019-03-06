package com.halo.knowledge.question.model;

import java.io.Serializable;

public class TQuestionAnswer implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -130063365212417160L;

	private Integer id;

    private String remark;

    private String remarkDesc;

    private Integer questionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemarkDesc() {
        return remarkDesc;
    }

    public void setRemarkDesc(String remarkDesc) {
        this.remarkDesc = remarkDesc;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}
