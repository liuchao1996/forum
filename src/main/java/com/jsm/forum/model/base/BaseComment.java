package com.jsm.forum.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseComment<M extends BaseComment<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setUserId(java.lang.Integer userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	public M setForumPostsId(java.lang.Integer forumPostsId) {
		set("forum_posts_id", forumPostsId);
		return (M)this;
	}

	public java.lang.Integer getForumPostsId() {
		return getInt("forum_posts_id");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	public java.lang.String getContent() {
		return getStr("content");
	}

	public M setCreateDate(java.lang.String createDate) {
		set("create_Date", createDate);
		return (M)this;
	}

	public java.lang.String getCreateDate() {
		return getStr("create_Date");
	}

	public M setLike(java.lang.Integer like) {
		set("like", like);
		return (M)this;
	}

	public java.lang.Integer getLike() {
		return getInt("like");
	}

}