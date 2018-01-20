<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Book</title>
	<s:head />
</head>
<body>
	<h1><s:property value="book.title"/></h1>
	<ul>
		<li>Auteurs : 
			<ul>
				<s:iterator value="book.authors">
					<li><s:property value="firstname"/> <s:property value="name"/></li>
				</s:iterator>
			</ul>
		</li>
		<li>Langue : <s:property value="book.language"/></li>
		<li>Editeur : <s:property value="book.editor"/></li>
		<li>Nombre d'exemplaires : <s:property value="book.totalCount"/></li>
		<li>Nombre d'exemplaires disponibles : <s:property value="book.remainingCount"/></li>
	</ul>
	<s:if test="%{book.borrows!=null && book.borrows.size()!=0}">
		<h2>Pr�ts en cours</h2>
		<table class="table table-striped">
		  <thead class="thead-inverse">
		    <tr>
		      <th>#</th>
		      <th>Date de d�but</th>
		      <th>Date de fin</th>
		      <th>Rallong�</th>
		      <th>Emprunteur</th>
		    </tr>
		  </thead>
		  <tbody>
		    <s:iterator value="book.borrows" status="status">
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
