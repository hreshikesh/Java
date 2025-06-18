<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Car Register Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">
</head>
<body class="bg-dark">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
        crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg  bg-warning-subtle text-warning-emphasis" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold fs-3  bg-warning-subtle text-warning-emphasis" href="index.jsp"><i class="bi bi-car-front-fill m-3"></i>Car Register</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText"
                aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="d flex">
            <a class="icon-link fs-5 fw-bold bg-warning-subtle text-warning-emphasis" href="index.jsp">
                <svg xmlns="http://www.w3.org/2000/svg" width="25" height="20" fill="currentColor" class="bi bi-house" viewBox="0 0 16 16">
                    <path d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293zM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5z"/>
                </svg>

            </a>
        </div>

    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center min-vh-80 ">
    <div class="bg-white p-5 shadow-lg p-3 m-5 bg-body-tertiary rounded max-w=300 w-50 bg-warning-subtle text-warning-emphasis" data-bs-theme="dark">
        <h4 class="text-center">Car Register</h4>
        <form action="submit" method="post">
            <div class="mb-3">
                <label for="userId" class="form-label">UserName</label>
                <input type="text" class="form-control" id="userId" name="userName">
            </div>
            <div class="mb-3">
                <label for="nameId" class="form-label">Car Name</label>
                <input type="text" class="form-control" id="nameId" name="name">
            </div>
            <div class="mb-3">
                <label for="manufactureId" class="form-label">Manufacture Year</label>
                <input type="number" class="form-control" id="manufactureId" name="manufacture">
            </div>
            <div class="mb-3">
                <label for="companyId" class="form-label">Company</label>
                <input type="text" class="form-control" id="companyId" name="company">
            </div>
            <div class="mb-3">
                <label for="showroomId" class="form-label">Showroom Name</label>
                <input type="text" class="form-control" id="showroomId" name="showroom">
            </div>

            <div class="mb-3">
                <label for="carTypeId">Car Type</label>
                <select class="form-select" aria-label="Default select example" name="carType" id="carTypeId">
                    <option selected disabled>Select Car Type</option>
                    <option value="petrol">Petrol</option>
                    <option value="Diesel">Diesel</option>
                    <option value="electric">Electric</option>
                    <option value="hybrid">Hybrid</option>
                </select>

            </div>
            <div class="mb-3">
                <label for="passwordId" class="form-label">Password</label>
                <input type="password" class="form-control" id="passwordId" name="password">
            </div>
            <div class="mb-3">
                <label for="conformId" class="form-label">Conform Password</label>
                <input type="password" class="form-control" id="conformId" name="conform">
            </div>

            <button type="submit" class="btn btn-outline-warning w-100" style="opacity:0.8;">register</button>
        </form>
    </div>
</div>
</body>
</html>
