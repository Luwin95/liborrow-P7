<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<title>edit Account</title>
		<s:head />
	</head>
	<body>
		<div class="row justify-content-sm-center">
			<div class="col-sm-8">
				<div class="card">
					<div class="card-header">
				    	<h4>Modifier mon compte</h4>
					</div>
					<div class="card-block">
							<s:if test="%{message!=null}"><div class="alert alert-danger"><s:property value="message"/></div></s:if>
							<s:form action="editUser" cssClass="justify-content-sm-center">
								<s:textfield label="Email" name="userEdit.email" cssClass="form-control" />
								<s:textfield label="Prénom" name="userEdit.firstname" cssClass="form-control" />
								<s:textfield label="Nom de famille" name="userEdit.lastname" cssClass="form-control" />
								<s:textfield label="Adresse" name="userEdit.address"  cssClass="form-control" />
								<s:textfield label="Code postale" name="userEdit.postCode" cssClass="form-control" />
								<s:textfield label="Téléphone" name="userEdit.phoneNumber" cssClass="form-control" />
								<s:select label="Pays" headerKey="-1" headerValue="Sélectionner un pays" list="citizenships" name="userEdit.citizenship.countryName" />
								<s:checkbox name="userEdit.recall" fieldValue="true" label="M'envoyer un rappel par mail 5 jours avant la fin de mes prêts"/>
								<input type="hidden" name="userEdit.id" value="<s:property value="userEdit.id"/>"/>
								<s:submit value="Modifier compte" cssClass="btn btn-warning"/>
							</s:form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>