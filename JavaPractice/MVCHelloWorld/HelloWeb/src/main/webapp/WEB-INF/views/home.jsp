<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> welcome page</title>
    </head>
    <body>
        <table>
            <tr>
                <td><h1> Hi ${username} </h1></td>
            </tr>
        </table>
        <form action="BookList">
            <table>
                <tr>
                    <td><label>Set your highest price range</label></td>
                    <td><input type="text" name="limit" min="1"/></td><br/>
                </tr>
            </table>
            <br/>
            <input type="submit" value="Check"/>  
            <br/>
        </form>      
    </body>
</html>
