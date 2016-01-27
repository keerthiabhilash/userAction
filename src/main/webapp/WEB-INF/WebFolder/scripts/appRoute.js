var demoApp = angular.module('demoApp', ['ngRoute']);

demoApp.config(function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'htmlParts/caracel.html',
            controller: ''
        }).when('/userForm', {
        templateUrl: 'htmlParts/newForm.html',
        controller: 'registrationForm'
    }).when('/products', {
        templateUrl: 'htmlParts/newForm.html',
        controller: 'registrationForm'
    }).when('/login', {
        templateUrl: 'htmlParts/login.html',
        controller: 'registrationForm'
    }).otherwise({
        templateUrl: 'htmlParts/newForm.html',
        controller: 'registrationForm'
    });
});

