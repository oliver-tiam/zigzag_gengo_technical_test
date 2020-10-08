<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<title>Palindrome</title>
</head>
<body>
 <h1>Spring Boot - MVC web application for Palindrome</h1>
 <hr />

 <div class="form">

    <table>
        <tr>
            <td>Exercise # 1</td>
            <td>&nbsp;</td>
            <td>Your input: ${answer1}</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><b>${result1}</b></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><b>&nbsp;</b></td>
         </tr>
         <tr>
            <td>Exercise # 2</td>
            <td>&nbsp;</td>
            <td>Your input: ${answer2}</td>
          </tr>
          <tr>
             <td>&nbsp;</td>
             <td>&nbsp;</td>
             <td><b>${result2}</b></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><b>&nbsp;</b></td>
          </tr>
    </table>
    <br />
    <form action="/" method="get">
        <input type="submit" value="Try Again">
    </form>

 </div>

</body>

</html>