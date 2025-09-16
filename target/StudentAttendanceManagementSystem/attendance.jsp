<html>
<head><title>Attendance List</title></head>
<body>
<h2>Attendance Records</h2>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Status</th></tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.present ? "Present" : "Absent"}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
