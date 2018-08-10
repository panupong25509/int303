<%-- 
    Document   : index
    Created on : Aug 10, 2018, 1:47:42 AM
    Author     : Joknoi
--%>

<%@page import="java.util.List"%>
<%@page import="product.mockup.model.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>:: JOKSITE ::</title>
        <link rel="icon" href="img/logos/teddy-bear.png">

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <!-- Custom fonts for this template -->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
        <link href="css/agency.css" rel="stylesheet">

        <!-- data table -->
        <link rel="stylesheet" href="css/datatables.css" />

    </head>

    <body id="page-top">

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">JOK SITE</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fa fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav text-uppercase ml-auto">
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#func">Functions</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#simplecalc">Simple Calculator</a>
                        </li>
<!--                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#primenumber">Prime nummber Checked</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#registerit">Register IT</a>
                        </li>-->
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#productlist">Product List</a>
                        </li> 
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#tablecal">แม่สูตรคูณ</a>
                        </li> 
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#cart"><i class="fa fa-cart-plus"></i> (${cart.totalQuantity})</a>
                        </li>    
                    </ul>
                </div>
            </div>
        </nav>

        <!-- Header -->
        <header class="masthead">
            <div class="container" style="min-height: 100vh;">
                <div class="intro-text">
                    <div class="col-sm-4 mx-auto">
                        <div class="team-member">
                            <img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
                            <h4>Panupong Joknoi</h4>
                            <p class="text-muted">Web Programing</p>
                            <ul class="list-inline social-buttons">
                                <li class="list-inline-item">
                                    <a href="#">
                                        <i class="fa fa-instagram"></i>
                                    </a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#">
                                        <i class="fa fa-facebook"></i>
                                    </a>
                                </li>
                                <li class="list-inline-item">
                                    <a href="#">
                                        <i class="fa fa-slack"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <!-- All -->
        <section style="min-height: 100vh;" id="func">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2 class="section-heading text-uppercase">Functions</h2>
                        <h3 class="section-subheading text-muted">SELECT</h3>
                    </div>
                </div>
                <div class="row text-center">
                    <a href="#simplecalc" style="text-decoration: none;" class="col-md-3 js-scroll-trigger">
                        <div style="cursor: pointer;" >
                            <span class="fa-stack fa-4x">
                                <i class="fa fa-circle fa-stack-2x text-primary"></i>
                                <i class="fa fa-calculator fa-stack-1x fa-inverse"></i>
                            </span>
                            <h4 class="service-heading">Simple Calculator</h4>
                        </div>
                    </a>
                    <a href="#page-top" style="text-decoration: none;" class="col-md-3 js-scroll-trigger">
                        <div style="cursor: pointer;">
                            <span class="fa-stack fa-4x">
                                <i class="fa fa-circle fa-stack-2x text-primary"></i>
                                <i class="fa fa-check fa-stack-1x fa-inverse"></i>
                            </span>
                            <h4 class="service-heading">Prime number Checked</h4>
                        </div>
                    </a>
                    <a href="#page-top" style="text-decoration: none;" class="col-md-3 js-scroll-trigger">
                        <div style="cursor: pointer;">
                            <span class="fa-stack fa-4x">
                                <i class="fa fa-circle fa-stack-2x text-primary"></i>
                                <i class="fa fa-registered fa-stack-1x fa-inverse"></i>
                            </span>
                            <h4 class="service-heading">Register IT</h4>
                        </div>
                    </a>
                    <a href="#productlist" style="text-decoration: none;" class="col-md-3 js-scroll-trigger">
                        <div style="cursor: pointer;">
                            <span class="fa-stack fa-4x">
                                <i class="fa fa-circle fa-stack-2x text-primary"></i>
                                <i class="fa fa-shopping-basket fa-stack-1x fa-inverse"></i>
                            </span>
                            <h4 class="service-heading">Product List</h4>
                        </div>
                    </a>
                </div>
            </div>
        </section>
        <!-- SimpleCalc -->
        <section style="min-height: 100vh;background-color: #fed136;" id="simplecalc">
            <div class="container">
                <div class="row">
                    <div class="col-8 mx-auto">
                        <form action="SimpleCalc" method="post">
                            <div class="form-row">
                                <div class="col-4">
                                    <input type="text" class="form-control" id="x" placeholder="x" name="x">
                                </div>
                                <div class="col-2">
                                    <select id="inputState" class="form-control" name="operator">
                                        <option selected>operator</option>
                                        <option value="+">+</option>
                                        <option value="-">-</option>
                                        <option value="*">x</option>
                                        <option value="/">/</option>
                                    </select>
                                </div>
                                <div class="col-4">
                                    <input type="text" class="form-control" id="y" placeholder="y" name="y">
                                </div>
                                <input class="col-2" type="submit" value="Calculator">
                            </div>
                        </form>
                        <div>
                            <p>Result : ${calculator.x} ${calculator.operator} ${calculator.y} = ${calculator.result}</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Product List -->
        <section style="min-height: 100vh;" id="productlist">
            <div class="container">
                <div class="row">
                    <div class="col-10 mx-auto">
                        <% if (session.getAttribute("products") == null) { %>
                        <div>
                            <a href="ProductList"><button>Shopping</button></a>
                        </div>
                        <% } else { %>
                        <table id="example" class="table" style="display: block;width: 100%;max-height: 50vh;overflow-y: auto;-ms-overflow-style: -ms-autohiding-scrollbar;">
                            <thead>
                            <th>#</th>
                            <th>No</th>
                            <th>Product Code</th>
                            <th>Product Name</th>
                            <th>Product Line</th>
                            <th>Scale</th>
                            <th>Price</th>
                            <th>Add to Cart</th>
                            </thead>
                            <tbody>
                                <c:forEach items="${products}" var="p" varStatus="vs">
                                    <tr>
                                        <td><img src="model-images/${p.productCode}.jpg" width="120"/></td>
                                        <td>${vs.count}</td>
                                        <td>${p.productCode}</td>
                                        <td>${p.productName}</td>
                                        <td>${p.productLine}</td> 
                                        <td>${p.productScale}</td> 
                                        <td>${p.msrp}</td>
                                        <td>
                                            <form action="AddItem" method="post">
                                                <input type="hidden" value="${p.productCode}" name="productCode"/>
                                                <input type="submit" value="Add To Cart"/>
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <% }%>

                    </div>
                </div>
            </div>
        </section>
        <!-- Cart -->
        <section style="min-height: 100vh;background-color: #fed136;" id="cart">
            <div class="container">
                <div class="row">
                    <div class="col-10 mx-auto">
                        <h1>Cart</h1>
                        <% if (session.getAttribute("products") == null) { %>
                        <div>

                        </div>
                        <% } else { %>
                        <table id="example" class="table" style="display: block;width: 100%;max-height: 70vh;overflow-y: auto;-ms-overflow-style: -ms-autohiding-scrollbar;">
                            <thead>
                            <th>#</th>
                            <th>No</th>
                            <th>Product Code</th>
                            <th>Product Name</th>
                            <th>Product Line</th>
                            <th>Scale</th>
                            <th>Price</th>
                            <th>Remove</th>
                            </thead>
                            <tbody>
                                <c:forEach items="${cart.lineItems}" var="lineItem" varStatus="vs">
                                    <tr>
                                        <td><img src="model-images/${lineItem.product.productCode}.jpg" width="120"/></td>
                                        <td>${vs.count}</td>
                                        <td>${lineItem.product.productCode}</td>
                                        <td>${lineItem.product.productName}</td>
                                        <td>${lineItem.product.productLine}</td> 
                                        <td>${lineItem.product.productScale}</td> 
                                        <td>${lineItem.product.msrp}</td>
                                        <td>
                                            <form action="RemoveItem" method="post">
                                                <input type="hidden" value="${lineItem.product.productCode}" name="productCode"/>
                                                <input type="submit" value="Remove"/>
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        
                        <% }%>
                        <a href="go.jsp"><button>GO !!!</button></a>
                    </div>
                </div>
            </div>
        </section>

        <!-- แม่สูตรคูณ -->
        <section style="height: 100vh;" id="tablecal">
            <div  class="col-4 mx-auto">
                <form action="CalNumber" method="post" class="form-group form-row">
                    <label class="col-3 form-control" for="number">Enter number : </label>
                    <input class="col-7 form-control" type="text" id="number" placeholder="enter..." name="number">
                    <input class="col-2 form-control" type="submit" value="Send">
                </form>
                <div class="col-8 mx-auto text-center">
                    <table class="mx-auto">
                        <tr>
                            <th class="col">number</th>
                            <th class="col"> x </th>
                            <th class="col">count</th> 
                            <th class="col"> = </th>
                            <th class="col">result</th> 
                        </tr>
                        <c:forEach items="${result}" var="re" varStatus="vs">
                            <tr>
                                <td>${cn.number}</td>
                                <td> x </td>
                                <td>${vs.count}</td>
                                <td> = </td>
                                <td>${re}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </section>

        <!-- Footer -->
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <span class="copyright">Copyright &copy; Your Website 2018</span>
                    </div>
                    <div class="col-md-4">
                        <ul class="list-inline social-buttons">
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-twitter"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-facebook"></i>
                                </a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">
                                    <i class="fa fa-linkedin"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <div class="col-md-4">
                        <ul class="list-inline quicklinks">
                            <li class="list-inline-item">
                                <a href="#">Privacy Policy</a>
                            </li>
                            <li class="list-inline-item">
                                <a href="#">Terms of Use</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>


        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <script src="js/agency.js"></script>

        <script src="js/datatables.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>

    </body>

</html>
