<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctxName" value="${pageContext.request.contextPath}"/>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	
		<form action="${ctxName}/j_spring_security_check" method="post" id="login-form">
				<div id="input-set">
					<label id="label-email">email</label><input id="input-email" type="text" name="j_username"/>
					<label id="label-password">Password</label><input id="input-pwd" type="text" name="j_password"/>
				</div>
				<input id="sign-in-btn" type="submit" name="btn" value="login"/>
			
		</form>
		
		<p>Login Error msg : </p>

</body>
</html>