<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Data</h1>
  <hr>

  <div class="form" text-align="center">
    <form action="/addcustomer" method="post" modelattribute="Customer">
      <table>
        <tr>
         <th colspan="2">Add Customer</th>
         </tr>
         <tr>
          
          <td>Enter Customer details</td>
         <tr>
        <td> <label for="customerId">CustomerId:</label></td>
         <td> <input type="text" name="customerId" ></td>
          </tr>
          <tr>
         <td> <label for="customerName">customerName:</label></td>
          <td><input type="text" name="customerName" ></td>
         </tr>
         <tr>
        <td>  <label for="phoneNumber">phoneNumber:</label></td>
          <td><input type="text" name="phoneNumber" ></td>
         </tr>

         <tr>
         <td colspan="2"><input type="Submit" class="blue-button" value="Submit"></td>
          </tr>        
      </table>
    </form>
  </div>


</body>
</html>