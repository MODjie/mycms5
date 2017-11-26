package com.etc.entity;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BlogDao {
	/**
	 * 通过id查找blog
	 * @param id
	 * @return
	 */
	public Blog selectBlog(int id);
	/**
	 * 查找所有的blog
	 * @return
	 */
	public List<Blog> selectAllBlog();
	/**
	 * 通过title模糊查询
	 * @return
	 */
	public List<Blog> selectBlogByTitle(String title);
	/**
	 * 动态sql查询
	 * @param blog
	 * @return
	 */
	public List<Blog> selectAllBlogDymSql(Blog blog);
	/**
	 * 增加blog
	 * @param blog
	 * @return
	 */
	public boolean insertBlog(Blog blog);
	/**
	 * 修改blog
	 * @param blog
	 * @return
	 */
	public boolean updateBlog(Blog blog);
	/**
	 * 动态更新
	 * @param blog
	 * @return
	 */
	public boolean updateBlogDymSql(Blog blog);
	/**
	 * 删除blog
	 * @param blog
	 * @return
	 */
	public boolean deleteBlog(int id);
	/**
	 * 删除blog
	 * @param blog
	 * @return
	 */
	public boolean deleteBlogDymSql(List deletList);
	/**
	 * 分页查询
	 * @param id
	 * @return
	 */
	public List<Blog> selectBlogByPage(@Param(value="start")int start,@Param(value="pageSize")int pageSize);
}
