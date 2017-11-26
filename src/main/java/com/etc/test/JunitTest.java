package com.etc.test;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etc.dao.BlogDao;
import com.etc.entity.Blog;
import com.etc.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class JunitTest {
	@Resource
	BlogDao blogdao = null;
	@Resource
	private BlogService blogService;
	
	@Test
	public void test01() {
		List<Blog> blog = blogdao.getAllBlog();
		System.out.println(blog);
	}
	
	
	@Test
	public void test02() {
		List<Blog> blog = blogService.getAllBlog();
		int a = 2;
		if(a==1){
			System.out.println(1);
		}
		System.out.println(blog);
	}

	@Test
	public void test03() {
		blogService.insertBlog(new Blog(1, "ÊÂÎñ", "²åÈëÈÕÖ¾"));
	}
	@Test
	public void test04() {
		PageHelper.startPage(1, 2);
		List<Blog> blog = blogService.getAllBlog();
		PageInfo<Blog> p=new PageInfo<Blog>(blog);
		System.out.println(p);
	}
}
