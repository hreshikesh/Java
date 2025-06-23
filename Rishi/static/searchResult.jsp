<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Car Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">
</head>
<body class="bg-dark">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg  bg-warning-subtle text-warning-emphasis" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold fs-3  bg-warning-subtle text-warning-emphasis" href="index.jsp"><i
                class="bi bi-car-front-fill m-3"></i>Car Register</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText"
                aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="container-fluid">

        </div>
        <div class="d-flex justify-content-end  align-items-center w-100">
            <form class="d-flex " role="search" action="search">
                <input class="form-control me-2 w-75  " type="search" placeholder="Search" aria-label="Search"/>
                <button class="btn btn-warning me-2" type="car name" name="carName">Search</button>
            </form>
            <a class="icon-link fs-5 fw-bold bg-warning-subtle text-warning-emphasis" href="login">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                     class="bi bi-box-arrow-in-right" viewBox="0 0 16 16">
                    <path fill-rule="evenodd"
                          d="M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0z"/>
                    <path fill-rule="evenodd"
                          d="M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708z"/>
                </svg>

                Login
            </a>
        </div>


    </div>

</nav>


<div class="container-fluid d-flex justify-content-center  align-items-center min-vh-100 ">
    <div class="border border-black border-3 rounded-3 p-4 text-center shadow-lg p-3 mb-5 bg-body-tertiary rounded  bg-warning-subtle text-warning-emphasis"
         data-bs-theme="dark">
        <p>${result}</p>
        <p>${resultSuccess}</p>
        <span>${dto.carName}</span>
        <span>${dto.userName}</span>
        <span>${dto.company}</span>
        <span>${dto.carType}</span>
    </div>
</div>


</body>
</html>