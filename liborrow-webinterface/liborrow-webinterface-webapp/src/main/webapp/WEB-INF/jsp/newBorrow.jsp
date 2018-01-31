<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Créer un prêt</title>
</head>
<body>
	<h1>Rechercher un utilisateur...</h1>
	<s:if test="%{message!=null}"><div class="alert alert-danger"><s:property value="message"/></div></s:if>
	<div id="singleStringSearch">
		<s:form action="newBorrow">
			<s:textfield  name="userCriterias.email" label="Email" cssClass="form-control"/>
			<s:textfield  name="userCriterias.lastname" label="Nom" cssClass="form-control"/>
			<s:textfield  name="userCriterias.firstname" label="Prénom" cssClass="form-control"/>
			<s:submit cssClass="btn btn-warning"/>
		</s:form>
	</div>
	<s:if test="%{users!=null && users.size()>0}">
		<h3>Utilisateurs</h3>
		<table class="table table-striped">
		  <thead class="thead-inverse">
		    <tr>
		      <th>#</th>
		      <th>Nom</th>
		      <th>Prénom</th>
		      <th>Email</th>
		    </tr>
		  </thead>
		  <tbody>
		    <s:iterator value="users" status="status">
				<tr>
			      <th scope="row"><s:property value="%{#status.index+1}"/></th>
			      <td><a href="#"><s:property value="lastname"/></a></td>
			      <td><s:property value="firstname"/></td>
			      <td><s:property value="email"/></td>
			    </tr>
			</s:iterator>
		  </tbody>
		</table>
	</s:if>
</body>
</html>