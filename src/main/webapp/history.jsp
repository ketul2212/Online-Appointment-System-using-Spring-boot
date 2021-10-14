<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>History</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">

    <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js" defer></script>


    <style>
        tfoot input {
            width: 100%;
            padding: 3px;
            box-sizing: border-box;
        }
       
    </style>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <div class="container">
		<h3>${pageContext.request.userPrincipal.name}</h3>
	
	 	<table id="example" class="display" style="width:100%">
            <thead>
                <tr>
                    <th>Appointment Id</th>
                    <th>Patient Email</th>
                    <th>createdAt</th>
                    <th>startTime</th>
                    <th>endTime</th>
                    <th>doctorName</th>
                    <th>status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="historyValue" items="${history}" varStatus="status">
                    <tr>
                    	<td>${historyValue.appointment.appointment_id}</td>
                        <td>${historyValue.patientName}</td>
                        <td>${historyValue.appointment.createdAt}</td>
                        <td>${historyValue.appointment.startTime}</td>
                        <td>${historyValue.appointment.endTime}</td>
                        <td>${historyValue.appointment.doctorName}</td>
                        <td>${historyValue.appointment.status}</td>
                    </tr>
                </c:forEach>
            </tbody>
            <tfoot>
                <tr>
                    <th>Appointment Id</th>
                    <th>Patient Email</th>
                    <th>createdAt</th>
                    <th>startTime</th>
                    <th>endTime</th>
                    <th>doctorName</th>
                    <th>status</th>
                </tr>
            </tfoot>
        </table>
   	</div>
</body>
</html>