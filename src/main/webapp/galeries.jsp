<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Sports Team &mdash; Colorlib Website Template</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito+Sans:200,300,400,700,900|Oswald:400,700"> 
    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/jquery.fancybox.min.css">
    <link rel="stylesheet" href="css/jquery-ui.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
    
  
    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/style.css">
    
  </head>
  <body>
   
  <div class="site-wrap">

    <div class="site-mobile-menu">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div> <!-- .site-mobile-menu -->

    <div class="container">

      <div class="row no-gutters site-navbar align-items-center py-3">

        <div class="col-6 col-lg-2 site-logo">
          <a href="<c:url value="/Guemps"/>">Guemps FJEP</a>
        </div>
        <div class="col-6 col-lg-10 text-right menu">
          <%@ include file="fragment/navbar.jsp" %>
        </div>
      </div>

    </div>
    
    
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <div class="hero-wrap text-center" style="background-image: url('images/hero_2.jpg');" data-stellar-background-ratio="0.5">
            <div class="hero-contents">
              <h2>Gallery</h2>
              <p><a href="<c:url value="/Accueil"/>">Accueil</a> <span class="mx-2">/</span> <strong>Photos</strong></p>
            </div>
          </div>
        </div>
      </div>
    </div>

    
    <div class="site-section">
      <div class="container">
        <div class="row align-items-center mb-2">
          <div class="col-6">
            <h2 class="section-title">Team Gallery</h2>
          </div>
        </div>

        <div class="row">
          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_1.jpg" data-fancybox="gal"><img src="images/img_1.jpg" alt="Image" class="img-fluid"></a>
          </div>
          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_2.jpg" data-fancybox="gal"><img src="images/img_2.jpg" alt="Image" class="img-fluid"></a>
          </div>
          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_3.jpg" data-fancybox="gal"><img src="images/img_3.jpg" alt="Image" class="img-fluid"></a>
          </div>

          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_4.jpg" data-fancybox="gal"><img src="images/img_4.jpg" alt="Image" class="img-fluid"></a>
          </div>
          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_5.jpg" data-fancybox="gal"><img src="images/img_5.jpg" alt="Image" class="img-fluid"></a>
          </div>
          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_1.jpg" data-fancybox="gal"><img src="images/img_1.jpg" alt="Image" class="img-fluid"></a>
          </div>
          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_2.jpg" data-fancybox="gal"><img src="images/img_2.jpg" alt="Image" class="img-fluid"></a>
          </div>
          <div class="col-6 col-sm-6 col-md-4 col-lg-3 mb-4">
            <a href="images/img_3.jpg" data-fancybox="gal"><img src="images/img_3.jpg" alt="Image" class="img-fluid"></a>
          </div>
        </div>
      </div>
    </div>

    <div class="footer">
          <%@ include file="fragment/footer.jsp" %>
    </div >
    

  </div>

  <script src="js/jquery.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/jquery.fancybox.min.js"></script>
  <script src="js/aos.js"></script>

  <script src="js/main.js"></script>
    
  </body>
</html>