/**
 * 在app模块中添加js控制器
 */
var app = angular.module('app', []);
app.controller('FirstController', function($scope) {
	$scope.counter = 0;
	$scope.add = function(amount) {
		$scope.counter += amount;
	};
	$scope.subtract = function(amount) {
		$scope.counter -= amount;
	};
});