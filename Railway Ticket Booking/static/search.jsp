<!doctype html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Railway Ticket Booking</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">


</head>


<body class="bg-light">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
        crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand text-white fs-4 fw-bold" href="index.jsp">
            <i class="bi bi-train-freight-front text-white fs-4 me-2"></i>
            Railway Ticket Booking
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>


        <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active text-white" aria-current="page" href="index.jsp">Home</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center min-vh-80 ">
    <div class="bg-white p-5 shadow-lg p-3 m-5 bg-body-tertiary rounded max-w=300 w-50">
        <h4 class="text-center">Ticket Booking</h4>
        <form action="booking" method="get">
            <!--            <c:if test="${result == 'data saved'}">-->
            <!--                <p class="text-success">${resultSuccess}</p>-->
            <!--            </c:if>-->

            <!--            <c:if test="${result == 'Name is invalid'}">-->
            <!--                <p class="text-danger">${resultFail}</p>-->
            <!--            </c:if>-->

            <div class="mb-3">
                <label for="idId" class="form-label">Id</label>
                <input type="text" class="form-control" id="idId" name="id" >
            </div>

            <button type="submit" class="btn btn-primary w-100" style="opacity:0.8;">Saerch Job</button>
        </form>
    </div>
</div>
</body>
</html>
