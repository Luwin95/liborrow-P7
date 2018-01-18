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
		<h1>Rechercher un ouvrage, magazine, auteur...</h1>
		<s:if test="%{message!=null}"><div class="alert alert-danger"><s:property value="message"/></div></s:if>
		<s:form action="search">
			<s:textfield  name="search" cssClass="form-control"/>
			<s:submit />
		</s:form>
		<h2>Résultats</h2>
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
				      <td><s:property value="title"/></td>
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
		</s:if>
		<s:else>
			<p>Aucun Résultat</p>
		</s:else>
	</body>
</html>
	