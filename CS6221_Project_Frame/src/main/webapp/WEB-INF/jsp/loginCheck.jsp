<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
<meta name="description" content="sy2">
<meta name="author" content="phy">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
        <%request.setCharacterEncoding("GBK");       //解决乱码问题 %>
</head>
<body>
  <%
    String uname=request.getParameter("uname");                                        //获取用户名
    String password=request.getParameter("password");                                //获取密码
    response.setHeader("refresh","0.5;URL=/main/index");                             //定时跳转
    session.setAttribute("uname",uname);                                             //用户名保存在session中
  %>
</body>
</html>