<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Magazine</title>
	<s:head />
</head>
<body>
	<h1><s:property value="magazine.name"/></h1>
	<ul>
		<li>Numéro : <s:property value="magazine.editionNumber"/></li>
		<li>Date de publication : <s:property value="magazine.publishDate"/></li>
		<li>Nombre d'exemplaires : <s:property value="magazine.totalCount"/></li>
		<li>Nombre d'exemplaires disponibles : <s:property value="magazine.remainingCount"/></li>
	</ul>
	<s:if test="%{magazine.borrows!=null && magazine.borrows.size()!=0}">
		<h2>Prêts en cours</h2>
		<table class="table table-striped">
		  <thead class="thead-inverse">
		    <tr>
		      <th>#</th>
		      <th>Date de début</th>
		      <th>Date de fin</th>
		      <th>Rallongé</th>
		      <th>Emprunteur</th>
		    </tr>
		  </thead>
		  <tbody>
		    <s:iterator value="magazine.borrows" status="status">
		    	<s:if test="%{getBackDate==null}">
					<tr>
				      <th scope="row"><s:property value="%{#status.index+1}"/></th>
				      <td><s:property value="startDate"/></td>
				      <td><s:property value="endDate"/></td>
				      <td><s:if test="extended">Oui</s:if><s:else>Non</s:else></td>
				      <td><s:property value="borrower.firstname"/> <s:property value="borrower.lastname"/></td>
				    </tr>
			    </s:if>
			</s:iterator>
		  </tbody>
		</table>
	</s:if>
</body>
</html>