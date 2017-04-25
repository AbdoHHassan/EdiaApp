angular
    .module('myApp', ['ngResource'])
    .service('UsersService', function ($log, $resource) {
        return {
            getAll: function () {
                var userResource = $resource('texts', {}, {
                    query: {method: 'GET', params: {}, isArray: true}
                });
                return userResource.query();
            }
        }
    })
    .controller('UsersController', function ($scope, $log, UsersService) {
        $scope.texts = UsersService.getAll();
    });
