<%@ page import="inna.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 002 02.04.19
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <% List<Student> listOfAllStudents = (List<Student>) request.getSession().getAttribute("listOfAllStudents");%>

        <% for (int i = 0; i < listOfAllStudents.size(); i++) { %>
            <input type="checkbox" name="students" id="<%="student" + i%>" value="<%=listOfAllStudents.get(i)%> ">>


       <% }



        %>

</body>
</html>
