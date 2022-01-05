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
            .carousel .carousel-item {
              margin-left: 500px;
              position: relative;
              width: 1500px;
             height: 960px;

  
			}
			
			.carousel-item img {
			    position: absolute;
			    object-fit:cover;
			    top: 1200;
			    left: 0;
			    min-height: 500px;
			}
			.container {
			  
			  height: auto;
			  margin-top: 20px;
			}
			.eventcont {
			  
			    margin-left: 20px;
			    margin-right: 20px;
			    margin-top: 20px;
			  }
			  .event {
			    display: inline;
			
			    background-color: white;
			  }
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
            
            .footer {
				  position:absolute;
				  left: 0;
				  bottom: 0;
				  right: 0;
				  width: 100%;
				  background-color: black;
				  color: white;
				  text-align: center;
				}
				
				.footer-dark {
				  padding:25px 0;
				  color:#f0f9ff;
				  background-color:#282d32;
				}
				
				.footer-dark h3 {
				  margin-top:0;
				  margin-bottom:12px;
				  font-weight:bold;
				  font-size:16px;
				}
				
				.footer-dark .copyright {
				  text-align:center;
				  padding-top:18px;
				  opacity:0.3;
				  font-size:13px;
				  margin-bottom:0;
				}
				
				.footer-dark ul a {
				  color:inherit;
				  text-decoration:none;
				  opacity:0.6;
				}
				
				.footer-dark .item.text p {
				  opacity:0.6;
				  margin-bottom:0;
				}
				
				.footer-dark ul a:hover {
				  opacity:0.8;
				}

        </style>
    </head>
    <body style="background-color: rgb(48, 48, 48)">
        <div class="w3-sidebar w3-bar-block bg-black w3-sepia-max w3-animate-right" style="display:none;right:0;" id="rightMenu">
            <button onclick="closeRightMenu()" class="w3-bar-item w3-button w3-large" id="nav-buttons">Close &times;</button>
            <a href="Howner.jsp" class="w3-bar-item w3-button" id="nav-buttons">Home</a>
            <a href="CustomerLogin.jsp" class="w3-bar-item w3-button" id="nav-buttons">Rent</a>
            <a href="Howner.jsp" class="w3-bar-item w3-button" id="nav-buttons">Login</a>
            <a href="Add.jsp" class="w3-bar-item w3-button" id="nav-buttons">Add</a>
            <a href="HOwnerView" class="w3-bar-item w3-button" id="nav-buttons">View</a>
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
                    <a class="nav-link active" aria-current="page" href="Howner.jsp">Home</a>
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
                      <li><a class="dropdown-item" href="Howner.jsp">House Owner Login</a></li>
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
                      <li><a class="dropdown-item" href="Howner.jsp">House Owner Register</a></li>
                      <li><a class="dropdown-item" href="Customer_Register.jsp">Customer Register</a></li>
                    </ul>
                    </div>
                  </li>
                </div>
                <li class="nav-item">
                    <div class = "bordering" id="buttons">
                    <a class="nav-link active" aria-current="page" href="Add.jsp">Add</a>
                    </div>
                    <div class = "bordering" id="buttons">
                    <a class="nav-link active" aria-current="page" href="HOwnerView">View</a>
                </ul>
              </div>
            </div>
            <div>
                <button class="w3-button w3-white w3-xxxlarge w3-right" style="margin-bottom: 10%;" onclick="openRightMenu()">&#9776;</button>
              </div>
          </nav>
         
          <div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img src="ho.jpg" class="d-block w-100" alt="...">
              </div>
              <div class="carousel-item">
                <img src="ho1.jpg" class="d-block w-100" alt="..." style="height: 990px;">
              </div>
              <div class="carousel-item">
                <img src="ho2.jpg" class="d-block w-100" alt="...">
              </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>
               <div class="footer-dark">
                <footer>
                    <div class="container">
                        <div class="row">
                            <div class="col-sm-6 col-md-3 item">
                                <h3>Services</h3>
                                <ul>
                                    <li><a href="#">PG</a></li>
                                    <li><a href="#">Upcoming Projects</a></li>
                                    <li><a href="#">To-Let</a></li>
                                </ul>
                            </div>
                            <div class="col-sm-6 col-md-3 item">
                                <h3>About</h3>
                                <ul>
                                    <li><a href="#">Company</a></li>
                                    <li><a href="#">Team</a></li>
                                    <li><a href="#">Careers</a></li>
                                </ul>
                            </div>
                            <div class="col-md-6 item text">
                                <h3>RentO's</h3>
                                <p>Consider Rento's Versatility and Possibility in your life. Visualize Yourself Here. A Combination of High-End Features and In-Demand Amenities to Elevate and Enhance Your Lifestyle.Owners can rent out their home at the click of a button.</p>
                            </div>
                            <div class="col item social"><a href="#"><i class="icon ion-social-facebook"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-instagram"></i></a></div>
                        </div>
                        <p class="copyright">RentO's © 2018</p>
                    </div>
                </footer>
            </div>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
          
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