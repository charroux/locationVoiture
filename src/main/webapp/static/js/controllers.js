'use strict';

var locationControllers = angular.module('locationControllers', []);

locationControllers.controller("locationController", function($scope,$http,$routeParams) {

	$http.get('http://localhost:8080/locationVoiture/voiture').
	  success(function(data, status, headers, config) {
	  	$scope.voitures = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
	  });

	$scope.rent = function(selected) {
		$http.put('http://localhost:8080/locationVoiture/voiture/'+selected.immatriculation+'?louer=true').
		  success(function(data, status, headers, config) {
		  	alert('location ok');
		  }).
		  error(function(data, status, headers, config) {
			  alert('erreur');
		  });
	};
        
});

locationControllers.controller("ramenerController", function($scope,$http,$routeParams) {

	$scope.immatriculation = '';
	
	$scope.ramener = function(immatriculation) {
		$http.put('http://localhost:8080/locationVoiture/voiture/'+immatriculation+'?louer=false').
		  success(function(data, status, headers, config) {
		  	alert('ramener ok');
		  }).
		  error(function(data, status, headers, config) {
			  alert('erreur');
		  });
	};
        
});

