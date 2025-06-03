<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>TheftResult</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

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
<h1 class="d-flex justify-content-center">Theft Complaint Result</h1>
<p class="theftResult">

    <strong>Name:</strong> ${name} <br>
    <strong>Age:</strong> ${age} <br>
    <strong>Mobile:</strong> ${mobile} <br>
    <strong>Address:</strong> ${address} <br>
    <strong>Location:</strong> ${location} <br>
    <strong>Lost Item:</strong> ${lost} <br>
    <strong>Lost On:</strong> ${lostOn} <br>
</p>