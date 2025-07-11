<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Login</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Login Site</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>

<form action="login" method="post">
    <div class="container d-flex align-items-center justify-content-center border min-vh-100">
        <div class="container p-3 m-2 border border-success w-25 ">
            <c:if test="${resultFail=='fail'}">
                <span class="text-danger">Data Failed</span>
            </c:if>
            <c:if test="${result=='save'}">
                <span class="text-success">Saved Successfully</span>
            </c:if>
            <h1 class="h1 text-center">Login</h1>
            <div class="row mb-2">
                <div class="col-12">
                    <label for="nameId" class="form-label"> Name</label>
                    <input type="text" name="name" class="form-control" placeholder="Enter name" id="nameId" value="${name}" required>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-12">
                    <label for="emailId" class="form-label"> Email</label>
                    <input type="email" class="form-control" placeholder="Enter Email" id="emailId" name="email" value="${email}" required>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-12">
                    <label for="mobileId" class="form-label">MobileNo</label>
                    <input type="text" class="form-control" placeholder="Enter mobile" id="mobileId" name="mobile" value="${mobile}" required>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-12">
                    <label for="addressId" class="form-label"> Address</label>
                <textarea class="form-control" id="addressId" name="address" value="${address}" required></textarea>
                </div>
            </div>
            <div class="row text-center mb-2">
                <div class="col-12">
                    <button type="submit" class="btn btn-primary">Login</button>
                </div>
            </div>

        </div>
    </div>

</form>
<form action="fetch" method="get">

    <div class="row text-center m-5">
        <div class="col-12">
            <button type="submit" class="btn btn-primary">Retreive All</button>
        </div>
    </div>


</form>

</body>
</html>
