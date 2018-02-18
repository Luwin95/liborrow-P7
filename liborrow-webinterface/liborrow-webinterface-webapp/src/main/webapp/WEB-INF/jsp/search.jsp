<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<title>Rechercher un ouvrage</title>
		<s:head />
	</head>
	<body>
		<div class="card">
		   <h1 class="card-title">Rechercher un ouvrage, magazine, auteur...</h1>
		   <ul class="list-group list-group-flush">
			    <li class="list-group-item">
			    	<s:if test="%{message!=null}"><div class="alert alert-danger"><s:property value="message"/></div></s:if>
					<div id="singleStringSearch">
						<s:form action="searchItem">
							<s:textfield  name="search" cssClass="form-control"/>
							<s:submit cssClass="btn btn-warning"/>
						</s:form>
					</div>
					<s:checkbox name="addCriteria" id="addCriteria" label="Recherche Multicritères"/>
					<div id="criterias" style="display:none;">
						<h3>Rechercher un  :</h3>
						<label><input type="radio" name="criterias" value="book" id="criteriaBook" checked/>Livre </label>
						<label><input type="radio" name="criterias" value="author" id="criteriaAuthor"/>Auteur </label>
						<label><input type="radio" name="criterias" value="magazine" id="criteriaMagazine"/>Magazine </label>
						<s:form action="searchBook" id="formBook">
							<s:textfield label="Titre "  name="itemCriterias.bookCriterias.title" cssClass="form-control"/>
							<s:textfield label="Editeur  " name="itemCriterias.bookCriterias.editor" cssClass="form-control"/>
							<!--<s:textfield label="Date de sortie " name="itemCriterias.bookCriterias.release" cssClass="form-control"/> -->
							<s:textfield label="Référence item " name="itemCriterias.itemRef" cssClass="form-control"/>
							<s:hidden name="itemCriterias.bookSearch" value="true"/>
							<s:submit cssClass="btn btn-warning"/>
						</s:form>
						
						<s:form action="searchAuthor" id="formAuthor">
							<s:textfield label="Prénom "  name="itemCriterias.authorCriterias.firstname" cssClass="form-control"/>
							<s:textfield label="Nom  " name="itemCriterias.authorCriterias.lastname" cssClass="form-control"/>
							<!--<s:textfield label="Année de naissance " name="itemCriterias.authorCriterias.birth" cssClass="form-control"/>
							<s:textfield label="Année de décès " name="itemCriterias.authorCriterias.death" cssClass="form-control"/>-->
							<s:hidden name="itemCriterias.authorSearch" value="true"/>
							<s:submit cssClass="btn btn-warning"/>
						</s:form>
						
						<s:form action="searchMagazine" id="formMagazine">
							<s:textfield label="Nom "  name="itemCriterias.magazineCriterias.name" cssClass="form-control"/>
							<s:textfield label="Numéro " name="itemCriterias.magazineCriterias.editionNumber" cssClass="form-control"/>
							<!--<s:textfield label="Date de sortie " name="itemCriterias.magazineCriterias.publishDate" cssClass="form-control"/>-->
							<s:textfield label="Référence item " name="itemCriterias.itemRef" cssClass="form-control"/>
							<s:hidden name="itemCriterias.magazineSearch" value="true"/>
							<s:submit cssClass="btn btn-warning"/>
						</s:form>
					</div>
			    </li>
			    <s:if test="reponse">
			    	<li class="list-group-item">
				    	<h2 class="card-title">Résultats</h2>
						<s:if test="%{bookResponse!=null && bookResponse.size()!=0}">
							<h3>Livres</h3>
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
							    <s:iterator value="bookResponse" status="status">
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
								      <s:url action="addToBox" namespace="/librarian" var="urlAddToBoxBook">
								      	<s:param name="objectType">book</s:param>
								      	<s:param name="objectId"><s:property value="id"/></s:param>
								      </s:url>
								    </tr>
								</s:iterator>
							  </tbody>
							</table>
						</s:if>
						<s:if test="%{authorResponse!=null && authorResponse.size()!=0}">
							<h3>Auteurs</h3>
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
							    <s:iterator value="authorResponse" status="status">
									<tr>
								      <th scope="row"><s:property value="%{#status.index+1}"/></th>
								      <td><s:property value="name"/></td>
								      <td><s:property value="firstname"/></td>
								      <td>
								      	<ul>
								      		<s:iterator value="citizenships"><li><s:property value="countryName"/></li></s:iterator>
								      	</ul>
								      </td>
								      <td>
								      	<ul>
								      		<s:iterator value="books">
								      			<s:url action="book" var="authorBookUrl" namespace="/liborrow" >
													<s:param name="idBook"><s:property value="id"/></s:param>
												</s:url>
								      			<li><a href="${authorBookUrl}"><s:property value="title"/></a> chez <s:property value="editor"/></li>
								      		</s:iterator>
								      	</ul>
								      </td>
								    </tr>
								</s:iterator>
							  </tbody>
							</table>
						</s:if>
						<s:if test="%{magazineResponse!=null && magazineResponse.size()!=0}">
							<h3>Magazines</h3>
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
							    <s:iterator value="magazineResponse" status="status">
									<tr>
								      <th scope="row"><s:property value="%{#status.index+1}"/></th>
								      <s:url action="magazine" var="magazineUrl" namespace="/liborrow" >
										    <s:param name="idMagazine"><s:property value="id"/></s:param>
									  </s:url>
								      <td><a href="${magazineUrl}"><s:property value="name"/></a></td>
								      <td><s:property value="editionNumber"/></td>
								      <td><s:property value="publishDate.toGregorianCalendar().getTime()"/></td>
								      <td><s:property value="remainingCount"/></td>
								      <s:url action="addToBox" namespace="/librarian" var="urlAddToBoxMag">
								      	<s:param name="objectType">magazine</s:param>
								      	<s:param name="objectId"><s:property value="id"/></s:param>
								      </s:url>
								    </tr>
								</s:iterator>
							  </tbody>
							</table>
						</s:if>
			    	</li>
				</s:if>
				<s:else>
					<p>Aucun Résultat</p>
				</s:else>
		    </ul>
	    </div>
		<script type="text/javascript" src="<s:url value='/scripts/search.js'/>"></script>
	</body>
</html>
	