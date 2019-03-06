package com.halo.knowledge.question.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 具体问题
 * 
 * @author Administrator
 *
 */
public class VQuestionSpecific implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2145964245252383989L;

	/**
	 * id 題目唯一标识
	 */
	private Integer id;

	/**
	 * 题目
	 */
	private String title;

	/**
	 * 題目描述
	 */
	private String remark;

	/**
	 * 标签，中间用逗号隔开
	 */
	private String tags;

	/**
	 * 问题答案
	 */
	private List<VQuestionAnswer> answers;

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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<VQuestionAnswer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<VQuestionAnswer> answers) {
		this.answers = answers;
	}
	
	
}