<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <meta content="text/html; charset=utf-8"/>
    <title>Spring MVC Demo - Form Page</title>
</head>
<body>
<h2>Hello from the form page!</h2>
<br>
<form action="processForm" method="GET">
    <p>
        <label for="studentName">What is your name?</label>
        <br>
        <input type="text" name="studentName" id="studentName" placeholder="Enter your name"/>
        <input type="submit"/>
    </p>
</form>

<form action="processFormV2" method="GET">
    <p>
        <label for="studentNameV2">Want you name in a special way?</label>
        <br>
        <input type="text" name="studentName" id="studentNameV2" placeholder="Enter your name"/>
        <input type="submit"/>
    </p>
</form>
</body>
</html>
