angular
    .module('myApp', ['ngResource'])
    .service('UsersService', function ($log, $resource) {
        return {
            getAll: function () {
                var textResource = $resource('texts', {}, {
                    query: {method: 'GET', params: {}, isArray: true}
                });
                return textResource.query();
            }
        }
    })
    .controller('textController', function ($scope, $log, textService) {
        $scope.texts = textService.getAll();
    });
