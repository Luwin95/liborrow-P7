<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Index</title>
	<s:head />
</head>
<body>
	<div class="row">
	  <div class="col-sm-9">
	    <div class="card">
	      <img class="card-img-top" src="<s:url value='/images/books-1281581_1920.jpg'/>" alt="Card image cap">
	      <div class="card-block">
	        <h3 class="card-title">Bienvenue sur le site de votre bibliothèque</h3>
	        <p class="card-text">Retrouvez tous vos livres et revues préférés sur ce site! 
	        Consultez vos prêts en cours ainsi que les disponibilités de vos livres préférés. Vous pouvez également prolonger
	        vos prêts dans la limite d'un renouvellement par prêt.</p>
	        <a href="#" class="btn btn-primary">Rechercher des ouvrages</a>
	      </div>
	      <ul class="list-group list-group-flush">
		    <li class="list-group-item"><h3 class="card-title"><span class="glyphicon glyphicon-book"></span> Livres récemment ajoutés</h3></li>
		    <li class="list-group-item"><h3 class="card-title">Revus récemment ajoutées</h3></li>
		    <li class="list-group-item"><h3 class="card-title">Auteurs récemment ajoutés</h3></li>
		  </ul>
	    </div>
	  </div>
	  <div class="col-sm-3">
	    <div class="card">
	      <div class="card-block">
	        <h3 class="card-title">Mes prêts</h3>
	        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
	        <a href="#" class="btn btn-primary">Go somewhere</a>
	      </div>
	    </div>
	  </div>
	</div>
</body>
</html>
	