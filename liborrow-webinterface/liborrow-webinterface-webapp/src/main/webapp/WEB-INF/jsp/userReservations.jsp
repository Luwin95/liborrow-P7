<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Mes Réservations</title>
	<s:head />
</head>
<body>
	<div class="card">
	   <h1 class="card-title">Liste des Réservations en cours</h1>
	   <ul class="list-group list-group-flush">
	   		<s:if test="%{error!=null}"><li class="list-group-item"><div class="alert alert-danger">Une erreur s'est produite lors de la prolongation de votre prêt</div></li></s:if>
		    <li class="list-group-item">
		    	<s:if test="%{reservations!=null && reservations.size()!=0}">
					<h2 class="card-title">Prêts en cours</h2>
					<table class="table table-striped">
					  <thead class="thead-inverse">
					    <tr>
					      <th>#</th>
					      <th>Item</th>
					      <th>Position dans la liste d'attente</th>
					      <th>Annuler</th>
					    </tr>
					  </thead>
					  <tbody>
					    <s:iterator value="reservations" status="status">
					    	<tr>
						      <th scope="row"><s:property value="%{#status.index+1}"/></th>
						      <td>
						      	<s:if test="%{bookDTO!=null}">
						      		<s:property value="bookDTO.title"/>
						      	</s:if>
						      	<s:else>
						      		<s:property value="magazineDTO.name"/> n°<s:property value="magazineDTO.editionNumber"/>
						      	</s:else>
						      </td>
						      <td><s:property value="position"/></td>
						      <s:if test="%{bookDTO!=null}">
						      	     <s:url action="cancelReservationBook" namespace="/liborrow" var="urlCancel">
								       <s:param name="itemId"><s:property value="bookDTO.id"/></s:param>
								     </s:url>
						      </s:if>
					      	  <s:else>
					      	  		<s:url action="cancelReservationMagazine" namespace="/liborrow" var="urlCancel">
								       <s:param name="itemId"><s:property value="magazineDTO.id"/></s:param>
								     </s:url>
					      	  </s:else>
					      	  <td><a class="btn btn-danger" href="${urlCancel}">Annuler</a></td>
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