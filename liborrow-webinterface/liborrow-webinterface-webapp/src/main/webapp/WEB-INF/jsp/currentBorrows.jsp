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
	<h1>Liste des pr�ts en cours</h1>
	<s:if test="%{borrows!=null && borrows.size()!=0}">
		<h2>Pr�ts en cours</h2>
		<table class="table table-striped">
		  <thead class="thead-inverse">
		    <tr>
		      <th>#</th>
		      <th>Item</th>
		      <th>Date de d�but</th>
		      <th>Date de fin</th>
		      <th>Rallong�</th>
		    </tr>
		  </thead>
		  <tbody>
		    <s:iterator value="borrows" status="status">
				<tr class="<s:if test="%{endDate.toGregorianCalendar().compareTo(now)}">bg-danger</s:if>" >
			      <th scope="row"><s:property value="%{#status.index+1}"/></th>
			      <td>
			      	<s:if test="%{bookDTO!=null}">
			      		<s:property value="bookDTO.title"/>
			      	</s:if>
			      	<s:else>
			      		<s:property value="magazineDTO.name"/> n�<s:property value="magazineDTO.editionNumber"/>
			      	</s:else>
			      </td>
			      <td><s:property value="startDate"/></td>
			      <td><s:property value="endDate"/></td>
			      <td><s:if test="extended">Oui</s:if><s:else>Non</s:else></td>
			    </tr>
			</s:iterator>
		  </tbody>
		</table>
	</s:if>
</body>
</html>