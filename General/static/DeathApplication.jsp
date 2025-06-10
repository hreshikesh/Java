<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body class="d-flex flex-column h-100">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
        crossorigin="anonymous"></script>

<nav class="navbar bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <span class="navbar-brand mb-0 h1">Navbar</span>
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </li>
        </ul>
    </div>
</nav>
<div class="container d-flex flex-grow-1 justify-content-center align-items-center">
    <div class="my-5 p-3 bg-dark text-light rounded-3" style="max-width: 700px; width: 100%;">
        <h1 class="text-center mb-5">DeathCertificate Form</h1>
        <form action="death" method="post">
            <div class="row mb-3">
                <label for="nameId" class="col-sm-2 col-form-label">Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nameId" name="name">
                </div>
            </div>
            <div class="row mb-3">
                <label for="causeId" class="col-sm-2 col-form-label">Cause:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="causeId" name="cause">
                </div>
            </div>
            <div class="row mb-3">
                <label for="datetimeId" class="col-sm-2 col-form-label">Date&Time:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="datetimeId" name="dateTime" placeholder="YYYY-MM-DD HH:MM:SS">
                </div>
            </div>
            <div class="row mb-3">
                <label for="ageId" class="col-sm-2 col-form-label">Age at Death:</label>
                <div class="col-sm-10">
                    <input type="datetime-local" class="form-control" id="ageId" name="age" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="certifiedId" class="col-sm-2 col-form-label">Certified By:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="certifiedId" name="certified" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="hospitalNameId" class="col-sm-2 col-form-label">Hospital Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="hospitalNameId" name="hospitalName" >
                </div>
            </div>

            <div class="row mb-3">
                <label for="hospitalId" class="col-sm-2 col-form-label">Manner of Death:</label>
                <div class="col-sm-10">
                    <select class="form-select" id="hospitalId" name="mannerofdeath">
                        <option value="" selected disabled>Select</option>
                        <option value="Accident">Accident</option>
                        <option value="Crime">Crime</option>
                        <option value="Aged">Aged</option>
                    </select>
                </div>
            </div>

            <div class="d-grid gap-2 mt-4">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>
</div>


</body>
</html>