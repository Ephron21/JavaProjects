<%-- 
    Document   : CSSForm
    Created on : May 2, 2024, 3:33:45 PM
    Author     : Esron
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">

<title>Insert title here</title>
</head>
<body>
 <div class="container">
  <h1>Create New User:</h1>
  <div class="card">
   <div class="card-body">
    <form action="register.jsp" method="post">

     <div class="form-group row">
      <label for="firstName" class="col-6 col-form-label">First
       Name</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="firstName"
        placeholder="Enter first name" required>
      </div>
     </div>

     <div class="form-group row">
      <label for="Username" class="col-6 col-form-label">Username</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="uname"
        placeholder="Enter Username" required>
      </div>
     </div>

     <div class=" form-group row">
      <label for="Password" class="col-6 col-form-label">Password</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="pass"
        placeholder="Enter Password">
      </div>
     </div>


     <button type="submit" class="btn btn-primary">Submit</button>
    </form>
   </div>
  </div>
 </div>
</body>
</html>
