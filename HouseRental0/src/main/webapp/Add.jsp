<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=number],input[type=number], input[type=number], input[type=text], input[type=number], input[type=number], input[type=number], input[type=file] 
{
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus 
{
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button 
{
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover 
{
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn 
{
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .addbtn 
{
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container 
{
  padding: 16px;
}

/* The Modal (background) */
.modal 
{
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content 
{
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr 
{
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close 
{
  position: absolute;
  right: 35px;
  top: 15px;
  font-size: 40px;
  font-weight: bold;
  color: #f1f1f1;
}

.close:hover,
.close:focus 
{
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */
.clearfix::after 
{
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) 
{
  .cancelbtn, .addbtn 
  {
     width: 100%;
  }
}
</style>
<body>

<div id="id01" >
  <form class="modal-content" action="AddHouse" method="get">
      <h1>Add House Details</h1>
      <p>Please fill this form to add house details.</p>
      <hr>
      
      <label for="hid"><b>House Id</b></label>
      <input type="number" placeholder="Enter house id" name="hid" required><br><br>
      
      <label for="hnum"><b>House Number</b></label>
      <input type="text" placeholder="Enter house number" name="hnum" required><br><br>
      
      <label for="hfloor"><b>Floor Number</b></label>
      <input type="number" placeholder="Enter floor number" name="hfloor" required><br><br>
      
      <label for="hloc"><b>House Location</b></label>
      <input type="text" placeholder="Enter house location" name="hloc" required><br>
      
      <label for="hdescrip"><b>House Description</b></label>
      <input type="text" placeholder="Enter house description" name="hdescrip" required><br>
      
      <label for="hmonth"><b>Monthly Rent</b></label>
      <input type="number" placeholder="Enter monthly rent" name="hmonth" required><br><br>
      
      <label for="hcost"><b>Maintainance Cost</b></label>
      <input type="number" placeholder="Enter the maintainance cost" name="hcost" required><br><br>
      
      <label for="hsecurity"><b>Security Cost</b></label>
      <input type="number" placeholder="Enter the security cost" name="hsecurity" required><br><br>
      
      
      <label>
        <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Confirmed </label>

      <p>By adding you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
        <button type="submit" class="addbtn">Add Details</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>