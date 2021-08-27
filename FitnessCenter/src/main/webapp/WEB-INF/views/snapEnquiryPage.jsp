<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color:lavender">
<h1><center> Snap Fitness Center </center></h1>


<form:form  modelAttribute="fitnessCenter" method="post" action="/snapEstimation">
<table>
              
    

<tr>
 <td><form:select path="preferredPackage" id="preferredPackage" name="preferredPackage" items="${snapList}"/></td>
</tr>
<tr>
 <td><form:input path="numberOfMonths" id="numberOfMonths" name="numberOfMonths"/></td>
</tr>
<tr>
 <td>
  <input type="submit" id="submit" name="submit" value ="Package Cost" />
 </td>
 <td></td>
</tr>
   
</table>
</form:form>
</body>
</html>