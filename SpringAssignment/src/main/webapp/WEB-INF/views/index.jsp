<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
	<div class="row">
		
	
		<div class="col-sm-8 col-sm-offset-2">
			<div class="text-center">
				<h2><spring:message code="form.name"></spring:message></h2>
			</div>
			<hr>
			<div class="col-sm-8 col-sm-offset-2">
			<form:errors path="user.*"/>
			<form action="registerUser" method="POST" class="form-horizontal" onsubmit="return checkPassword();">
				<div class="form-group">
					<label class="control-label col-sm-3"><spring:message code="feild.name"></spring:message></label>
					<div class="col-sm-9">
						<input type="text" name="name" class="form-control" required>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3"><spring:message code="feild.email"></spring:message></label>
					<div class="col-sm-9">
						<input type="email" name="email" class="form-control" required>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3"><spring:message code="feild.contact"></spring:message></label>
					<div class="col-sm-9">
						<input type="tel" name="contact" class="form-control" required>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3"><spring:message code="feild.gender"></spring:message></label>
					<div class="radio col-sm-9">
						<label><input type="radio" name="gender" value="Male"><spring:message code="gender.male"></spring:message></label>
						<label><input type="radio" name="gender" value="Female"><spring:message code="gender.female"></spring:message></label>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3"><spring:message code="feild.password"></spring:message></label>
					<div class="col-sm-9">
						<input type="password" name="password" id="password" class="form-control" required>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-3"><spring:message code="feild.confirmPassword"></spring:message></label>
					<div class="col-sm-9">
						<input type="password" id="confirmPassword" class="form-control" required>
					</div>
				</div>
				<div class="text-center">
					<input type="submit" class="btn btn-success">
				</div>
			</form>
			</div>
		</div>
	</div>
	</div>
	<script type="text/javascript">
		function checkPassword(){
			if($('#password').val()===$('#confirmPassword').val())
				return true;
			else{
				alert("Mismatch password");
				return false;
			}
		}
	</script>
</body>
</html>
