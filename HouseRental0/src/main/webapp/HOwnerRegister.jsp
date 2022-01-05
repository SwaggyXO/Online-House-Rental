<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" async defer>
        </script>
        <style>
            .bordering
            {
                border-radius: 30%;
                border: solid 1px white;
                font-size: 30px;
                
            }
            
            nav ul {
                margin: 0;
                padding: 0;
                list-style: none;
            }

            #buttons{
                display: inline-block;
                margin-left: 100px;
                margin-right: 70px;
                margin-top: 25px;
                margin-bottom: 25px;

                position: relative;
            }

            nav a{
                color: black;
                text-decoration: none;
                text-transform: uppercase;
                font-family: Valorant;
                font-size: 35px;
                cursor: pointer;
            }

            #nav-buttons
            {
                color: white;
                text-decoration: none;
                text-transform: uppercase;
                font-family: Valorant;
                font-size: 25px;
                cursor: pointer;
            }

            form {border: 0px solid #f1f1f1;}

            input[type=text], input[type=password] {
            width: 50%;
            padding: 12px 20px;
            margin: 8px 0;
            display: block;
            margin-left: 320px;
            border: 1px solid #ccc;
            box-sizing: border-box;
            }

            button {
            background-color: black;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            display: inline;
            cursor: pointer;
            width: 100%;
            }

            button:hover {
            opacity: 0.8;
            }

            .cancelbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
            }

            .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
            }

            img.avatar {
            width: 20%;
            border-radius: 50%;
            }

            .container {
            padding: 16px;
            }

            .container2 {
            padding: 16px;
            }

            span.psw {
            float: right;
            padding-top: 16px;
            }
            

        </style>
    </head>
    <body style="background-color: rgb(175, 175, 175);">
    <%
		String userName = null;
		Cookie[] cookies = request.getCookies();
		if(cookies !=null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("user"))
			{
				if (cookie.getValue()!=null)
				response.sendRedirect("admin_welcome.jsp");
			}
		}
		}
%>
        <div class="w3-sidebar w3-bar-block bg-black w3-sepia-max w3-animate-right" style="display:none;right:0;" id="rightMenu">
            <button onclick="closeRightMenu()" class="w3-bar-item w3-button w3-large" id="nav-buttons">Close &times;</button>
            <a href="index.jsp" class="w3-bar-item w3-button" id="nav-buttons">Home</a>
            <a href="CustomerLogin.jsp" class="w3-bar-item w3-button" id="nav-buttons">Rent</a>
            <a href="index.jsp" class="w3-bar-item w3-button" id="nav-buttons">Login</a>
          </div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-black">
            <div class="container-fluid" id="maindiv">
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <div class="img" id="buttons"> 
                    <li>
                        <a class="navbar-brand" href="#"><img src="" alt=""></a>
                    </li>
                    </div>
                  <li class="nav-item">
                    <div class = "bordering" id="buttons">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                    </div>
                  </li>
                  <li class="nav-item">
                    <div class="bordering" id="buttons">
                    <a class="nav-link" href="CustomerLogin.jsp">Rent</a>
                    </div>
                  </li>
                  <div class="bordering" id="buttons">
                  <li class="nav-item dropdown">
                    
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Login
                    </a>
                    
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                      <li><a class="dropdown-item" href="AdminLogin.jsp">Admin Login</a></li>
                      <li><a class="dropdown-item" href="HouseOwnerLogin.jsp">House Owner Login</a></li>
                      <li><a class="dropdown-item" href="CustomerLogin.jsp">Customer Login</a></li>
                    </ul>
                  </li>
                 </div>
                 <div class="bordering" id="buttons">
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Register
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                      <li><a class="dropdown-item" href="HOwnerRegister.jsp">House Owner Register</a></li>
                      <li><a class="dropdown-item" href="Customer_Register.jsp">Customer Register</a></li>
                    </ul>
                  </li>
                </div>
                </ul>
              </div>
            </div>
            <div>
                <button class="w3-button w3-white w3-xxxlarge w3-right" style="margin-bottom: 10%;" onclick="openRightMenu()">&#9776;</button>
              </div>
          </nav>
          <div>
            <form action="HOwner_Register" method="post">
                <div class="imgcontainer">
                  <img src="img_avatar2.png" alt="Avatar" class="avatar">
                </div>
              
                <div class="container">
                  <label for="uname" style="margin-left: 320px;"><b>Username</b></label>
                  <input type="text" placeholder="Enter Username" name="uname" required>
                  
                   <label for="uname" style="margin-left: 320px;"><b>Email</b></label>
                  <input type="text" placeholder="Enter Email" name="email" required>
                  
                   <label for="uname" style="margin-left: 320px;"><b>Phone number</b></label>
                  <input type="text" placeholder="Enter Phone Number" name="phone" required>
              
                  <label for="psw" style="margin-left: 320px;"><b>Password</b></label>
                  <input type="password" placeholder="Enter Password" name="psw" required>
                 
                      
                  <button type="submit" style="width: 50%; margin-left: 320px;">Register</button>
                </div>
                <label>
                    <div style="margin-left: 951.5px;">
                        <input type="checkbox" name="submit" value="house_owner_register" checked="checked" name="remember"> Remember me
                    </div>
                </label>
                <div class="container2" style="background-color:#f1f1f1; width: 25.5%; margin-left: 950px;">
                  <button type="button" class="cancelbtn" style="margin-left: 0px;">Cancel</button>
                  <span class="psw" style="margin-right: 10px;">Forgot <a href="#">password?</a></span>
                </div>
              </form>
          </div>
         
          
          
        <script>
            function openRightMenu() {
                document.getElementById("rightMenu").style.display = "block";
            }

            function closeRightMenu() {
                document.getElementById("rightMenu").style.display = "none";
            }
        </script>

    </body>
</html>