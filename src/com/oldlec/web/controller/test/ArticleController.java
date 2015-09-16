package com.oldlec.web.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oldlec.web.dao.ArticleDao;
import com.oldlec.web.dao.UserDao;
import com.oldlec.web.vo.Article;

@Controller
@RequestMapping("/article/*")
public class ArticleController {

	@Autowired
	private UserDao udao;
	
	@Autowired
	private ArticleDao adao;
	
	@RequestMapping(value="article-list", method=RequestMethod.GET)
	public String login(Model model)
	{
		List<Article> articleList = adao.getArticles(1, "title", "");
		
		int total = adao.getTotal();
		
		System.out.println(total);
		
		model.addAttribute("articleList",articleList);
		
		return "/WEB-INF/view/article/ArticleList.jsp";
	}
	
	
	
}
