package com.oldlec.web.controller.account;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oldlec.web.dao.UserDao;

@Controller
@RequestMapping("/account/*")
public class AccountController {


	@Autowired
	private UserDao udao;

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String articleList(Model model, HttpServletRequest request)
	{
		return "/WEB-INF/view/account/login.jsp";
	}
	
}
