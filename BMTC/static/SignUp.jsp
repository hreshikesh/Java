<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>BMTC Demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
</head>

<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
<nav class="navbar bg-body-tertiary justify-content-center align-items-center">
    <div class="container-fluid  ">
        <a class="navbar-brand fs-3  fw-bold align-items-center" href="#">
            <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-bus-front" viewBox="0 0 16 16">
                <path d="M5 11a1 1 0 1 1-2 0 1 1 0 0 1 2 0m8 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0m-6-1a1 1 0 1 0 0 2h2a1 1 0 1 0 0-2zm1-6c-1.876 0-3.426.109-4.552.226A.5.5 0 0 0 3 4.723v3.554a.5.5 0 0 0 .448.497C4.574 8.891 6.124 9 8 9s3.426-.109 4.552-.226A.5.5 0 0 0 13 8.277V4.723a.5.5 0 0 0-.448-.497A44 44 0 0 0 8 4m0-1c-1.837 0-3.353.107-4.448.22a.5.5 0 1 1-.104-.994A44 44 0 0 1 8 2c1.876 0 3.426.109 4.552.226a.5.5 0 1 1-.104.994A43 43 0 0 0 8 3"/>
                <path d="M15 8a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1V2.64c0-1.188-.845-2.232-2.064-2.372A44 44 0 0 0 8 0C5.9 0 4.208.136 3.064.268 1.845.408 1 1.452 1 2.64V4a1 1 0 0 0-1 1v2a1 1 0 0 0 1 1v3.5c0 .818.393 1.544 1 2v2a.5.5 0 0 0 .5.5h2a.5.5 0 0 0 .5-.5V14h6v1.5a.5.5 0 0 0 .5.5h2a.5.5 0 0 0 .5-.5v-2c.607-.456 1-1.182 1-2zM8 1c2.056 0 3.71.134 4.822.261.676.078 1.178.66 1.178 1.379v8.86a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 11.5V2.64c0-.72.502-1.301 1.178-1.379A43 43 0 0 1 8 1"/>
            </svg>
            BMTC
        </a>
        <div class="d-flex justify-content-center align-items-end">
            <a class="btn btn-secondary" role="button" href="index.jsp" >Home</a>
        </div>
    </div>

</nav>
<div class="container-fluid d-flex justify-content-center align-items-center min-vh-100">
    <div class="container bg-white p-4 rounded shadow">
        <span class="text-danger">${resultFail}</span>
        <span class="text-success">${resultSave}</span>
        <form action="submit" method="post">
            <h3 class="text-center">BMTC SIGN-UP FORM</h3>
            <div class="row mb-3">
                <div class="col-md-6">
                    <p class="text-danger">${resultUserId}</p>
                    <label for="userId" class="form-label">User ID</label>
                    <input type="text" class="form-control" id="userId" name="userID" placeholder="Enter User ID"  value="${userId}" required>
                </div>

                <div class="col-md-6">
                    <p class="text-danger">${resultEmail}</p>
                    <label for="emailId" class="form-label">Email</label>
                    <input type="email" class="form-control" id="emailId" name="email" value="${email}" placeholder="Enter Email" required>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-6">
                    <p></p>
                    <label for="passwordId" class="form-label">Password</label>
                    <input type="password" class="form-control" id="passwordId" value="${password}" name="password" placeholder="Enter Password" required>
                </div>
                <div class="col-md-6">
                    <p class="text-danger">${resultPassword}</p>
                    <label for="confirmId" class="form-label">Confirm Password</label>
                    <input type="password" class="form-control" id="confirmId" name="confirmPassword"  value="${confirm}" placeholder="Confirm Password" required>
                </div>
            </div>

            <div class="row m-3">
                <div class="col text-center">
                    <button type="submit" class="btn btn-warning">Submit</button>
                </div>
            </div>
            <div class="row mb-3">
                <div class="col text-center">
                    <p>Already a user! <a href="Signin.jsp">Signin</a></p>
                </div>
            </div>

        </form>
    </div>
</div>





</body>
</html>
