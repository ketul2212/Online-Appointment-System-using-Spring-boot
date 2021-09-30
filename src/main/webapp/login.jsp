<!doctype html>
<html lang="en">
    <head>
    
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <style>
            form {
                margin-top: 170px;
            }
            
        </style>

        <title>Login</title>
    </head>
    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

        
        <div class="container">
            <form action="./login">
                
                <div class="row">
                    <div class="col-sm mt-sm-5">
                        <h1>Login Form</h1>
                        <div class="mb-3 mt-2">
                        	${SPRING_SECURITY_LAST_EXCEPTION.message}
                        </div>
                        <div class="mb-3 mt-2">
                            <label for="email" class="form-label">Email address</label>
                            <input type="email" name="email" class="form-control" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                          <label for="password" class="form-label">Password</label>
                          <input type="password" name="password" class="form-control" placeholder="enter your password...">
                        </div>

                        <input type="submit" value="Login" name="submit" class="btn btn-primary"/>
                    </div>
                    <div class="col-sm p-5">
                        <img src="./images/login.png" alt="#">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>