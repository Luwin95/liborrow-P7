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
	        <a href="<s:url action="search" namespace="liborrow"/>" class="btn btn-primary">Rechercher des ouvrages</a>
	      </div>
	      <ul class="list-group list-group-flush">
		    <li class="list-group-item">
		    	<h3 class="card-title">Livres récemment ajoutés</h3>
		    	<p class="card-text">
		    		<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Titre</th>
					      <th>Editeur</th>
					      <th>Langue</th>
					      <th>Auteur</th>
					      <th>Restant</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="searchResponse.books" status="status">
							<tr>
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <s:url action="book" var="bookUrl" namespace="/liborrow" >
								    <s:param name="idBook"><s:property value="id"/></s:param>
							  </s:url>
						      <td><a href="${bookUrl}"><s:property value="title"/></a></td>
						      <td><s:property value="editor"/></td>
						      <td><s:property value="language"/></td>
						      <td>
						      	<ul>
						      		<s:iterator value="authors"><li><s:property value="firstname"/> <s:property value="name"/></li></s:iterator>
						      	</ul>
						      </td>
						      <td><s:property value="remainingCount"/></td>
						    </tr>
						</s:iterator>
					  </tbody>
					</table>
		    	</p>
		    </li>
		    <li class="list-group-item">
		    	<h3 class="card-title">Revus récemment ajoutées</h3>
		    	<p class="card-text">
		    		<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Nom</th>
					      <th>Numéro</th>
					      <th>Date de sortie</th>
					      <th>Restant</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="searchResponse.magazines" status="status">
							<tr>
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <s:url action="magazine" var="magazineUrl" namespace="/liborrow" >
								    <s:param name="idMagazine"><s:property value="id"/></s:param>
							  </s:url>
						      <td><a href="${magazineUrl}"><s:property value="name"/></a></td>
						      <td><s:property value="editionNumber"/></td>
						      <td><s:property value="publishDate.toGregorianCalendar().getTime()"/></td>
						      <td><s:property value="remainingCount"/></td>
						    </tr>
						</s:iterator>
					  </tbody>
					</table>
		    	</p>
		    </li>
		    <li class="list-group-item">
		    	<h3 class="card-title">Auteurs récemment ajoutés</h3>
		    	<p class="card-text">
		    		<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Nom</th>
					      <th>Prénom</th>
					      <th>Nationalités</th>
					      <th>Livres</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="searchResponse.authors" status="status">
							<tr>
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <td><s:property value="name"/></td>
						      <td><s:property value="firstname"/></td>
						      <td>
						      	<ul>
						      		<s:iterator value="citizenships"><li><s:property value="countryname"/></li></s:iterator>
						      	</ul>
						      </td>
						      <td>
						      	<ul>
						      		<s:iterator value="books"><li><s:property value="title"/> chez <s:property value="editor"/></li></s:iterator>
						      	</ul>
						      </td>
						    </tr>
						</s:iterator>
					  </tbody>
					</table>
		    	</p>
		    </li>
		  </ul>
	    </div>
	  </div>
	  <div class="col-sm-3">
	    <div class="card">
	        <h3 class="card-title">Mes prêts</h3>
	        <ul class="list-group list-group-flush">
			    <li class="list-group-item">
			    	<h5 class="card-title">Nombre de prêt en cours</h5>
	    			<p><s:property value="nbBorrows"/></p>
			    </li>
			    <li class="list-group-item <s:if test="nbLate>0">bg-danger</s:if>">
			    	<h5 class="card-title">Nombre de prêt en retard</h5>
			    	<div class="row">
			    		<div class="nbCircle">
			    			<p><s:property value="nbLate"/></p>
			    		</div>
			    	</div>
			    </li>
			    <li class="list-group-item">
			    	<a href="<s:url action="currentBorrows" namespace="/liborrow"/>" class="btn btn-primary">Mes prêts</a>
			    </li>
			</ul>
	    </div>
	  </div>
	</div>
</body>
</html>
	