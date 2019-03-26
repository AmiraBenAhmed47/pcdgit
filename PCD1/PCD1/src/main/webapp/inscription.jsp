<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>ENSI Scheduler</title>

    <!-- Favicon -->
    <link rel="icon" href="img/logo.ico">

    <!-- Stylesheet -->
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <!-- Preloader -->
    <div class="preloader d-flex align-items-center justify-content-center">
        <div class="spinner">
            <div class="double-bounce1"></div>
            <div class="double-bounce2"></div>
        </div>
    </div>

    <!-- ##### Header Area Start ##### -->
    <header class="header-area">

        <!-- Navbar Area -->
        <div class="mag-main-menu" id="sticker">
            <div class="classy-nav-container breakpoint-off">
                <!-- Menu -->
                <nav class="classy-navbar justify-content-between" id="magNav">

                    <!-- Nav brand -->
                    <a href="" class="nav-brand"><img src="img/ensiLogo1.png" alt=""></a>

                    <!-- Navbar Toggler -->
                    <div class="classy-navbar-toggler">
                        <span class="navbarToggler"><span></span><span></span><span></span></span>
                    </div>

                    <!-- Nav Content -->
                    <div class="nav-content d-flex align-items-center">
                        <div class="classy-menu">

                            <!-- Close Button -->
                            <div class="classycloseIcon">
                                <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                            </div>

                            <!-- Nav Start -->
                            <div class="classynav">
                                <ul>
                                    <li class="active"><a href="acceuil.html">Acceuil</a></li>
                                    <li><a href="#">Espace Enseignant</a>
                                        <ul class="dropdown">
                                            <li><a href="acceuil.html">Acceuil</a></li>
                                            <li><a href="rattrapage.html">Rattrapage</a></li>
                                            <li><a href="devoirsurveille.html">Devoir Surveillé</a></li>
                                            <li><a href="seancecours.html">Seance Cours</a></li>
                                            <li><a href="absence.html">Absence</a></li>
                                            <li><a href="emploiEnseignant.html">Emploi</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Espace Etudiant</a>
                                        <div class="dropdown">
                                            <ul class="single-mega cn-col-4">
                                                <li><a href="acceuil.html">Acceuil</a></li>
                                                <li><a href="emploiEtudiant.html">Emploi</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li><a href="apropos.html">A propos</a></li>
                                    <li><a href="contact.html">Contact</a></li>
                                </ul>
                            </div>
                            <!-- Nav End -->
                        </div>

                        <div class="top-meta-data d-flex align-items-center">
                            <!-- Top Search Area -->
                            <div class="top-search-area">
                                <form action="index.html" method="post">
                                    <input type="search" name="top-search" id="topSearch" placeholder="Rechercher...">
                                    <button type="submit" class="btn"><i class="fa fa-search" aria-hidden="true"></i></button>
                                </form>
                            </div>
                            <!-- Login -->
                            <a href="login.html" class="login-btn"><i class="fa fa-bell" aria-hidden="true"></i></a>
                            <!-- Submit Video -->
                            <a href="submit-video.html" class="submit-video"><span><i class="fa fa-cloud-upload"></i></span> <span class="video-text">Déconnecter</span></a>
                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </header>
    <!-- ##### Header Area End ##### -->

    <!-- ##### Breadcrumb Area Start ##### -->
    <section class="breadcrumb-area bg-img bg-overlay" style="background-image: url(img/ensi.jpg);">
        <div class="container h-100">
            <div class="row h-100 align-items-center">
                <div class="col-12">
                    <div class="breadcrumb-content">
                        <h2>Inscription</h2>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ##### Breadcrumb Area End ##### -->

    <!-- ##### sign in Area Start ##### -->
    <div class="mag-login-area py-5">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-lg-6">
                    <div class="login-content bg-white p-30 box-shadow">
                        <!-- Section Title -->
                        <div class="section-heading">
                            <h5>Great to see you join!</h5>
                        </div>

                        <form action="index.html" method="post">
                        <div class="form-group">
                                <input type="text" class="form-control" id="prenom" placeholder="name">
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" id="nom" placeholder="lastname">
                            </div>
                            
                            <div class="form-group">
                                <input type="email" class="form-control" id="Email" placeholder="Email or User Name">
                            </div>
                            <div class="form-group">
                                <p> Choisir Niveau : </p>
                            <label class="radio-inline"><input type="radio" name="optradio" >II1</label>
