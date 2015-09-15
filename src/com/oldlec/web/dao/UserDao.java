package com.oldlec.web.dao;

import java.util.List;

import com.oldlec.web.vo.User;

public interface UserDao {

	public List<User> getUsers(
			 int page,
	         String field,
	         String query
	         );
}
