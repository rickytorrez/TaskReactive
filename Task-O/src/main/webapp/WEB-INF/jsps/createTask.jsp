<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Create Task</title>
</head>
	<body>
		<h3>Create a Task</h3>
		<form action="createTask" method="post">
			Id<input type="text" name="id" />
			Title<input type="text" name="title" />
			Description<input type="text" name="description" />
			<input type="submit" value="Create!" />
		</form>
	</body>
</html>