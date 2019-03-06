package com.halo.knowledge.question.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.halo.knowledge.question.vo.VQuestion;
import com.halo.knowledge.question.vo.VQuestionSpecific;

@RestController
@RequestMapping("/k/question/")
public class KQuestionController {

	/**
	 *    标签可以传输多个 ，中间用中文逗号隔开 ，例如 ： 软件，编程
	 * 
	 * @param tags
	 */
	@RequestMapping("queryByTags")
	public List<VQuestion> queryQuestionByTags(String tags) {
		return null;
	}

	/**
	 *    按题目搜索列表
	 * 
	 * @param title
	 */
	@RequestMapping("queryByTitle")
	public List<VQuestion> queryQuestionByTitle(String title) {
		return null;
	}

	/**
	 *   获取具体的问题信息
	 * 
	 * @param id
	 */
	@RequestMapping("querySpecificById")
	public VQuestionSpecific queryQuestionSpecificById(Integer id) {
		return null;
	}
}
