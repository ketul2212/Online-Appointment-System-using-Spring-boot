<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Doctors</title>
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
        tbody td {
        	text-align: center;
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
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>specialization</th>
                    <th>experience</th>
                    <th>clinic name</th>
                    <th>clinic address</th>
                    <th>Doctor Profile</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="doctorValue" items="${doctor}" varStatus="status">
                    <tr>
                        <td>${doctorValue.fname}</td>
                        <td>${doctorValue.lname}</td>
                        <td>${doctorValue.spacialization}</td>
                        <td>${doctorValue.experience}</td>
                        <td>${doctorValue.nclinic}</td>
                        <td>${doctorValue.aclinic}</td>
                        <td><img alt="img" src="/home/ketul/Documents/workspace-spring-tool-suite-4-4.12.0.RELEASE/OnlineAppointment-1/user-photos/${doctorValue.email}/${doctorValue.profile}" /></td>
                    	<td>user-photos/${doctorValue.email}/${doctorValue.profile}</td>
                    </tr>
                </c:forEach>
            </tbody>
            <tfoot>
                <tr>
                    <th class="sp">First Name</th>
                    <th>Last Name</th>
                    <th class="sp">specialization</th>
                    <th>experience</th>
                    <th>clinic name</th>
                    <th>clinic address</th>
                    <th>Doctor Profile</th>
                </tr>
            </tfoot>
        </table>
        
        
        <script>
            $(document).ready(function () {
                // Setup - add a text input to each footer cell
                $('.sp').each(function () {
                    var title = $(this).text();
                    $(this).html('<input type="text" placeholder="Search ' + title + '" />');
                });

                // DataTable
                var table = $('#example').DataTable({
                    initComplete: function () {
                        // Apply the search
                        this.api().columns().every(function () {
                            var that = this;

                            $('input', this.footer()).on('keyup change clear', function () {
                                if (that.search() !== this.value) {
                                    that
                                        .search(this.value)
                                        .draw();
                                }
                            });
                        });
                    }
                });

            });
        </script>


    </div>


</body>


</html>