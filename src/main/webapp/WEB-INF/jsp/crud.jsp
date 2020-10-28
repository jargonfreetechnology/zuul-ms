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
	<link rel="stylesheet" href="css/login.css">
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
				<sub class="subclass" style="color: black;">home page</sub>
			</span>
		</div>		
		<div id="menu-div" ></div>
	</header>
	
	<form id="headerForm" method="get" action="#" style="display:none;"></form>

	<div id="main">

		<article>
			<form id="crudForm" method="GET">
				<button id="createBtn" type="button" onclick="create();" class="qtr-btn" style="background-color: #FFCB00; color: black;">Create Operation</button>
				<button id="readBtn"   type="button" onclick="read();"   class="qtr-btn" style="background-color: #40E0D0; color: black;">Read Operation</button>
				<button id="updateBtn" type="button" onclick="update();" class="qtr-btn" style="background-color: #00BFFF; color: black;">Update Operation</button>
				<button id="deleteBtn" type="button" onclick="delRec();" class="qtr-btn" style="background-color: red;     color: black;">Delete Operation</button>
			</form>		
		</article>

		<nav></nav>

		<aside></aside>

	</div>
	
	<footer>&copy;2015 Raven Media LLP<br>All rights reserved</footer>
</body>

<script src="js/common.js"></script>
<script src="js/crud.js"></script>
</html>