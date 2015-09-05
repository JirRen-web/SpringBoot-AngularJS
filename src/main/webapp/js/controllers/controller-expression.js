
var app=angular.module("app",[]);
app.controller("ExpressionController", function($scope,$parse) {
	$scope.$watch("expr", function(newVal,oldVal,scope) {
		if(newVal!==oldVal){
			//用该表达式设置parseFun,$parse返回的是一个fn,可以函数指针
			var parseFun=$parse(newVal);
			//自定义属性parsedValue
			$scope.parsedValue=parseFun(scope);
		}
	})
})