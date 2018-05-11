<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Mes Prêts</title>
	<s:head />
</head>
<body>
	<div class="card">
	   <h1 class="card-title">Liste des prêts en cours</h1>
	   <ul class="list-group list-group-flush">
	   		<s:if test="%{error!=null}"><li class="list-group-item"><div class="alert alert-danger">Une erreur s'est produite lors de la prolongation de votre prêt</div></li></s:if>
		    <li class="list-group-item">
		    	<s:if test="%{borrows!=null && borrows.size()!=0}">
					<h2 class="card-title">Prêts en cours</h2>
					<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Item</th>
					      <th>Date de début</th>
					      <th>Date de fin</th>
					      <th>Rallongé</th>
					      <th>Prolonger</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="borrows" status="status">
							<tr class="<s:if test="%{now.compareTo(endDate.toGregorianCalendar())>0}">bg-danger</s:if>" >
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <td>
						      	<s:if test="%{bookDTO!=null}">
						      		<s:property value="bookDTO.title"/>
						      	</s:if>
						      	<s:else>
						      		<s:property value="magazineDTO.name"/> n°<s:property value="magazineDTO.editionNumber"/>
						      	</s:else>
						      </td>
						      <td><s:property value="startDate.toGregorianCalendar().getTime()"/></td>
						      <td><s:property value="endDate.toGregorianCalendar().getTime()"/></td>
						      <td><s:if test="extended">Oui</s:if><s:else>Non</s:else></td>
						      <s:url action="extendBorrow" namespace="/liborrow" var="urlBorrow">
						      	<s:param name="idBorrow"><s:property value="id"/></s:param>
						      </s:url>
						      <td><s:if test="extended || endDate.toGregorianCalendar().before(now)">Impossible</s:if><s:else><a class="btn btn-info" href="${urlBorrow}">Prolonger prêt</a></s:else></td>
						    </tr>
						</s:iterator>
					  </tbody>
					</table>
				</s:if>
		    </li>
	    </ul>
    </div>
</body>
</html>