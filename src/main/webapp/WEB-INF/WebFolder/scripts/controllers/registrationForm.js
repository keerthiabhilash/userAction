demoApp.controller('registrationForm', function ($scope, $http) {
    var url = "http://localhost:8080/userAction/registration/cntryStats";
    $scope.bodyStyle = {background:"url(images/indian-peacock-plumage.jpg)"}
    $http.get(url).success(function (response) {
        console.log(response);
        $scope.cntryAndStats = response;
        $scope.selectedContry = $scope.cntryAndStats[0];
        $scope.selectState = $scope.selectedContry.statsInListForm;
        $scope.$watch('selectedContry', function () {
            $scope.selectState = $scope.selectedContry.statsInListForm;
        });
    }).error(function () {
        console.error("working url colege ")
    });
});