(function(){
    var app = angular.module('logophile',[]);
    app.controller('QuizController',
     ['$scope', '$http', '$sce',function($scope, $http, $sce){
    $scope.index = 0;
    //get the questions from the server
    $http.get('http://localhost:8080/questions')
        .then(function(response){
            $scope.greeting = response.data;
            $scope.question = $scope.greeting[$scope.index];
            console.log($scope.greeting);
        });

    $scope.form = {};

    //post user's answers to server
    $scope.onSubmit = function() {
        console.log($scope.form.answer);
        $http.post(
        'http://localhost:8080/user-answers',
         {optionId: $scope.form.answer, questionId: $scope.question.questionId})
            .then(function successCallback(response){
                console.log(response);
            }, function errorCallback(error){
                console.log(error);
            });

        if($scope.index < $scope.greeting.length - 1) {
            // 2. move on to next question
            $scope.question = $scope.greeting[++$scope.index];
            // reset answer
            $scope.form.answer = "";
            //get the user's score from the database
        } else {
            $http.get('http://localhost:8080/user-score')
            .then(function successCallback(score){
                swal("Your score: ", score.data * 100 + "%");
                //alert(score);
                console.log("Score" + score);
            }, function errorCallback(error){
                console.log(error);
            });
        }

    };

    }]);

})();

