<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Update Profile</title>

<style>
        form {
            margin-top: 0px;
        }

        @media only screen and (max-width: 991px) {
            img {
                display: none;
            }
        }
    </style>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<div class="container">
        <form action="./update" method = "GET" >

            <div class="row">
                <div class="col-sm mt-sm-5">
                    <h1>Update Form</h1>

                    
					<sec:authorize access="hasRole('ROLE_DOCTOR')">
					
                    <div id="doctor">
                        <div class="mb-3">
                            <div class="row">
                                <div class="col-sm">
                                    <label for="degree" class="form-label">Degree</label>
                                    <input type="text" name="degree" class="form-control" placeholder="Degree...">
                                </div>

                                <div class="col-sm">
                                    <label for="spacialization" class="form-label">Spacialization</label>
                                    <input type="text" name="spacialization" class="form-control"
                                        placeholder="specialization...">
                                </div>
                                
                                <div class="col-sm">
                                    <label for="experience" class="form-label">Experience</label>
                                    <input type="number" name="experience" class="form-control"
                                        placeholder="(year)..." min="0">
                                </div>
                            </div>
                        </div>

                        <div class="mb-3">
                            <label for="nclinic" class="form-label">Clinic Name</label>
                            <input type="text" name="nclinic" class="form-control" placeholder="Clinic Name...">
                        </div>

                        <div class="mb-3">
                            <label for="aclinic" class="form-label">Clinic Address</label>
                            <textarea class="form-control" name="aclinic" rows="3" placeholder="Clinic Address"></textarea>
                        </div>

                        <div class="form-group">
                            <label for="profile">Enter Your Photo</label>
                            <input type="file" name="profile" class="form-control-file" accept="image/*">
                        </div>


                    </div>
					</sec:authorize>
     				<sec:authorize access="hasRole('ROLE_PATIENT')">
                    <div id="patient">
                        <div class="mb-3">
                            <div class="row">
                                <div class="col-sm">
                                    <label for="number" class="form-label">Number</label>
                                    <input type="number" name="number" class="form-control" placeholder="Number..."
                                        min="0" minlength="10" maxlength="10">
                                </div>

                                <div class="col-sm">
                                    <label for="age" class="form-label">Age</label>
                                    <input type="number" name="age" class="form-control" placeholder="Age..." min="0">
                                </div>
                            </div>
                        </div>

                        <div class="mb-3">
                            <div class="row">
                                <div class="col-sm">
                                    <label for="gender" class="form-label">Gender</label>
                                    <select name="gender" class="form-control">
                                        <option value="">Select Gender</option>
                                        <option value="male">Male</option>
                                        <option value="female">Female</option>
                                    </select>
                                </div>

                                <div class="col-sm">
                                    <label for="bloodgroup" class="form-label">Age</label>
                                    <select name="bloodgroup" class="form-control">
                                        <option value="">Select BloodGroup</option>
                                        <option value="A+">A+</option>
                                        <option value="A-">A-</option>
                                        <option value="B+">B+</option>
                                        <option value="B-">B-</option>
                                        <option value="O+">O+</option>
                                        <option value="O-">O-</option>
                                        <option value="AB+">AB+</option>
                                        <option value="AB-">AB-</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
					</sec:authorize>
                    <input type="submit" value="Register" name="submit" class="btn btn-primary mt-3" />
                    <div class="mb-3">
                    
                    </div>
                </div>
                <div class="col-sm p-5">
                    <img src="./images/login.png" alt="#">
                </div>
            </div>
        </form>
    </div>
	
	
</body>
</html>