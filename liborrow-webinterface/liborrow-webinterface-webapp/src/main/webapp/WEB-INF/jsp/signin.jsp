<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<title>Signin</title>
		<s:head />
	</head>
	<body>
		<div class="row justify-content-sm-center">
			<div class="col-sm-8">
				<div class="card">
					<div class="card-header">
				    	<h4>S'inscrire</h4>
					</div>
					<div class="card-block">
							<s:if test="%{message!=null}"><div class="alert alert-danger"><s:property value="message"/></div></s:if>
							<s:form action="signin" cssClass="justify-content-sm-center">
								<s:textfield label="Email" name="user.email" cssClass="form-control" />
								<s:password label="Mot de passe" name="user.password" cssClass="form-control"/>
								<s:password label="Mot de passe" name="passwordRepeat" cssClass="form-control"/>
								<s:textfield label="Prénom" name="user.firstname" cssClass="form-control" />
								<s:textfield label="Nom de famille" name="user.lastname" cssClass="form-control" />
								<s:textfield label="Adresse" name="user.address"  cssClass="form-control" />
								<s:textfield label="Code postale" name="user.postCode" cssClass="form-control" />
								<s:textfield label="Téléphone" name="user.phoneNumber" cssClass="form-control" />
								<s:select label="Pays" 
									headerKey="-1" headerValue="Sélectionner un pays"
									list="citizenships"
									value="user.citizenship.countryName" 
									name="citizenshipSelected" />
								<s:checkbox name="user.recall" fieldValue="true" value="true" label="M'envoyer un rappel par mail 5 jours avant la fin de mes prêts"/>
								<s:submit value="Créer un compte" cssClass="btn btn-warning"/>
							</s:form>
					</div>
					<div class="card-footer">
						Déja inscrit ? <a href="<s:url action="loginHome" namespace="/"/>">Se connecter</a>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
	