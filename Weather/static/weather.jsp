<!doctype html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <title>Weather Form</title>
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
        crossorigin="anonymous"></script>


<h1 class="d-flex justify-content-center">Weather Form</h1>
<div class="d-flex justify-content-center align-items-center ">
    <div class="login-container">
        <form class="row g-3 needs-validation" action="weather" method="post" >
            <div class="mb-3">
                <label for="locationId" class="form-label">Location Name</label>
                <input type="text" class="form-control input-size" id="locationId" placeholder="Enter Location" name="location"
                       required>
            </div>
            <div class="mb-3">
                <label for="captureId" class="form-label">Captured By</label>
                <input type="text" class="form-control input-size" id="captureId" placeholder="Enter Captured By" name="capture"
                       required>
            </div>
            <div class="mb-3">
                <label for="tempId" class="form-label">Temperature</label>
                <input type="number" class="form-control input-size" id="tempId" placeholder="Enter temperature in Celsius"
                       name="temp" required>
            </div>
            <div class="mb-3">
                <label for="dateId" class="form-label">Recoded Date</label>
                <input type="date" class="form-control input-size" id="dateId"  name="date" required></input>
            </div>
            <div class="d-flex justify-content-center align-items-center">
                <button type="submit" class="btn btn-success">Record</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>