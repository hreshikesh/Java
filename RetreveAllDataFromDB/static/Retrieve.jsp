
<!DOCTYPE html>
<!--<%@ page contentType="text/html;charset=UTF-8" %>-->
<!--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>-->
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>All Data</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">All DATA</a>
    </div>
</nav>

<div class="container mt-5">
    <table class="table table-bordered table-striped">
        <thead class="table-dark">
        <tr><th>No</th>
            <th>Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Address</th>
        </tr>
        </thead>
        <tbody>

<!--        here var->the ref and items- like collection with ref to for(Type ref:items|collection|array) varstatus gives the status of loop like index,count-->
        <c:forEach var="dto" items="${dto}" varStatus="loop">
            <tr><td>${loop.count}</td>
                <td>${dto.name}</td>
                <td>${dto.email}</td>
                <td>${dto.mobile}</td>
                <td>${dto.address}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
