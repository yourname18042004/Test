<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login test</title>
    <link rel="stylesheet" href="style.css" class="css">
   
</head>
<body>
    <div class="wrapper">
        <form action = "login" method="post">
            <h1>Login</h1>
            <div class = "inputbox">
                <input type="text" class="forminput" placeholder="Username" name = "username" required>
            </div>
            <div class = "inputbox">
                <input type="password" class="forminput" placeholder="Password" name = "password" required>
            </div>

            <div class = "remember-forgot">
                <label> <input type="checkbox" name="Remember me"> Remember me</label>
                <a href="#" >Forgot password</a>
            </div>
            <button type = "submit" class = "submit" onclick="login()">Login</button>
            <div class="register-link">
                <p>Don't have account </p> 
                <a href="#">Register</a>
                
            </div>
            

        </form>
    </div>
    <script>
        const list = {
            username: "thanh",
            password: "thanh"
        }
        function login(){
            let username = document.getElementById("username").value;
            let password = document.getElementById("pass").value;
            if(username == list.username && password == list.password){
                alert("Dang nhap thanh cong");
            }
            else alert("Dang nhap that bai");
        }
    </script>
</body>
</html>