<!doctype html>
<html lang="en" class="h-100">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Driving License Application</title>
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
        <h1 class="text-center mb-5">Driving License Application Form</h1>
        <form action="driving" method="post">

            <div class="row mb-3">
                <label for="applicantNameId" class="col-sm-2 col-form-label">Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="applicantNameId" name="applicantName" required>
                </div>
            </div>


            <div class="row mb-3">
                <label for="addressId" class="col-sm-2 col-form-label">Address:</label>
                <div class="col-sm-10">
                    <textarea class="form-control" id="addressId" name="address" rows="3" required></textarea>
                </div>
            </div>


            <div class="row mb-3">
                <label for="mobileId" class="col-sm-2 col-form-label">Mobile:</label>
                <div class="col-sm-10">
                    <input type="tel" class="form-control" id="mobileId" name="mobile" >
                    <small class="form-text text-muted">Please enter a 10-digit mobile number.</small>
                </div>
            </div>

            <div class="row mb-3">
                <label for="appliedDateId" class="col-sm-2 col-form-label">Applied Date:</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="appliedDateId" name="appliedDate" required>
                </div>
            </div>


            <div class="row mb-3">
                <label for="vehicleTypeId" class="col-sm-2 col-form-label">Vehicle Type:</label>
                <div class="col-sm-10">
                    <select class="form-select" id="vehicleTypeId" name="vehicleType" required>
                        <option value="" selected disabled>Select Vehicle Type</option>
                        <option value="Motorcycle">Motorcycle</option>
                        <option value="Car">Car</option>
                        <option value="Light Motor Vehicle (LMV)">Light Motor Vehicle (LMV)</option>
                        <option value="Heavy Motor Vehicle (HMV)">Heavy Motor Vehicle (HMV)</option>
                        <option value="Commercial Vehicle">Commercial Vehicle</option>
                    </select>
                </div>
            </div>

            <div class="d-grid gap-2 mt-4">
                <button type="submit" class="btn btn-primary">Submit Application</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>