package com.oldlec.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.oldlec.web.dao.CommentDao;
import com.oldlec.web.vo.Comment;

public class MyBatisCommentDao implements CommentDao{

	
	@Autowired
	private SqlSession session;
	
	
	@Override
	public List<Comment> getComments(int articleNo) {
		
		CommentDao cdao = session.getMapper(CommentDao.class);
		List<Comment> comments = cdao.getComments(articleNo);
		
		return comments;
	}

}
