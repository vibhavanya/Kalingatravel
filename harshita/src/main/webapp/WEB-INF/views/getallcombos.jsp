<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Combo Lists</title>
</head>
<body>
<h3>Combo List</h3>
<c:if test="${!empty listofcombos}">
 <table class="tg">
 <tr>
  <th width="80">comboId</th>
  <th width="120">comboName</th>
  <th width="120">duration</th>
  <th width="120">food availability</th>
  <th width="120">cost</th>
  <th width="60">update</th>
  
  
  
 </tr>
 <c:forEach items="${listofcombos}" var="Combo">
  <tr>
   <td>${Combo.comboId}</td>
   <td>${Combo.comboName}</td>
 	<td>${Combo.duration}</td>
 	<td>${Combo.foodavailability}</td>
   <td>${Combo.cost}</td>
   <td><a href="<c:url value='/updatecombo/${Combo.comboId}' />" >Update</a></td>
  
  </tr>
 </c:forEach>
 </table>
</c:if>
		
</body>
</html>