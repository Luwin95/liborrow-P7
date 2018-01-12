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
		<s:if test="%{bookResponse!=null && bookResponse.size()!=0}">
			<ul>
				<s:iterator value="bookResponse">
					<li><s:property value="title"/> <s:property value="editor"/></li>
				</s:iterator>
			</ul>
		</s:if>
	</body>
</html>
	