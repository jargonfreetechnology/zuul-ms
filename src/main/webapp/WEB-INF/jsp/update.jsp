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
				<sub class="subclass" style="color: #00BFFF;">update page</sub>
			</span>
		</div>
		<div id="menu-div" ></div>
	</header>
	
	<form id="headerForm" method="get" action="#" style="display:none;"></form>
	
	<div id="main">

		<article>
			<div>
				<form id="updateForm" method="GET">

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
							<tr id="row_${row.count}" onclick="showUserUpdateDlg('${user.userId}', '${user.name}', '${user.address}', '${user.diet}', '${user.hobbies}', '${user.languages}', '${user.gender}');">
								<td class="medium-font">${user.name}</td>
								<td class="small-font">${user.address}</td>
								<td class="medium-font">${user.diet}</td>
								<td class="medium-font">${user.hobbies}</td>
								<td class="medium-font">${user.languages}</td>
								<td class="medium-font">${user.gender}</td>
							</tr>
						</c:forEach>
					</table>
					
				</form>
			</div>
			
			<div class="user-update-dlg">
				<div>
					<form id="upForm" action="update" method="POST">

						<label for="textbox-id">Name</label><input type="text" id="textbox-id" name="name" placeholder="Please enter the name">
						<br><br>
						<label for="textareabox-id">Address</label><textarea id="textareabox-id" name="address" placeholder="Please enter the address"></textarea>
						<br><br>
						<label for="single-select-id">Diet</label>
						<select id="single-select-id" name="diet">
							<option id="Vegetarian" value="Vegetarian">Vegetarian</option>
							<option id="Non-Vegetarian" value="Non-Vegetarian">Non-Vegetarian</option>
						</select>
						<br><br>
						<label for="multi-select-id">Hobbies</label>
						<select	id="multi-select-id" name="hobbies" multiple>
							<option id="Reading" value="Reading">Reading</option>
							<option id="Music" value="Music">Music</option>
							<option id="Movies" value="Movies">Movies</option>
							<option id="Origamy" value="Origamy">Origamy</option>
						</select>
						<br><br>
						<label for="languages">Languages</label>
						<br>
						<input type="checkbox" id="checkbox1" name="languages" value="Tamil" /><label for="checkbox1">Tamil</label>
						<input type="checkbox"	id="checkbox2" name="languages" value="English" /><label for="checkbox2">English</label>
						<input type="checkbox" id="checkbox3" name="languages" value="French" /><label for="checkbox3">French</label>
						<br><br>
						<label for="gender">Gender</label>
						<br>
						<input type="radio" id="radio1" name="gender" value="Male" /><label for="radio1">Male</label>
						<input type="radio" id="radio2" name="gender" value="Female" /><label for="radio2">Female</label>
						<input type="radio" id="radio3" name="gender" value="Neutral" /><label for="radio3">Neutral</label>
						<br><br>
						<input type="hidden" id="userId" name="userId" />
						<button type="reset" value="Reset" class="half-btn">Reset</button>
						<button type="submit" value="Submit" class="half-btn">Submit</button>

					</form>
				</div>
			</div>
		</article>

		<nav></nav>

		<aside></aside>

	</div>
	
	<footer>&copy;2015 Raven Media LLP<br>All rights reserved</footer>
</body>

<script src="js/common.js"></script>
<script src="js/update.js"></script>
</html>