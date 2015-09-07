/**
 * 
 */
angular.module('emailParser',[])
	.config(['$interpolateProvider',function($interpolateProvider){
		$interpolateProvider.startSymbol('__');
		$interpolateProvider.endSymbol('__');
	}])
	.factory('EmailParser',['$interpolate',function($interpolate){
		return {
			parse:function(text,context){
				var template=$interpolate(text);
				return template(context);
			}
		};
	}]);
angular.module('app',['emailParser'])
	.controller('InterpolateController',['$scope','EmailParser',function($scope,EmailParser){
		$scope.$watch('emailBody',function(body){
			if(body){
				$scope.previewText=EmailParser.parse(body,{to:$scope.to});
			}
		});
		
	}]);