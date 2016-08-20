<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success Form</title>
</head>
<body>
	<font color="green">Hello</font>
	<p> You have successfully logged in.</p>
	
	<font color="green">Displaying books !</font>
	
  	<form:form name="success" method="GET">
			<table>
				<tr>
					<td>Enter the price</td>
					<td><input type="text" name="price" /></td>
				</tr>
				<!--  
				<tr>
					<td></td>
					<td><input type="submit" name="click" value="Click" /></td>
				</tr>
				-->
			</table>
	</form:form>
	
	<jsp:forward page="/final.jsp">
	<jsp:param name="priceval" value="Enter a price" />
	</jsp:forward>	
	<!-- 
	<form action = "final.jsp">
	<input type="submit" value="Click" />
	</form>
	
	<a href="final.jsp">Go</a>
	<a href="<%=request.getContextPath()%>/callme">Go </a>
	  <table>
           <tr>
               <td><b><u>book no</u></b></td><t/>
               <td><b><u>book title</u></b></td>
               <td><b><u>Author</u></b></td>
               <td><b><u>price</u></b></td>
           </tr>
           <c:forEach items="${books}" var="book">              
               <c:if test="${book.price <= 5000}">
                   <tr>
                       <td><i>${book.isbn}</i></td>
                       <td><i>${book.title}</i></td>
                       <td><i>${book.author}</i></td>
                       <td><i>${book.price}</i></td>
                   </tr>
               </c:if>
           </c:forEach>
       </table>
       <br/>
       <a href="login.jsp">Go Back</a>
       </br>
 	-->
   </body>
</html>
	
</body>
</html>