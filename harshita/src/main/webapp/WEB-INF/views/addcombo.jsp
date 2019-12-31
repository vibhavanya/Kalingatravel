<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Combo Data</title>
</head>
<body>
<div class="form" text-align="center">
    <form action="/addcombo" method="post" modelattribute="Combo">
      <table>
        <tr>
         <th colspan="2">Add Combo</th>
         </tr>
         <tr>
          
          <td>Enter Combo details</td>
         <tr>
        <td> <label for="comboId">ComboId:</label></td>
         <td> <input type="text" name="comboId" ></td>
          </tr>
          <tr>
         <td> <label for="comboName">comboName:</label></td>
          <td><input type="text" name="comboName" ></td>
         </tr>
          <tr>
         <td> <label for="duration">duration:</label></td>
          <td><input type="text" name="duration" ></td>
         </tr>
          <tr>
         <td> <label for="foodavailability">foodavailability:</label></td>
          <td><input type="text" name="foodavailability" ></td>
         </tr>
         <tr>
        <td>  <label for="cost">cost:</label></td>
          <td><input type="text" name="cost" ></td>
         </tr>

         <tr>
         <td colspan="2"><input type="Submit" class="blue-button" value="Submit"></td>
          </tr>        
      </table>
    </form>
  </div>

</body>
</html>