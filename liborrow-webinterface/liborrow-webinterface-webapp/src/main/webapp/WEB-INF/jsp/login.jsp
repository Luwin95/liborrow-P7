<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<title>Login</title>
		<s:head />
	</head>
	<body>
		<s:if test="%{message!=null}"><div class="alert alert-danger"><s:property value="message"/></div></s:if>
		<s:form action="login">
			<s:textfield label="Email" name="email" cssClass="form-control" />
			<s:password label="Password" name="plainPassword" cssClass="form-control"/>
			<s:submit />
		</s:form>
	</body>
</html>
	