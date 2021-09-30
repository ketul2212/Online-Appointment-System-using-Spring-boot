<!doctype html>
<html lang="en">

<head>

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

<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous">
    </script>
    <div class="container">
        <form action="" id="signupForm">

            <div class="row">
                <div class="col-sm mt-sm-5">
                    <h1>Availability Form</h1>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="monday" class="form-label">Date</label>
                                <input type="text" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

                            <div class="col-sm">
                                <label for="monday" class="form-label">Time</label>
                                <select nPMe="bloodgroup" class="form-control">
                                    <option value="">Select Time</option>
                                    <option value="12:00AM">12:00AM</option>
                                    <option value="01:00AM">01:00AM</option>
                                    <option value="02:00AM">02:00AM</option>
                                    <option value="03:00AM">03:00AM</option>
                                    <option value="04:00AM">04:00AM</option>
                                    <option value="05:00AM">05:00AM</option>
                                    <option value="06:00AM">06:00AM</option>
                                    <option value="07:00AM">07:00AM</option>
                                    <option value="08:00AM">08:00AM</option>
                                    <option value="09:00AM">09:00AM</option>
                                    <option value="10:00AM">10:00AM</option>
                                    <option value="11:00AM">11:00AM</option>

                                    <option value="12:00PM">12:00PM</option>
                                    <option value="01:00PM">01:00PM</option>
                                    <option value="02:00PM">02:00PM</option>
                                    <option value="03:00PM">03:00PM</option>
                                    <option value="04:00PM">04:00PM</option>
                                    <option value="05:00PM">05:00PM</option>
                                    <option value="06:00PM">06:00PM</option>
                                    <option value="07:00PM">07:00PM</option>
                                    <option value="08:00PM">08:00PM</option>
                                    <option value="09:00PM">09:00PM</option>
                                    <option value="10:00PM">10:00PM</option>
                                    <option value="11:00PM">11:00PM</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="monday" class="form-label">Date</label>
                                <input type="text" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

                            <div class="col-sm">
                                <label for="monday" class="form-label">Time</label>
                                <select nPMe="bloodgroup" class="form-control">
                                    <option value="">Select Time</option>
                                    <option value="12:00AM">12:00AM</option>
                                    <option value="01:00AM">01:00AM</option>
                                    <option value="02:00AM">02:00AM</option>
                                    <option value="03:00AM">03:00AM</option>
                                    <option value="04:00AM">04:00AM</option>
                                    <option value="05:00AM">05:00AM</option>
                                    <option value="06:00AM">06:00AM</option>
                                    <option value="07:00AM">07:00AM</option>
                                    <option value="08:00AM">08:00AM</option>
                                    <option value="09:00AM">09:00AM</option>
                                    <option value="10:00AM">10:00AM</option>
                                    <option value="11:00AM">11:00AM</option>

                                    <option value="12:00PM">12:00PM</option>
                                    <option value="01:00PM">01:00PM</option>
                                    <option value="02:00PM">02:00PM</option>
                                    <option value="03:00PM">03:00PM</option>
                                    <option value="04:00PM">04:00PM</option>
                                    <option value="05:00PM">05:00PM</option>
                                    <option value="06:00PM">06:00PM</option>
                                    <option value="07:00PM">07:00PM</option>
                                    <option value="08:00PM">08:00PM</option>
                                    <option value="09:00PM">09:00PM</option>
                                    <option value="10:00PM">10:00PM</option>
                                    <option value="11:00PM">11:00PM</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="monday" class="form-label">Date</label>
                                <input type="text" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

                            <div class="col-sm">
                                <label for="monday" class="form-label">Time</label>
                                <select nPMe="bloodgroup" class="form-control">
                                    <option value="">Select Time</option>
                                    <option value="12:00AM">12:00AM</option>
                                    <option value="01:00AM">01:00AM</option>
                                    <option value="02:00AM">02:00AM</option>
                                    <option value="03:00AM">03:00AM</option>
                                    <option value="04:00AM">04:00AM</option>
                                    <option value="05:00AM">05:00AM</option>
                                    <option value="06:00AM">06:00AM</option>
                                    <option value="07:00AM">07:00AM</option>
                                    <option value="08:00AM">08:00AM</option>
                                    <option value="09:00AM">09:00AM</option>
                                    <option value="10:00AM">10:00AM</option>
                                    <option value="11:00AM">11:00AM</option>

                                    <option value="12:00PM">12:00PM</option>
                                    <option value="01:00PM">01:00PM</option>
                                    <option value="02:00PM">02:00PM</option>
                                    <option value="03:00PM">03:00PM</option>
                                    <option value="04:00PM">04:00PM</option>
                                    <option value="05:00PM">05:00PM</option>
                                    <option value="06:00PM">06:00PM</option>
                                    <option value="07:00PM">07:00PM</option>
                                    <option value="08:00PM">08:00PM</option>
                                    <option value="09:00PM">09:00PM</option>
                                    <option value="10:00PM">10:00PM</option>
                                    <option value="11:00PM">11:00PM</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="monday" class="form-label">Date</label>
                                <input type="text" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

                            <div class="col-sm">
                                <label for="monday" class="form-label">Time</label>
                                <select nPMe="bloodgroup" class="form-control">
                                    <option value="">Select Time</option>
                                    <option value="12:00AM">12:00AM</option>
                                    <option value="01:00AM">01:00AM</option>
                                    <option value="02:00AM">02:00AM</option>
                                    <option value="03:00AM">03:00AM</option>
                                    <option value="04:00AM">04:00AM</option>
                                    <option value="05:00AM">05:00AM</option>
                                    <option value="06:00AM">06:00AM</option>
                                    <option value="07:00AM">07:00AM</option>
                                    <option value="08:00AM">08:00AM</option>
                                    <option value="09:00AM">09:00AM</option>
                                    <option value="10:00AM">10:00AM</option>
                                    <option value="11:00AM">11:00AM</option>

                                    <option value="12:00PM">12:00PM</option>
                                    <option value="01:00PM">01:00PM</option>
                                    <option value="02:00PM">02:00PM</option>
                                    <option value="03:00PM">03:00PM</option>
                                    <option value="04:00PM">04:00PM</option>
                                    <option value="05:00PM">05:00PM</option>
                                    <option value="06:00PM">06:00PM</option>
                                    <option value="07:00PM">07:00PM</option>
                                    <option value="08:00PM">08:00PM</option>
                                    <option value="09:00PM">09:00PM</option>
                                    <option value="10:00PM">10:00PM</option>
                                    <option value="11:00PM">11:00PM</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="monday" class="form-label">Date</label>
                                <input type="text" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

                            <div class="col-sm">
                                <label for="monday" class="form-label">Time</label>
                                <select nPMe="bloodgroup" class="form-control">
                                    <option value="">Select Time</option>
                                    <option value="12:00AM">12:00AM</option>
                                    <option value="01:00AM">01:00AM</option>
                                    <option value="02:00AM">02:00AM</option>
                                    <option value="03:00AM">03:00AM</option>
                                    <option value="04:00AM">04:00AM</option>
                                    <option value="05:00AM">05:00AM</option>
                                    <option value="06:00AM">06:00AM</option>
                                    <option value="07:00AM">07:00AM</option>
                                    <option value="08:00AM">08:00AM</option>
                                    <option value="09:00AM">09:00AM</option>
                                    <option value="10:00AM">10:00AM</option>
                                    <option value="11:00AM">11:00AM</option>

                                    <option value="12:00PM">12:00PM</option>
                                    <option value="01:00PM">01:00PM</option>
                                    <option value="02:00PM">02:00PM</option>
                                    <option value="03:00PM">03:00PM</option>
                                    <option value="04:00PM">04:00PM</option>
                                    <option value="05:00PM">05:00PM</option>
                                    <option value="06:00PM">06:00PM</option>
                                    <option value="07:00PM">07:00PM</option>
                                    <option value="08:00PM">08:00PM</option>
                                    <option value="09:00PM">09:00PM</option>
                                    <option value="10:00PM">10:00PM</option>
                                    <option value="11:00PM">11:00PM</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="monday" class="form-label">Date</label>
                                <input type="text" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

                            <div class="col-sm">
                                <label for="monday" class="form-label">Time</label>
                                <select nPMe="bloodgroup" class="form-control">
                                    <option value="">Select Time</option>
                                    <option value="12:00AM">12:00AM</option>
                                    <option value="01:00AM">01:00AM</option>
                                    <option value="02:00AM">02:00AM</option>
                                    <option value="03:00AM">03:00AM</option>
                                    <option value="04:00AM">04:00AM</option>
                                    <option value="05:00AM">05:00AM</option>
                                    <option value="06:00AM">06:00AM</option>
                                    <option value="07:00AM">07:00AM</option>
                                    <option value="08:00AM">08:00AM</option>
                                    <option value="09:00AM">09:00AM</option>
                                    <option value="10:00AM">10:00AM</option>
                                    <option value="11:00AM">11:00AM</option>

                                    <option value="12:00PM">12:00PM</option>
                                    <option value="01:00PM">01:00PM</option>
                                    <option value="02:00PM">02:00PM</option>
                                    <option value="03:00PM">03:00PM</option>
                                    <option value="04:00PM">04:00PM</option>
                                    <option value="05:00PM">05:00PM</option>
                                    <option value="06:00PM">06:00PM</option>
                                    <option value="07:00PM">07:00PM</option>
                                    <option value="08:00PM">08:00PM</option>
                                    <option value="09:00PM">09:00PM</option>
                                    <option value="10:00PM">10:00PM</option>
                                    <option value="11:00PM">11:00PM</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="mb-3 mt-2">
                        <div class="row">
                            <div class="col-sm">
                                <label for="monday" class="form-label">Date</label>
                                <input type="text" class="form-control datepicker" placeholder="Start Date...." />
                            </div>

                            <div class="col-sm">
                                <label for="monday" class="form-label">Time</label>
                                <select nPMe="bloodgroup" class="form-control">
                                    <option value="">Select Time</option>
                                    <option value="12:00AM">12:00AM</option>
                                    <option value="01:00AM">01:00AM</option>
                                    <option value="02:00AM">02:00AM</option>
                                    <option value="03:00AM">03:00AM</option>
                                    <option value="04:00AM">04:00AM</option>
                                    <option value="05:00AM">05:00AM</option>
                                    <option value="06:00AM">06:00AM</option>
                                    <option value="07:00AM">07:00AM</option>
                                    <option value="08:00AM">08:00AM</option>
                                    <option value="09:00AM">09:00AM</option>
                                    <option value="10:00AM">10:00AM</option>
                                    <option value="11:00AM">11:00AM</option>

                                    <option value="12:00PM">12:00PM</option>
                                    <option value="01:00PM">01:00PM</option>
                                    <option value="02:00PM">02:00PM</option>
                                    <option value="03:00PM">03:00PM</option>
                                    <option value="04:00PM">04:00PM</option>
                                    <option value="05:00PM">05:00PM</option>
                                    <option value="06:00PM">06:00PM</option>
                                    <option value="07:00PM">07:00PM</option>
                                    <option value="08:00PM">08:00PM</option>
                                    <option value="09:00PM">09:00PM</option>
                                    <option value="10:00PM">10:00PM</option>
                                    <option value="11:00PM">11:00PM</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <input type="submit" value="Schedule" name="submit" class="btn btn-primary" />
                </div>
                <div class="col-sm p-5">
                    <img src="./images/login.png" alt="#">
                </div>
            </div>
        </form>
    </div>
</body>

</html>