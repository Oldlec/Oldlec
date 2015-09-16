package com.oldlec.web.dao.mybatis;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.oldlec.web.dao.ArticleDao;
import com.oldlec.web.vo.Article;


public class MyBatisArticleDao implements ArticleDao{

	@Autowired
	private SqlSession session;
	
	
	@Override
	public List<Article> getArticles(int page, String column, String keyword) {
		
		ArticleDao dao = session.getMapper(ArticleDao.class);
		if(column=="" || column==null){
			column = "title";
		}
	
		List<Article> list = dao.getArticles(page, column, keyword);
		
		return list;
	}

	@Override
	public Article getArticle(int no) {
		
		ArticleDao dao = session.getMapper(ArticleDao.class);
		Article article = dao.getArticle(no);
		return article;
	}

	@Override
	public int getTotal() {
		ArticleDao dao = session.getMapper(ArticleDao.class);
		int total = dao.getTotal();
		return total;
	}

}