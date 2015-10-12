package com.oldlec.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.oldlec.web.dao.UserDao;
import com.oldlec.web.vo.User;

public class OldlecAuthenticationSuccessHandler implements AuthenticationSuccessHandler 
{
	@Autowired
	UserDao userDao;
	
   @Override
   public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) 
		   throws IOException,  ServletException {
      
	   String Email = authentication.getName();
	   User user = userDao.getUserByEmail(Email);
	   
	   String type = "ROLE_USER";
	   
	   String targetUrl = "/account/login";
	   
	   if(type.equals("ROLE_USER"))
	   {
		   targetUrl = "/account/login?authentication=Admin";
	   
		   RedirectStrategy redirectStategy = new DefaultRedirectStrategy();
		   redirectStategy.sendRedirect(request, response, targetUrl);
	   }
	   
	   
	   
	   
	   
/*	   String id = authentication.getName();
	   User user = userDao.getUserById(id);
	   
	   String type = user.getDefaultRole(user.getNo());
		 // String type = "ROLE_TEACHER";
	   
	   String targetUrl = "/account/login";
	   
	   if(type.equals("ROLE_ADMIN"))
	   {
		   targetUrl = "/main/index?authentication=Admin";
	   
		   RedirectStrategy redirectStategy = new DefaultRedirectStrategy();
		   redirectStategy.sendRedirect(request, response, targetUrl);
	   }
	   
	   */
	   
	/*	   String uid = authentication.getName();
		   User user = userDao.getUserByUid(uid);
		   
		   String type = user.getDefaultRole();
		  // String type = "ROLE_TEACHER";
		   
		   String targetUrl = "/basic/login";
	   
		   if(type.equals("ROLE_ADMIN"))
		   {
			   targetUrl = "/main/index?authentication=Admin";
		   
			   RedirectStrategy redirectStategy = new DefaultRedirectStrategy();
			   redirectStategy.sendRedirect(request, response, targetUrl);
		   }
		   else if(type.equals("ROLE_TEACHER"))
		   {
			   targetUrl = "/main/index?authentication=Teacher";
		   
			   RedirectStrategy redirectStategy = new DefaultRedirectStrategy();
			   redirectStategy.sendRedirect(request, response, targetUrl);
		   }
		   else
		   {
			   targetUrl = "/main/index?authentication=User";
			   
			   RedirectStrategy redirectStategy = new DefaultRedirectStrategy();
			   redirectStategy.sendRedirect(request, response, targetUrl);
		   }*/
	   }
}