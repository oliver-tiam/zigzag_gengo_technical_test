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
    <form action="answer" method="post" onsubmit="return validate()">
    <table>
        <tr>
            <td>Exercise # 1 </td>
            <td>&nbsp;</td>
            <td>Determine a string if it is a palindrome or not</td>
        </tr>
        <tr>
            <td>Enter a string</td>
            <td>&nbsp;</td>
            <td><input id="answer1" name="answer1"></td>
        </tr>
        <tr>
             <td>&nbsp;</td>
             <td>&nbsp;</td>
             <td>&nbsp;</td>
         </tr>
         <tr>
             <td>Exercise # 2 </td>
             <td>&nbsp;</td>
             <td>Determine the longest palindrome substring</td>
          </tr>
          <tr>
             <td>Enter a string</td>
             <td>&nbsp;</td>
             <td><input id="answer2" name="answer2"></td>
          </tr>
          <tr>
             <td>&nbsp;</td>
             <td>&nbsp;</td>
             <td>&nbsp;</td>
           </tr>
    </table>
    <br />
    <input type="submit" value="Submit">
    </form>
 </div>

</body>

</html>