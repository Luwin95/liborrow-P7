<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title><decorator:title default="Struts Starter"/></title>
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="<s:url value='/styles/main.css'/>" rel="stylesheet" type="text/css" media="all"/>
    <link href="<s:url value='/styles/footer.css'/>" rel="stylesheet" type="text/css" media="all"/>
    <link href="<s:url value='/struts/niftycorners/niftyCorners.css'/>" rel="stylesheet" type="text/css"/>
    <link href="<s:url value='/struts/niftycorners/niftyPrint.css'/>" rel="stylesheet" type="text/css" media="print"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous"/>
    <script src="https://use.fontawesome.com/661ec0b33d.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js" integrity="sha384-a5N7Y/aK3qNeh15eJKGWxsqtnX/wWdSZSKp+81YjTmS15nvnvxKHuzaWwXHDli+4" crossorigin="anonymous"></script>
    <decorator:head/>
</head> 
<body id="page-home">
    <div id="page" class="page">
        <div id="header" class="clearfix">
        	<nav class="navbar navbar-expand-md navbar-dark bg-primary">
	       		<div class="container">
				  <a class="navbar-brand" href="<s:url action="index" namespace="/liborrow"/>"><i class="fa fa-book" aria-hidden="true"></i> Liborrow</a>
				  <!-- Toggler/collapsibe Button -->
				  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
				    <span class="navbar-toggler-icon"></span>
				  </button>
				
				  <!-- Navbar links -->
				  <div class="collapse navbar-collapse" id="collapsibleNavbar">
				    <ul class="navbar-nav mr-auto">
				      <li class="nav-item">
				        <a class="nav-link" href="<s:url action="search" namespace="/liborrow"/>">Rechercher</a>
				      </li>
				      <li class="nav-item">
				        <a class="nav-link" href="<s:url action="currentBorrows" namespace="/liborrow"/>">Mes prêts en cours</a>
				      </li>
				   
				    </ul>
				    <ul class="navbar-nav ml-auto">
						<s:if test='#session.sessionUser != null'>
							<li class="nav-item dropdown">
	                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
	                            <i class="fa fa-user" aria-hidden="true"></i> Bienvenue, <s:property value="%{#session.sessionUser.firstname}"/> <s:property value="%{#session.sessionUser.lastname}"/><b class="caret"></b></a>
	                            <ul class="dropdown-menu">
	                                <li class="dropdown-item"><a href="<s:url action="logout" namespace="/liborrow"/>">Se déconnecter</a></li>
	                            </ul>
							</li>
						</s:if>
				    </ul>
				  </div> 
			  </div>
			</nav>
        </div>
        
        <div id="content" class="clearfix content container">
            <div id="main">
            	<decorator:body/>
                <hr />
            </div>
            <div class="push"></div>
        </div>
        
    </div>
    <footer class="footer bg-primary">
      	<div class="container">
      		<div class="footer-text">
      			<p class="">Copyright 2018 | All rights reserved to Ben's Company | <a href="https://github.com/Luwin95/liborrow">Contribuate on github <i class="fa fa-github" aria-hidden="true"></i></a></p>
      		</div>
      	</div>
    </footer>
</body>
</html>
