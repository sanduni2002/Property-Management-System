<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Property Owner</title>

<style>

body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

header {
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 20px;
}

nav ul.horizontal-menu {
    background-color: #444;
    font-size: 20px;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: space-around;
    align-items: center;
    list-style: none;
    width: 100%;
    height: 60px; 
}

nav a.active, nav a:hover {
    background-color: orange;
    color: white;
    transition: 0.5s;
    border-radius: 5px;
}

nav li {
    padding: 0 10px; /* Increase spacing between items */
}

nav a {
    color: #fff;
    text-decoration: none;
    font-weight: bold;
    padding: 10px 20px;
    border-radius: 5px;
}

main {margin-top: 10px;
    width: auto;
    align-items: center;
    text-align: center;
    min-height: 100%;
    padding: 20px;
    
}



.footer {
   
    background-color: #333;
    color: #fff;
    text-align: center;
    padding: 20px 0;
    font-size: 20px; 
}

.footer .flex {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    justify-content: space-between;
    align-items: center;
}

.footer .box a {
    display: flex;
    align-items: center;
    text-decoration: none;
    color: #fff;
     padding: 10px 0; 
    font-size: 18px; 
    text-align: center; 
}


.footer .box a span {
    margin-left: 10px;
}

.footer .box a i {
    font-size: 24px;
}

.footer .box a:hover span {
    text-decoration: underline;
}

.footer .credit {
    padding: 20px;
    text-align: center;
    font-size: 18px;
}

.footer .credit span {
    color: #ff6f61;
}

img {
  width: 40%;
  margin-left: 50px;
  margin-right: 50px;
  
  float: left;    

}

  
  
  


.table{
    font-size: 30px;
    color: white;
}

td{
   width: 30%;
}
tr{height: 70px;
}
.box1 {
 
  border-radius: 3px;

  position: relative;
  top: 50%;
  left: 50%;
  
  width: 800px;
  height: 600px;
  transform-style: preserve-3d;
  perspective: 2000px;
  transition: .4s;
  text-align: center;
  &:before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: transparent;
    border-top: 20px solid #444;
    border-left: 20px solid #444;
    box-sizing: border-box;
  }
  &:after {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    border-bottom: 20px solid #444;
    border-right: 20px solid #444;
    box-sizing: border-box;
  }
  .fas {
    font-size: 25px;
    height: 50px;
    width: 50px;
    line-height: 50px !important;
    background-color: transparent;
   
  }
  .fa2 {
    position: absolute;
    bottom: 0;
    right: 0;
    z-index: 1;
  }
  .text {
    position: absolute;
    top: 30px;
    left: -30px;
    width: calc(100% + 60px);
    height: calc(100% - 60px);
    background-color: #333;
    border-radius: 3px;
    transition: .4s;
    .fa1 {
      position: absolute;
      top: 0;
      left: 0;
    }
    .profile-info {
      position: absolute;
      top: 50%;
      left: 0;
      transform: translateY(-50%);
      text-align: center;
      width: 100%;
      padding: 30px 60px;
      line-height: 1.5;
      box-sizing: border-box;
      
    }
  }
  &:hover {
    .text {
      transform: rotateY(20deg) skewY(-3deg)
    }
    transform:  rotateY(-20deg) skewY(3deg)
  }
}







</style>
</head>
<body>

 <header>
        <h1>My Profile</h1>
    </header>

    <nav>
        <ul class="horizontal-menu">
            <li><a class="active" id="button" href= "propertyOwner.jsp">Dashboard</a></li>
            <li><a id="button" href= "property-form.jsp">Add Properties</a></li>
            <li> <a id="button" href= "property-list.php">Manage Listings</a></li>
            <li> <a id="button" href= "Feedback.php">Feedback</a></li>
        </ul>
    </nav>

    <main>
        <section class="content">
            <h2 style="margin-bottom: 100px;">Content Section</h2>
         <div class = "img"> <img src="https://cdni.iconscout.com/illustration/premium/thumb/real-estate-agent-7209482-5861648.png" alt="" aria-hidden="true" class="illustration" />  </div>
         <div class="box1"><i class="fas fa-quote-left fa2"></i>
            <div class="text"><i class="fas fa-quote-right fa1"></i>
                   
         <div class="profile-info" >
            <table class= "table" >
                <tr>
                  <td >Name </td>
                  
                  <td>:Sanduni</td>
                  
                </tr>
                <tr>
                  <td>Email </td>
                  
                  <td>:sanduni@gmail.com</td>
                  
                </tr>
                <tr>
                  <td>Location </td>
                  
                  <td>:Gampaha</td>
                  
                </tr>
                <tr>
                  <td>Age </td>
                  
                  <td>:21</td>
                  
                </tr>
                <tr>
                    <td>Birthday</td>
                    
                    <td>:12/03/2002</td>
                    
                  </tr>
                  
              </table>
            <!-- Add more profile information as needed -->
        </div>
            </div></div>
           
            
        
        </section>
    </main>

    <footer>
       
        
         <footer class="footer">

        <section class="flex">
     
           <div class="box">
              <a href="tel:1234567890"><i class="fas fa-phone"></i><span>123456789</span></a>
              <a href="tel:1112223333"><i class="fas fa-phone"></i><span>1112223333</span></a>
              <a href="mailto:shaikhanas@gmail.com"><i class="fas fa-envelope"></i><span>shaikhanas@gmail.com</span></a>
              <a href="#"><i class="fas fa-map-marker-alt"></i><span>mumbai, india - 400104</span></a>
           </div>
     
           <div class="box">
              <a href="propertyOwner.jsp"><span>home</span></a>
              <a href="about.html"><span>about</span></a>
              <a href="contact.html"><span>contact</span></a>
              <a href="property-list.jsp"><span>all listings</span></a>
              <a href="#"><span>saved properties</span></a>
           </div>
     
           <div class="box">
              <a href="#"><span>facebook</span><i class="fab fa-facebook-f"></i></a>
              <a href="#"><span>twitter</span><i class="fab fa-twitter"></i></a>
              <a href="#"><span>linkedin</span><i class="fab fa-linkedin"></i></a>
              <a href="#"><span>instagram</span><i class="fab fa-instagram"></i></a>
     
           </div>
     
        </section>
     
        <div class="credit">&copy; copyright @ 2022 by <span>mr. web designer</span> | all rights reserved!</div>
     
     </footer>
    </footer>

</body>
</html>