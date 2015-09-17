package com.oldlec.web.dao;

import java.util.List;

import com.oldlec.web.vo.Comment;

public interface CommentDao {

	public List<Comment> getComments(int articleNo);
	
}
