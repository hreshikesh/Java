<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Theft Complaint Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
        crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg bg-body-tertiary " data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" >Theft Complaint</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse d-flex flex-row-reverse " id="navbarNavAltMarkup">
            <div class="navbar-nav ">
                <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </div>
        </div>
    </div>
</nav>
<h1 class="d-flex justify-content-center">Theft Complaint Form</h1>
<div class="d-flex justify-content-center align-items-center">
    <div class="login-container">
        <form class="row g-3 needs-validation" action="theft" method="post" novalidate>
            <div class="mb-3">
                <label for="nameId" class="form-label">Name</label>
                <input type="text" class="form-control input-size" id="nameId" placeholder="Enter Name" name="name" required>
            </div>
            <div class="mb-3">
                <label for="ageId" class="form-label">Age</label>
                <input type="number" class="form-control input-size" id="ageId" placeholder="Enter Age" name="age" required>
            </div>
            <div class="mb-3">
                <label for="mobileId" class="form-label">Mobile</label>
                <input type="number" class="form-control input-size" id="mobileId" placeholder="Enter Mobile Number"
                       name="mobile" required>
            </div>
            <div class="mb-3">
                <label for="addressId" class="form-label">Address</label>
                <textarea class="form-control" id="addressId" rows="3" name="address"></textarea>
            </div>
            <div class="mb-3">
                <label for="locationId" class="form-label">Location</label>
                <input type="text" class="form-control input-size" id="locationId" placeholder="Enter Location" name="location"
                       required>
            </div>
            <div class="mb-3">
                <label for="itemId" class="form-label">Lost Item</label>
                <input type="text" class="form-control input-size" id="itemId" placeholder="Enter Item lost" name="lost" required>
            </div>
            <div class="mb-3">
                <label for="lostId" class="form-label">LostOn</label>
                <input type="datetime-local" class="form-control input-size" id="lostId" placeholder="Enter Item lost" name="lostOn"
                       required>
            </div>
            <div class="d-flex justify-content-center align-items-center">
                <button type="submit" class="btn btn-success">Success</button>
            </div>

        </form>
    </div>
</div>
</body>
</html>