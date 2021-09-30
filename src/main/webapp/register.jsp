<!doctype html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

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

    <title>Register</title>
</head>

<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <div class="container">
        <form action="./reg" method = "POST" >

            <div class="row">
                <div class="col-sm mt-sm-5">
                    <h1>Register Form</h1>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="fname" class="form-label">First Name</label>
                                <input type="text" name="fname" class="form-control" placeholder="First Name...">
                            </div>

                            <div class="col-sm">
                                <label for="lname" class="form-label">Last Name</label>
                                <input type="text" name="lname" class="form-control" placeholder="Last Name...">
                            </div>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="email" class="form-label">Email address</label>
                        <input type="email" name="email" class="form-control" placeholder="name@example.com">
                    </div>

                    <div class="mb-3">
                        <div class="row">
                            <div class="col-sm">
                                <label for="pass" class="form-label">Password</label>
                                <input type="password" name="pass" class="form-control" placeholder="Password...">
                            </div>

                            
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="role" class="form-label">Select Role</label>
                        <select name="role" id="role" class="form-control">
                            <option value="0">Select Role</option>
                            <option value="ROLE_DOCTOR">Doctor</option>
                            <option value="ROLE_PATIENT">Patient</option>
                        </select>
                    </div>

                    <script>
                        $(document).ready(function () {
                            $("#role").change(() => {
                                var role = $('#role').val();
                                console.log(role);
                                if(role == 0) {
                                	$("#doctor,#patient").each(function(){
    									 $("#patient").removeClass('d-none');
    									 $("#doctor").removeClass('d-none');
    									 $("#non").addClass('d-none');
								});
                          
                                } else if (role == 'ROLE_PATIENT') {
                                    $("#doctor").addClass('d-none');
                                    $("#patient").removeClass('d-none');
                                } else if (role == 'ROLE_DOCTOR') {
                                    $("#doctor").removeClass('d-none');
                                    $("#patient").addClass('d-none');
                                }  
                            })
                        });
                    </script>
					
					<div id="non" class="d-none">
					</div>
					
                    <div id="doctor" class="d-none">
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

                    <div id="patient" class="d-none">
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