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
	<div class="row justify-content-sm-center">
		<div class="col-sm-4">
			<s:if test="%{reservationResponse!=null}">
				<s:if test="%{reservationResponse.responseType == 'success'}">
					<div class="alert alert-success"><s:property value="reservationResponse.message"/></div>
				</s:if>
				<s:if test="%{reservationResponse.responseType == 'error'}">
					<div class="alert alert-danger"><s:property value="reservationResponse.message"/></div>
				</s:if>
			</s:if>
			<div class="card">
				<s:if test="magazine.image !=null">
					<img class="card-img-top item-image" src="/resources/<s:property value="magazine.image.path"/>" alt="Card image cap">
				</s:if>
				<div class="card-header">
				    <h4><s:property value="magazine.name"/></h4>
				</div>
				<ul>
					<li>Num�ro : <s:property value="magazine.editionNumber"/></li>
					<li>Date de publication : <s:property value="magazine.publishDate.toGregorianCalendar().getTime()"/></li>
					<li>Nombre d'exemplaires : <s:property value="magazine.totalCount"/></li>
					<li>Nombre d'exemplaires disponibles : <s:property value="magazine.remainingCount"/></li>
				</ul>
				<s:if test="book.remainingCount==0">
					<div class="card-footer">
						<s:url action="reserveMagazine" namespace="/liborrow" var="urlReservationItem">
					      <s:param name="itemId"><s:property value="magazine.id"/></s:param>
					    </s:url>
						<a class="btn btn-info" href="${urlReservationItem}">R�server</a>
					</div>
				</s:if>
			</div>
		</div>
	</div>
</body>
</html>