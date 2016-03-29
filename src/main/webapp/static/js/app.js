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
			when('/rentCars/ramener', {
				templateUrl: 'partials/ramenerVoiture.html',
				controller: 'ramenerController'
			}).
			otherwise({
				redirectTo: '/rentCars'
			});
}]);
