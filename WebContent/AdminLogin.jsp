<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Welcome Admin</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="Register/fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="Register/css/style.css">
</head>
<body>

    <div class="main">

      
        <section class="sign-in">
            <div class="container">
                <div class="signin-content">
                    <div class="signin-image">
                        <figure><img src="Register/images/signin-image.jpg" alt="sing up image"></figure>
                        
                    </div>
        
                    <div class="signin-form">
                        <h2 class="form-title">Sign up</h2>
                        <form  method="post" action="loginadmin" class="register-form" id="login-form">
                            <div class="form-group">
                                <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="username" id="your_name" placeholder="Your Name"/>
                            </div>
                            <div class="form-group">
                                <label for="your_pass"><i class="zmdi zmdi-lock"></i></label>
                                <input type="password" name="password" id="your_pass" placeholder="Password"/>
                            </div>
                            <div class="form-group">
                                <input type="checkbox" name="remember-me" id="remember-me" class="agree-term" />
                                
                            </div>
                            <div class="form-group form-button">
                                <input type="submit" class="form-submit" value="Log in"/>
                            </div>
                        </form>
                      
                    </div>
                </div>
            </div>
        </section>
       

    </div>

    <!-- JS -->
    <script src="Register/vendor/jquery/jquery.min.js"></script>
    <script src="Register/js/main.js"></script>
</body>
</html>