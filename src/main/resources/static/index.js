angular.module('listOfStudent', []).controller('indexController', function ($scope, $http) {
    const URL = 'http://localhost:8191/listOfStudents/api/v1/student';
    $scope.fillTable = function () {
        $http.get(URL)
            .then(function (response) {
                $scope.students = response.data;
            });
    }
    $scope.deleteStudent = function (id) {
        $http.delete(URL + "/" + id)
            .then(function (response) {
                $scope.fillTable();
            });
    }

    $scope.createNewStudent = function () {
        $http.put(URL, $scope.newStudent)
            .then(function (response) {
                $scope.newStudent = null;
                $scope.fillTable();
            });
    }

    $scope.fillTable();
});