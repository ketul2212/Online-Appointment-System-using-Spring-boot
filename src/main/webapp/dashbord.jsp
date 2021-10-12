<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Dashboard</title>
    
    <link href="//cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" />
    
   	<link  rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
	<script  type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script  type="text/javascript" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js" defer></script>
    
	</head>

<body>
<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout"></form>
        <h4>Welcome : ${pageContext.request.userPrincipal.name}</h4> | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        <h4>Role : ${pageContext.request.userPrincipal.authorities}</h4>
    </c:if>
    <sec:authorize access="hasRole('ROLE_DOCTOR')">
    	<nav class="navbar navbar-expand-lg navbar-light bg-light">
        	<div class="collapse navbar-collapse" id="navbarAdmin">
            	<div class="navbar-nav">
                	<a class="nav-item nav-link" href="${contextPath}/dashbord/availability">Add Availability</a>
                    <a class="nav-item nav-link" href="${contextPath}/dashboard">History</a>
                    <a class="nav-item nav-link" href="${contextPath}/appointments">Appointments</a>
                    <a class="nav-item nav-link" href="${contextPath}/updateProfile">Update Profile</a>
                </div>
             </div>
        </nav>
     </sec:authorize>
     <sec:authorize access="hasRole('ROLE_PATIENT')">
     	<nav class="navbar navbar-expand-lg navbar-light bg-light">
        	<div class="collapse navbar-collapse" id="navbarManager">
            	<div class="navbar-nav">
                	<a class="nav-item nav-link" href="${contextPath}/appointment">Add Appointment</a>
                	<a class="nav-item nav-link" href="${contextPath}/dashboard">History</a>
                    <a class="nav-item nav-link" href="${contextPath}/show">show doctor</a>
                    <a class="nav-item nav-link" href="${contextPath}/updateProfile">Update Profile</a>
                </div>
            </div>
        </nav>
    </sec:authorize>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
    </script>
<script>
    toastr.success('${loginSuccess}', '<p style = "color:blue;">Login success</p>');
</script>
</body>
</html>