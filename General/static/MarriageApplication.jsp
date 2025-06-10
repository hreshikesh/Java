<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Marriage Certificate Application</title>
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
        <h1 class="text-center mb-5">Marriage Certificate Application</h1>
        <form action="marriage" method="post">
            <div class="row mb-3">
                <label for="groomNameId" class="col-sm-2 col-form-label">Groom's Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="groomNameId" name="groomName" required>
                </div>
            </div>

            <div class="row mb-3">
                <label for="brideNameId" class="col-sm-2 col-form-label">Bride's Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="brideNameId" name="brideName" required>
                </div>
            </div>

            <div class="row mb-3">
                <label for="locationId" class="col-sm-2 col-form-label">Location:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="locationId" name="location" required>
                </div>
            </div>

            <div class="row mb-3">
                <label for="addressId" class="col-sm-2 col-form-label">Address:</label>
                <div class="col-sm-10">
                    <textarea class="form-control" id="addressId" name="address" rows="3" required></textarea>
                </div>
            </div>

            <div class="row mb-3">
                <label for="religionId" class="col-sm-2 col-form-label">Religion:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="religionId" name="religion" required>
                </div>
            </div>

            <div class="row mb-3">
                <label for="marriageDateId" class="col-sm-2 col-form-label">Date:</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="marriageDateId" name="marriageDate" required>
                </div>
            </div>

            <div class="row mb-3">
                <label for="witness1Id" class="col-sm-2 col-form-label">Witness 1 Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="witness1Id" name="witness1" required>
                </div>
            </div>

            <div class="row mb-3">
                <label for="witness2Id" class="col-sm-2 col-form-label">Witness 2 Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="witness2Id" name="witness2" required>
                </div>
            </div>

            <div class="row mb-3">
                <label for="officerId" class="col-sm-2 col-form-label">Officer Present:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="officerId" name="officerPresent" required>
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