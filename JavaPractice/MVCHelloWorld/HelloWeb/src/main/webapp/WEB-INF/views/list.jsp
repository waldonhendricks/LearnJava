<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book List</title>
    </head>
    <body>
        <p> List of books under ${highvar}$ </p>
        <table>
            <tr>
                <td><b><u>book no</u></b></td><t/>
                <td><b><u>book title</u></b></td>
                <td><b><u>Author</u></b></td>
                <td><b><u>price</u></b></td>
            </tr>
            <c:forEach items="${books}" var="book">               
                <c:if test="${book.price <= highvar}">
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
        <a href="home.jsp">Go Back</a>
        </br>

    </body>
</html>
