package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.Blog;
import com.etc.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class BlogController {
	@Resource
	private BlogService blogService;

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public ModelAndView showBlogs() {
		List<Blog> list = blogService.getAllBlog();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "showByPage", method = RequestMethod.GET)
	public ModelAndView showBlogsByPage(@RequestParam(required = true, defaultValue = "1") Integer page,
			@RequestParam(required = false, defaultValue = "2") Integer pageSize) {
		PageHelper.startPage(page, pageSize); 
		List<Blog> list = blogService.getAllBlog();
		ModelAndView mv = new ModelAndView("index");
		
		PageInfo<Blog> p=new PageInfo<Blog>(list); 
		mv.addObject("page", p);
		return mv;
	}
}
