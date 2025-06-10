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
    <div class="my-5 p-3 bg-dark text-light rounded-3" style="max-width: 600px; width: 100%;">
        <h1 class="text-center mb-5">BirthCertificate Form</h1>
        <form action="birth" method="post">
            <div class="row mb-3">
                <label for="birthId" class="col-sm-2 col-form-label">BirthId:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="birthId" name="birthId">
                </div>
            </div>
            <div class="row mb-3">
                <label for="hospitalId" class="col-sm-2 col-form-label">Hospital:</label>
                <div class="col-sm-10">
                    <select class="form-select" id="hospitalId" name="hospital">
                        <option value="" selected disabled>Select</option>
                        <option value="Apollo">Apollo</option>
                        <option value="FatherMuller">Father Muller</option>
                        <option value="AIMS">AIMS</option>
                        <option value="KMC">KMC</option>
                    </select>
                </div>
            </div>

            <div class="row mb-3">
                <label for="fatherId" class="col-sm-2 col-form-label">FatherName:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="fatherId" name="fatherName">
                </div>
            </div>
            <div class="row mb-3">
                <label for="motherId" class="col-sm-2 col-form-label">MotherName:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="motherId" name="motherName">
                </div>
            </div>
            <div class="row mb-3">
                <label for="datetimeId" class="col-sm-2 col-form-label">Date&Time:</label>
                <div class="col-sm-10">
                    <input type="datetime-local" class="form-control" id="datetimeId" name="datetime" placeholder="YYYY-MM-DD HH:MM:SS">
                </div>
            </div>
            <div class="row mb-3">
                <label for="doctorId" class="col-sm-2 col-form-label">DoctorName:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="doctorId" name="doctorName">
                </div>
            </div>
            <div class="row mb-3">
                <label for="nurseId" class="col-sm-2 col-form-label">NurseName:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nurseId" name="nurseName">
                </div>
            </div>
            <div class="row mb-3">
                <label for="hospitalTypeId" class="col-sm-2 col-form-label">HospitalType:</label>
                <div class="col-sm-10">
                    <select class="form-select" id="hospitalTypeId" name="hospitalType">
                        <option value="" selected disabled>Select</option>
                        <option value="Private">Private</option>
                        <option value="Government">Government</option>
                        <option value="Trust">Trust</option>
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