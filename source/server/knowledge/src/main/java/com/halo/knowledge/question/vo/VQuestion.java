package com.halo.knowledge.question.vo;

import java.io.Serializable;

/**
 * 问题 vo
 * 
 * @author Administrator
 *
 */
public class VQuestion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2145964245252383989L;

	/**
	 * id 題目唯一标识
	 */
	private Integer id;

	/**
	 *  题目
	 */
	private String title;

	/**
	 *  标签，中间用逗号隔开
	 */
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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
}