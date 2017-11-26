package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.etc.entity.Blog;

//@Repository(value="blogDao")
public interface BlogDao {  	
    List<Blog> getAllBlog();
    int insertBlog(Blog blog);
}