<label class="radio-inline"><input type="radio" name="optradio">II2</label>
<label class="radio-inline"><input type="radio" name="optradio">II3</label>
                            </div>
                            <div class="form-group">
                               <p> Choisir Groupe : </p>
                            <label class="radio-inline"><input type="radio" name="optradio" >A</label>
<label class="radio-inline"><input type="radio" name="optradio">B</label>
<label class="radio-inline"><input type="radio" name="optradio">C</label>
<label class="radio-inline"><input type="radio" name="optradio" checked>D</label>
<label class="radio-inline"><input type="radio" name="optradio" checked>E</label>
<label class="radio-inline"><input type="radio" name="optradio" checked>F</label>
                            </div>
                            <div class="form-group">
                                <p> Choisir Filiere : </p>
                            <label class="radio-inline"><input type="radio" name="optradio" >ILSI</label>
<label class="radio-inline"><input type="radio" name="optradio">ISID</label>
<label class="radio-inline"><input type="radio" name="optradio">IF</label>
<label class="radio-inline"><input type="radio" name="optradio" checked>RSR</label>
<label class="radio-inline"><input type="radio" name="optradio" checked>II</label>
<label class="radio-inline"><input type="radio" name="optradio" checked>SLE</label>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" id="password" placeholder="Password">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" id="repeatpassword" placeholder="Repeat Password">
                            </div>
                            <div class="form-group">
                            
                                <p style="text-align:right;style="color:blue;"> <a href="log.jsp"> <u>Déja un membre? </u></a></p>
                            </div>
                            <button type="submit" class="btn mag-btn mt-30">S'inscrire</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### sign up Area End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer-area">
        <div class="container">
            <div class="row">
                <!-- Footer Widget Area -->
                <div class="col-12 col-sm-6 col-lg-3">
                    <div class="footer-widget">
                        <!-- Logo -->
                        <a href="index.html" class="foo-logo"><img src="img/logo.png" alt=""></a>
                        
                    </div>
                </div>
                
                <!-- Footer Widget Area -->
                <div class="col-12 col-sm-6 col-lg-3">
                    <div class="footer-widget">
                        <h6 class="widget-title">Concept</h6>
                        <nav class="footer-widget-nav">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                        <div class="footer-social-info">
                            <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
                            <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
                            <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                            <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
                        </div>
                        </nav>
                    </div>
                </div>
                
                <!-- Footer Widget Area -->
                
                <div class="col-12 col-sm-6 col-lg-3">
                    <div class="footer-widget">
                        <h6 class="widget-title">A propos de l'ENSI</h6>
                        <nav class="footer-widget-nav">
                            <p>L'École nationale des sciences de l'informatique ou ENSI est une école tunisienne formant des ingénieurs dans les technologies de l'information et de la communication</p>
                        <ul class= "Footer">
                            
                            <li><u>Télephone: </u>  71 600 444 </li>
                            
                            <li><u> Fondateur: </u>  Mohamed Ben Ahmed </li>
                            <li><ADDRESS>Campus Universitaire de la Manouba، Manouba 2010</ADDRESS></li>
                            
                            
                        </ul>
                        </nav>
                    </div>
                </div>
                
                <!-- Footer Widget Area -->
                <div class="col-12 col-sm-6 col-lg-3">
                    <div class="footer-widget">
                        <h6 class="widget-title">Mots Clés</h6>
                        <ul class="footer-tags">
                            <li><a href="emploiEtudiant.html">Emploi Etudiant</a></li>
                            <li><a href="emploiEnseignant.html">Emploi Enseignant</a></li>
                            <li><a href="connection.html">Se Connecter</a></li>
                            <li><a href="#">Rechercher</a></li>
                            <li><a href="acceuil.html">Acceuil</a></li>
                            <li><a href="Inscription.html">Inscription</a></li>
                            <li><a href="contact.html">Contacter nous</a></li>
                            <li><a href="apropos.html">A propos de nous </a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- Copywrite Area -->
        <div class="copywrite-area">
            <div class="container">
                <div class="row">
                    <!-- Copywrite Text -->
                    <div class="col-12 col-sm-6">
                        <p class="copywrite-text"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">ENSI Students</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                    <div class="col-12 col-sm-6">
                        <nav class="footer-nav">
                            <ul>
                                <li><a href="#">Acceuil</a></li>
                                <li><a href="#">Privacy</a></li>
                                <li><a href="#">Advertisement</a></li>
                                <li><a href="#">Contacter nous</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### All Javascript Script ##### -->
    <!-- jQuery-2.2.4 js -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/bootstrap/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <!-- All Plugins js -->
    <script src="js/plugins/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>
</body>

    