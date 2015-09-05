<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="app">
<head>
<title>Simple app</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular.js"></script>
</head>
<body>
	<div ng-controller="ParentController">
		<div ng-controller="ChildController">
			<a ng-click="sayHello()">Say hello</a>
		</div>
		{{person}}
	</div>
	<script src="/js/controllers/controller.js"></script>
</body>
</html>