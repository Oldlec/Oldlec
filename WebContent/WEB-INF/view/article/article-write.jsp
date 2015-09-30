<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="ctxName" value="${pageContext.request.contextPath}"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<script src="${ctxName}/resource/js/jquery-2.1.4.js"></script>

	<script type="text/javascript" src="${ctxName}/resource/tinymce/js/tinymce/tinymce.dev.js"></script>
	<script type="text/javascript">
	tinymce.init({
		laguage:"ko",
		
		//width,height
		height:500,
		width:400,
		

		
		forced_root_block:false,
		
	    selector: "textarea",
	    plugins: [
	        "advlist autolink lists link image charmap print preview anchor",
	        "searchreplace visualblocks code fullscreen",
	        "insertdatetime media table contextmenu paste textcolor"
	    ],
	    toolbar: "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | forecolor backcolor emoticons ",
	    menubar: false
	});
	
	
	</script>

<form method="post" action="./Tiny">
    <textarea name="content" style=""></textarea>
    <input type="submit" value="send content"/>
</form>
	
	
</body>
</html>