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
		
		/* 10이나 20 같이 10을 나누어 떨어지는 경우
		 * 1/10 = 0, 10/10 = 1 과 같이 계산되어
		 * 10page 인 경우에는 11~20 페이지에 해당되어 버린다
		 * 수학적으로 1~10을 단번에 계산하기 복잡하므로, 예외적인 if문을 두는
		 * 알고리즘으로 만들었다. 
		 * */
		if(currentPage%10==0 && currentPage!=0){
			tenByTenStart = (currentPage/10-1)*10+1;
			tenByTenEnd = currentPage;
		}else{
			tenByTenStart = ((currentPage/10)*10)+1;
			tenByTenEnd = (currentPage/10+1)*10;
		}
		
		
		
		/*만약 마지막 10개의 페이지라면, 
		 * tenByTenStart/10==total/100이므로 
		 * eq 10의 자리가 같으므로*/
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
	/*note return 문에 쓰이는 jsp파일의 경우 카멜표기법으로 파일이름 작성시 오류남? 경험
	 * 못찾음*/
	
	
	@RequestMapping(value="insertSample", method=RequestMethod.GET)
	public void insertSample()
	{
		int result = 0;
		int currentTotal = 101;
	
		
		for(int i=currentTotal+1;i<currentTotal+100;i++){
			Article newArticle = new Article();
			newArticle.setNo(i);
	
			newArticle.setUserNo(1);
			newArticle.setTitle((i+1)+"번 제목");
			newArticle.setContent((i+1)+"번 제목");
			
			
			result+=adao.writeArticle(newArticle);
		}
		
		System.out.println(result);
	}
	
	
	@RequestMapping(value="article-write", method=RequestMethod.GET)
	public String writeArticle(){
		
		return "/WEB-INF/view/article/article-write.jsp";
	}
	
	
}
