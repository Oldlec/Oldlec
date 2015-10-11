package com.oldlec.web.controller.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	public String articleList(Model model, HttpServletRequest request)
	{
		
		
		/*for current page*/
		String _page = request.getParameter("page");
		int currentPage=1;
		if(_page!=null){
			currentPage = Integer.parseInt(_page);
		}
		
		/*get Articles by Page*/
		List<Article> articleList = adao.getArticles(currentPage, "title", "");
		int total = adao.getTotalOfArticles("IsValid", "");
		
		
		/*for page numbers*/
		
		/*get the 1~10, 11~20, 21~30, ...*/
		
		int tenByTenStart = 1;
		int tenByTenEnd = 10;
		
		/* 10�̳� 20 ���� 10�� ������ �������� ���
		 * 1/10 = 0, 10/10 = 1 �� ���� ���Ǿ�
		 * 10page �� ��쿡�� 11~20 �������� �ش�Ǿ� ������
		 * ���������� 1~10�� �ܹ��� ����ϱ� �����ϹǷ�, �������� if���� �δ�
		 * �˰������� �������. 
		 * */
		if(currentPage%10==0 && currentPage!=0){
			tenByTenStart = (currentPage/10-1)*10+1;
			tenByTenEnd = currentPage;
		}else{
			tenByTenStart = ((currentPage/10)*10)+1;
			tenByTenEnd = (currentPage/10+1)*10;
		}
		
		
		
		/*���� ������ 10���� ���������, 
		 * tenByTenStart/10==total/100�̹Ƿ� 
		 * eq 10�� �ڸ��� �����Ƿ�*/
		if(tenByTenStart/10==total/100){
			tenByTenEnd = (total/10)+1;
		}
		
		/* <   >   <next>  <prev    next>  <prev>*/
		String status ="start";
		
		if(total<=100){
			status = "startIsEnd";
		}else if(tenByTenStart==1){
			status ="start";
		}else if(tenByTenEnd == (total/10)+1){
			status = "end";
		}else if(tenByTenStart !=1 && tenByTenEnd != (total/10)+1){
			status = "middle";
		}
		

		model.addAttribute("articleList",articleList);
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("tenByTenStart",tenByTenStart);
		model.addAttribute("tenByTenEnd",tenByTenEnd);
		model.addAttribute("total",total);
		model.addAttribute("status",status);
		

		
		return "/WEB-INF/view/article/article-list.jsp";
	}
	
	
	@RequestMapping(value="article-detail", method=RequestMethod.GET)
	public String articleDetail(Model model, HttpServletRequest request){
		
		String _articleNo = request.getParameter("articleNo");
		int articleNo=-1;
		
		if(_articleNo!=null){
			articleNo = Integer.parseInt(_articleNo);
		}else{
			return "";
		}
		
		Article article = adao.getArticle(articleNo);
		model.addAttribute("article", article);

		
		return "/WEB-INF/view/article/article-detail.jsp";
	}
	/*note return ���� ���̴� jsp������ ��� ī��ǥ������� �����̸� �ۼ��� ������? ����
	 * ��ã��*/
	
	
	@RequestMapping(value="insertSample", method=RequestMethod.GET)
	public void insertSample()
	{
		int result = 0;
		int currentTotal = 101;
	
		
		for(int i=currentTotal+1;i<currentTotal+100;i++){
			Article newArticle = new Article();
			newArticle.setNo(i);
	
			newArticle.setUserNo(1);
			newArticle.setTitle((i+1)+"�� ����");
			newArticle.setContent((i+1)+"�� ����");
			
			
			result+=adao.writeArticle(newArticle);
		}
		
		System.out.println(result);
	}
	
	
	@RequestMapping(value="article-write", method=RequestMethod.GET)
	public String writeArticle(){
		
		return "/WEB-INF/view/article/article-write.jsp";
	}
	
	
}
