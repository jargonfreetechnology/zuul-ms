<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	
	<link href="images/favicon.ico" rel="shortcut icon" type="image/x-icon" />
	
	<title>CRUD Application</title>
	
	<!-- <link rel="stylesheet" href="css/scaffold/_bootstrap.min.css"> -->
	
	<link rel="stylesheet" href="css/scaffold/bodyhdrftr.css">
	<link rel="stylesheet" href="css/scaffold/logo.css">
	<link rel="stylesheet" href="css/scaffold/main.css">
	<link rel="stylesheet" href="css/scaffold/menu.css">
	<link rel="stylesheet" href="css/scaffold/sitename.css">

	<link rel="stylesheet" href="css/button.css">
	<link rel="stylesheet" href="css/checkbox-radiobtn.css">
	<link rel="stylesheet" href="css/container.css">
	<link rel="stylesheet" href="css/font-awesome.css">
	<link rel="stylesheet" href="css/fonts.css">
	<link rel="stylesheet" href="css/form.css">
	<link rel="stylesheet" href="css/inputbox.css">
	<link rel="stylesheet" href="css/mask.css">
	<link rel="stylesheet" href="css/select.css">
	<link rel="stylesheet" href="css/table.css">
	<link rel="stylesheet" href="css/textarea.css">
	<link rel="stylesheet" href="css/z-index.css">

	<script src="js/jquery-2.1.0.min.js"></script>
</head>

<body>
	<header>
		<div id="logo-div" ><img id="logo" src="images/logo.png"/></div>
		<div id="site-name" class="a" >
			<span>
				<span style="color: #FFCB00;">C</span>
				<span style="color: #40E0D0;">R</span>
				<span style="color: #00BFFF;">U</span>
				<span style="color: red;">D</span>
				<sub class="subclass" style="color: #40E0D0;">read page</sub>
			</span>
		</div>
		<div id="menu-div" ></div>
	</header>
	
	<form id="headerForm" method="get" action="#" style="display:none;"></form>

	<div id="main">

		<article>
			<form id="readForm" method="GET">

				<table>
					<tr>
						<th>Name</th>
						<th>Address</th>
						<th>Diet</th>
						<th>Hobbies</th>
						<th>Languages</th>
						<th>Gender</th>
					</tr>
					<c:forEach items="${userList}" var="user" varStatus="row">
						<tr id="row_${row.count}" >
							<td class="medium-font, no-cursor">${user.name}</td>
							<td class="small-font, no-cursor">${user.address}</td>
							<td class="medium-font, no-cursor">${user.diet}</td>
							<td class="medium-font, no-cursor">${user.hobbies}</td>
							<td class="medium-font, no-cursor">${user.languages}</td>
							<td class="medium-font, no-cursor">${user.gender}</td>
						</tr>
					</c:forEach>
				</table>

			</form>
		</article>

		<nav></nav>

		<aside></aside>

	</div>
	
	<footer>&copy;2015 Raven Media LLP<br>All rights reserved</footer>
</body>

<script src="js/common.js"></script>
<script src="js/read.js"></script>
</html>