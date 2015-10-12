package com.oldlec.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.oldlec.web.dao.UserDao;
import com.oldlec.web.vo.User;

public class MyBatisUserDao implements UserDao{
	private SqlSession session;

	@Autowired
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public List<User> getUsers(int page, String field, String query) {
		
		if(session==null){
			System.out.println("null");
		}
		
		
		UserDao dao = session.getMapper(UserDao.class);
		return dao.getUsers(page, field, query);
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



}
