<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Ohh.. Error
	<br />timestamp - ${timestamp}
	<br /> status - ${status}

	<br /> error - ${exception.error}
	<br /> exception - ${exception}
	<br /> message -${exception.message }
	<br /> errors -${errors}
	<br /> trace -${exception.stackTrace}
	<br /> path -${path}
</html>