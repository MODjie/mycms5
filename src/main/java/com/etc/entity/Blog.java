package com.etc.entity;

public class Blog {
	private Integer blogid;
	private String blogtitle;
	private String blogcontent;
	
	public Integer getBlogid() {
		return blogid;
	}
	public void setBlogid(Integer blogid) {
		this.blogid = blogid;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle == null ? null : blogtitle.trim();
	}
	public String getBlogcontent() {
		return blogcontent;
	}
	public void setBlogcontent(String blogcontent) {
		this.blogcontent = blogcontent == null ? null : blogcontent.trim();
	}
	public Blog() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Blog [blogid=" + blogid + ", blogtitle=" + blogtitle + ", blogcontent=" + blogcontent + ", author="
				+ "]";
	}
	public Blog(Integer blogid, String blogtitle, String blogcontent) {
		super();
		this.blogid = blogid;
		this.blogtitle = blogtitle;
		this.blogcontent = blogcontent;
	}
	
}
