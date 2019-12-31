<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Customers</title>
</head>

<body>
	<c:if test="${!empty listofCustomers}">
 <table class="tg">
 <tr>
  <th width="80">Id</th>
  <th width="120">customer Name</th>
 
 <th width="120">phone no</th>
  <th width="120">combo id</th>
 </tr>
 <c:forEach items="${listofCustomers}" var="Customer">
  <tr>
   <td>${Customer.customerId}</td>
   <td>${Customer.customerName}</td>
   <td>${Customer.phoneNumber}</td>
   <td>${Customer.combo.comboId}</td>
 
  </tr>
 </c:forEach>
 </table>
</c:if>

</body>

</html>