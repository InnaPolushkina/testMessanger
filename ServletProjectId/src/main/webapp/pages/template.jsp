<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 026 26.03.19
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <div>
        Welcome, <%= request.getSession().getAttribute("userName")%>!
        <a>Exit</a>
    </div>


    <div>

        Menu:
        <a href="ServletProjectId/Dispatcher?action=showAllStudents"> Students </a>
    </div>

    <div>
        <%String includedJSPage = (String) request.getSession().getAttribute("includedPage");  %>
        <%  if(includedJSPage != null) {          %>
                <jsp:include page="<%=includedJSPage %>" ></jsp:include>
        <%  }        %>
    </div>

</body>
</html>
