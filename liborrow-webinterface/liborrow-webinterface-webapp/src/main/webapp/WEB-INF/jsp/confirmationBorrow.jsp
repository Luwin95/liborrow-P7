<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Confirmation Prêt</title>
</head>
<body>
	<h2>Prêts en cours</h2>
	<table class="table table-striped">
	  <thead class="thead-inverse">
	    <tr>
	      <th>#</th>
	      <th>Item</th>
	      <th>Date de début</th>
	      <th>Date de fin</th>
	      <th>Supprimer</th>
	    </tr>
	  </thead>
	  <tbody>
	    <s:iterator value="borrows" status="status">
			<tr >
		      <th scope="row"><s:property value="%{#status.index+1}"/></th>
		      <td>
		      	<s:if test="%{bookDTO!=null}">
		      		<s:property value="bookDTO.title"/>
		      	</s:if>
		      	<s:else>
		      		<s:property value="magazineDTO.name"/> n°<s:property value="magazineDTO.editionNumber"/>
		      	</s:else>
		      </td>
		      <td><s:property value="startDate"/></td>
		      <td><s:property value="endDate"/></td>
		      <s:url action="deleteFromBox" namespace="/librarian" var="urlDelete">
		      	<s:param name="idBorrow"><s:property value="%{#status.index}"/></s:param>
		      </s:url>
		      <td><s:if test="extended">Impossible</s:if><s:else><a class="btn btn-danger" href="${urlDelete}">Supprimer</a></s:else></td>
		    </tr>
		</s:iterator>
	  </tbody>
	</table>
</body>
</html>