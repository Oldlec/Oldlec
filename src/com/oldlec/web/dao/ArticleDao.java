package com.oldlec.web.dao;

import java.util.List;

import com.oldlec.web.vo.Article;

public interface ArticleDao {
	
	
	public List<Article> getArticles(int page, String column, String keyword);
	public int getTotalOfArticles(String column, String keyword);
	
	
	
	public Article getArticle(int no);
	
	
	
	public int writeArticle(Article newArticle);
}
