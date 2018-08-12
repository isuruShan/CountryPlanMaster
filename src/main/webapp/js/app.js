//Principal module
var app = angular.module("app", ["ngResource", "ngRoute"]);

app.config(["$routeProvider", "$locationProvider", function($routeProvider, $locationProvider){

    //List Persons
    $routeProvider.when("/persons", {
        templateUrl: "./person/view/persons.html",
        controller: "PersonsController"
    });
}]);

app.value("appValue", {
    baseUrl: "/webapi"
});