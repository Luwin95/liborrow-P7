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
	<div class="row justify-content-sm-center">
		<div class="col-sm-4">
			<div class="card">
				<s:if test="book.image !=null">
					<img class="card-img-top item-image" src="/resources/<s:property value="book.image.path"/>" alt="Card image cap">
				</s:if>
				
				<div class="card-header">
				    <h4><s:property value="book.title"/></h4>
				</div>
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
			</div>
		</div>
	</div>
</body>
</html>
