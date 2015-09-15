package com.oldlec.web.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oldlec.web.dao.UserDao;
import com.oldlec.web.vo.User;

@Controller
@RequestMapping("/test/*")
public class Test
{
	@Autowired
	private UserDao udao;
	
	
	@RequestMapping(value="test", method=RequestMethod.GET)
	public String login(Model model)
	{
		
		List<User> users = udao.getUsers(1, "", "");
		User user = users.get(1);
		model.addAttribute("user", user);
		return "/WEB-INF/view/test.jsp";
	}
}
