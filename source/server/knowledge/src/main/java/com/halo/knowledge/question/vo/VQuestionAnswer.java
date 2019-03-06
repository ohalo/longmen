package com.halo.knowledge.question.vo;

import java.io.Serializable;

public class VQuestionAnswer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3520805328622627309L;

	private String remark;

	private String remarkDesc;

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

}
