package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.etc.dao.BlogDao;
import com.etc.dao.LogMapper;
import com.etc.entity.Blog;
import com.etc.entity.Log;
import com.etc.service.BlogService;
import com.etc.service.LogService;

@Service
public class BlogServiceImpl implements BlogService{
	@Resource
	private BlogDao blogDao;
	@Resource
	private LogService logService;
	public List<Blog> getAllBlog() {
		// TODO Auto-generated method stub
		List<Blog> blogs = blogDao.getAllBlog();
		return blogs;
	}
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public int insertBlog(Blog blog) {
		// TODO Auto-generated method stub
		int flag =blogDao.insertBlog(blog);
		logService.insert(new Log(1,"2017年11月14日10:52:17  插入操作"));
		return flag;
	}

}
