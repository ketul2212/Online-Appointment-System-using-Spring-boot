<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
	<title>Appointment</title>
	<meta charset="utf-8">
    <meta nPMe="viewport" content="width=device-width, initial-scale=1">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <style>
        form {
            margin-top: 0px;
        }

        @media only screen and (max-width: 991px) {
            img {
                display: none;
            }
        }

        input {
            size: 0px;
        }
    </style>

    <script>
        $(function () {
            $(".datepicker").datepicker({
                minDate: -0,
                maxDate: "+6D"
            });
            $('.basicExPMple').timepicker();
        });
    </script>
</head>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
    </script>


    <div class="container">
        <form action="./addAppointment" method="POST">

            <div class="row">
                <div class="col-sm mt-sm-5">
                    <h1>Appointment Form</h1>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="date" class="form-label">Date</label>
                                <input type="text" name="date" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

							<div class="col-sm">
								<label for="doctor" class="form-label">Choose Doctor</label>
								<select name="doctorName" class="form-control">
									<option value="">Choose Doctor</option>
									<c:forEach var="doctorValue" items="${doctor}" varStatus="status">
                    				
                        				<option value= ${doctorValue.fname}>${doctorValue.fname}</option>
                    				
                					</c:forEach>
                				</select>
							</div>
                            <div class="col-sm">
                                <div class="row">
                                    <div class="col-sm">
                                        <label for="startTime" class="form-label">Start Time</label>
                                        <select name="startTime" class="form-control">
                                            <option value="">Select Time</option>
                                            <option value="12:00AM">12:00AM</option>
                                            <option value="1:00AM">01:00AM</option>
                                            <option value="2:00AM">02:00AM</option>
                                            <option value="3:00AM">03:00AM</option>
                                            <option value="4:00AM">04:00AM</option>
                                            <option value="5:00AM">05:00AM</option>
                                            <option value="6:00AM">06:00AM</option>
                                            <option value="7:00AM">07:00AM</option>
                                            <option value="8:00AM">08:00AM</option>
                                            <option value="9:00AM">09:00AM</option>
                                            <option value="10:00AM">10:00AM</option>
                                            <option value="11:00AM">11:00AM</option>

                                            <option value="12:00PM">12:00PM</option>
                                            <option value="1:00PM">01:00PM</option>
                                            <option value="2:00PM">02:00PM</option>
                                            <option value="3:00PM">03:00PM</option>
                                            <option value="4:00PM">04:00PM</option>
                                            <option value="5:00PM">05:00PM</option>
                                            <option value="6:00PM">06:00PM</option>
                                            <option value="7:00PM">07:00PM</option>
                                            <option value="8:00PM">08:00PM</option>
                                            <option value="9:00PM">09:00PM</option>
                                            <option value="10:00PM">10:00PM</option>
                                            <option value="11:00PM">11:00PM</option>
                                        </select>
                                    </div>
                                </div>

                            </div>
                        </div>

                      </div>  

                    <input type="submit" value="Register" name="submit" class="btn btn-primary mt-3" />
                </div>
            </div>
        </form>
    </div>
</body>
</html>