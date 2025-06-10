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
    <div class="my-5 p-3 bg-dark text-light rounded-3" style="max-width: 800px; width: 100%;">
        <h1 class="text-center mb-5">PassPort Form</h1>
        <form action="passport" method="post">
            <div class="row mb-3">
                <label for="applicantId" class="col-sm-2 col-form-label">ApplicantName:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="applicantId" name="applicantName" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="aadarId" class="col-sm-2 col-form-label">Aadar No:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="aadarId" name="aadar" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="addressId" class="col-sm-2 col-form-label">Address:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="addressId" name="address" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="panId" class="col-sm-2 col-form-label">Pan No:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="panId" name="pan" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="countryId" class="col-sm-2 col-form-label">Country:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="countryId" name="country" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="stateId" class="col-sm-2 col-form-label">State:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="stateId" name="state" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="cityId" class="col-sm-2 col-form-label">City:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="cityId" name="city" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="pincodeId" class="col-sm-2 col-form-label">Pincode:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="pincodeId" name="pincode" >
                </div>
            </div>
            <div class="row mb-3">
                <label for="passportTypeId" class="col-sm-2 col-form-label">PassportType:</label>
                <div class="col-sm-10">
                    <select class="form-select" id="passportTypeId" name="passportType">
                        <option value="" selected disabled>Select</option>
                        <option value="General">General</option>
                        <option value="E-Passport">E-Passport</option>
                        <option value="Emergency">Emergency</option>
                        <option value="Official">Official</option>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label for="refId" class="col-sm-2 col-form-label">Payment Ref no:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="refId" name="paymentRef" >
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