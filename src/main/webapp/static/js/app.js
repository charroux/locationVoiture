'use strict';

var app = angular.module('rentCar', [
	'ngRoute','locationControllers'                                               ]);

app.config(['$routeProvider',
	function($routeProvider) {
		$routeProvider.
			when('/rentCars', {
				templateUrl: 'partials/menu.html'
			}).
			when('/rentCars/louer', {
				templateUrl: 'partials/location.html',
				controller: 'locationController'
			}).
			otherwise({
				redirectTo: '/rentCars'
			});
}]);
