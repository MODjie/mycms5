package com.etc.service;

import java.util.List;

import com.etc.entity.Blog;

public interface BlogService {
	List<Blog> getAllBlog();
	int insertBlog(Blog blog);
}
