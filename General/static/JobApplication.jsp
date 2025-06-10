<!doctype html>
<html lang="en" class="h-100">
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
    <div class="my-5 p-3 bg-dark text-light rounded-3" style="max-width: 500px; width: 100%;">
        <h1 class="text-center mb-5">Job Application</h1>
        <form action="job" method="post">
            <div class="row mb-3">
                <label for="nameId" class="col-sm-2 col-form-label">Name:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nameId" name="name">
                </div>
            </div>
            <div class="row mb-3">
                <label for="emailId" class="col-sm-2 col-form-label">Email:</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="emailId" name="email">
                </div>
            </div>
            <div class="row mb-3">
                <label for="educationId" class="col-sm-2 col-form-label">Education:</label>
                <div class="col-sm-10">
                    <select class="form-select" id="educationId" name="education">
                        <option value="" selected disabled>Select</option>
                        <option value="BE">BE</option>
                        <option value="BCom">BCom</option>
                        <option value="BCA">BCA</option>
                        <option value="MCA">MCA</option>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label for="skillId" class="col-sm-2 col-form-label">Skill:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="skillId" name="skill">
                </div>
            </div>
            <div class="row mb-3">
                <label for="expectedSalaryId" class="col-sm-2 col-form-label">Salary:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="expectedSalaryId" name="expectedSalary" placeholder="Expected Salary">
                </div>
            </div>
            <div class="row mb-3">
                <label for="experienceId" class="col-sm-2 col-form-label">Experience:</label>
                <div class="col-sm-10">
                    <select class="form-select" id="experienceId" name="experience" >
                        <option value="" selected disabled>Select</option>
                        <option value="Fresher">Fresher</option>
                        <option value="1-2 Years">1-2 Years</option>
                        <option value="2-5 Years">2-5 Years</option>
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