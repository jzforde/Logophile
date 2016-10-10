(function(){
    var app = angular.module('logophile',[]);
    app.controller('QuizController', ['$scope', '$http', '$sce',function($scope, $http, $sce){
    $scope.index = 0;

    $http.get('http://localhost:8080/questions')
        .then(function(response){
            $scope.greeting = response.data;
            $scope.question = $scope.greeting[$scope.index];
            console.log($scope.greeting);
        });

    $scope.form = {};

    $scope.onSubmit = function() {
        console.log($scope.form.answer);
        // TODO: 1. call rest to save answer
        $http.post('http://localhost:8080/user-answers', {optionId: $scope.form.answer, questionId: $scope.question.questionId})
            .then(function successCallback(response){
                console.log(response);
            }, function errorCallback(error){
                console.log(error);
            });
        // 2. move on to next question
        $scope.question = $scope.greeting[++$scope.index];

        // reset answer
        $scope.form.answer = "";
    };

    }]);

})();

