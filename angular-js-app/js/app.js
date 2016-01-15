var app = angular.module('blog', [ ]);

app.controller('HomeController', ['$scope', '$http', function($scope, $http) {
    $scope.helloWorld = 'Aplicatii Web cu suport Java!';
  
  var url = "http://localhost:8080/persoana";
   $scope.persoane = [];
   $scope.keys = [];
	$scope.obj={};
   $scope.person = {};
   $scope.editPerson = {};
 
 
 
   $http.get('http://localhost:8080/persoana').then(
     function successCallback(response) {
		$scope.obj=response;
     $scope.persoane = $scope.obj.data;
     $scope.keys = Object.keys(response.data[0]);
   });
 
 
   $scope.addPersoana = function(persoana) {
        persoana.id = parseInt(persoana.id);
        console.log(persoana.id);
        $http({
            method: 'POST',
            url: url,
            data: persoana
        }).then(function successCallback(response) {
            console.log(response);
            $scope.persoane.push(persoana);
            // done.
        }, function errorCallback(response) {
            console.log(response);
        });
    };


    $scope.deletePersoana = function(id) {
        $http({
            method: 'DELETE',
            url: url+'/' + id,
            data: {}
        }).then(function successCallback(response) {
            // aici nu intra niciodata ca e functia de succes
        }, function errorCallback(response) {
            // aici intra pentru ca da eroare
            $scope.persoane = $scope.persoane.filter(function(obj) {
                return obj.id !== id;
            });
        });
    };



    $scope.setUpdatePerson = function(person) {
        $scope.editPerson = person;
    };


    $scope.updatePerson = function() {
        $http({
            method: 'PUT',
            url: url,
            data: $scope.editPerson
        }).then(function successCallback(response) {
            $scope.editPerson = {};
            console.log(response);
            // $scope.persoane.push($scope.editPerson);
            // done.
        }, function errorCallback(response) {
            $scope.editPerson = {};
            console.log(response);
        });
    };
    
    }]);  

app.controller('JucatorController', ['$scope', '$http', function($scope, $http) {
    $scope.helloWorld = 'Aplicatii Web cu suport Java!';

    var url = "http://localhost:8080/jucator";
   $scope.jucatori = [];
   $scope.keys = [];
	$scope.obj={};
   $scope.jucat = {};
   $scope.editJucat = {};
 
 
 
   $http.get('http://localhost:8080/jucator').then(
     function successCallback(response) {
     $scope.obj=response;
     $scope.jucatori = $scope.obj.data;
     $scope.keys = Object.keys(response.data[0]);
   });
 
 
   $scope.addJucator = function(jucator) {
        jucator.id = parseInt(jucator.id);
        console.log(jucator.id);
        $http({
            method: 'POST',
            url: url,
            data: jucator
        }).then(function successCallback(response) {
            console.log(response);
            $scope.jucatori.push(jucator);
            // done.
        }, function errorCallback(response) {
            console.log(response);
        });
    };


    $scope.deleteJucator = function(id) {
        $http({
            method: 'DELETE',
            url: url+'/' + id,
            data: {}
        }).then(function successCallback(response) {
            // aici nu intra niciodata ca e functia de succes
        }, function errorCallback(response) {
            // aici intra pentru ca da eroare
            $scope.jucatori = $scope.jucatori.filter(function(obj) {
                return obj.id !== id;
            });
        });
    };



    $scope.setUpdateJucat = function(jucat) {
        $scope.editJucat = jucat;
    };


    $scope.updateJucat = function() {
        $http({
            method: 'PUT',
            url: url,
            data: $scope.editJucat
        }).then(function successCallback(response) {
            $scope.editJucat = {};
            console.log(response);
        }, function errorCallback(response) {
            $scope.editJucat = {};
            console.log(response);
        });
    };
    
     }]); 
    
app.controller('DoctorController', ['$scope', '$http', function($scope, $http) {
    $scope.helloWorld = 'Aplicatii Web cu suport Java!';

    var url = "http://localhost:8080/doctor";
   $scope.doctori = [];
   $scope.keys = [];
	$scope.obj={};
   $scope.doc = {};
   $scope.editDoc = {};
 
 
 
   $http.get('http://localhost:8080/doctor').then(
     function successCallback(response) {
		$scope.obj=response;
     $scope.doctori = $scope.obj.data;
     $scope.keys = Object.keys(response.data[0]);
   });
 
 
   $scope.addDoctor = function(doctor) {
        doctor.id = parseInt(doctor.id);
        console.log(doctor.id);
        $http({
            method: 'POST',
            url: url,
            data: doctor
        }).then(function successCallback(response) {
            console.log(response);
            $scope.doctori.push(doctor);
            // done.
        }, function errorCallback(response) {
            console.log(response);
        });
    };


    $scope.deleteDoctor = function(id) {
        $http({
            method: 'DELETE',
            url: url+'/' + id,
            data: {}
        }).then(function successCallback(response) {
            // aici nu intra niciodata ca e functia de succes
        }, function errorCallback(response) {
            // aici intra pentru ca da eroare
            $scope.doctori = $scope.doctori.filter(function(obj) {
                return obj.id !== id;
            });
        });
    };



    $scope.setUpdateDoc = function(doc) {
        $scope.editDoc = doc;
    };


    $scope.updateDoc = function() {
        $http({
            method: 'PUT',
            url: url,
            data: $scope.editDoc
        }).then(function successCallback(response) {
            $scope.editDoc = {};
            console.log(response);
        }, function errorCallback(response) {
            $scope.editDoc = {};
            console.log(response);
        });
    };
    
 }]); 

app.controller('AnimalsController', ['$scope', '$http', function($scope, $http) {
    $scope.helloWorld = 'Aplicatii Web cu suport Java!';


    var url = "http://localhost:8080/animal";
   $scope.animals = [];
   $scope.keys = [];
	$scope.obj={};
   $scope.ani = {};
   $scope.editAni = {};
 
 
 
   $http.get('http://localhost:8080/animal').then(
     function successCallback(response) {
		$scope.obj=response;
     $scope.animals = $scope.obj.data;
     $scope.keys = Object.keys(response.data[0]);
   });
 
 
   $scope.addAnimal = function(animal) {
        animal.id = parseInt(animal.id);
        console.log(animal.id);
        $http({
            method: 'POST',
            url: url,
            data: animal
        }).then(function successCallback(response) {
            console.log(response);
            $scope.animals.push(animal);
            // done.
        }, function errorCallback(response) {
            console.log(response);
        });
    };


    $scope.deleteAnimal = function(id) {
        $http({
            method: 'DELETE',
            url: url+'/' + id,
            data: {}
        }).then(function successCallback(response) {
            // aici nu intra niciodata ca e functia de succes
        }, function errorCallback(response) {
            // aici intra pentru ca da eroare
            $scope.animals = $scope.animals.filter(function(obj) {
                return obj.id !== id;
            });
        });
    };



    $scope.setUpdateAni = function(ani) {
        $scope.editAni = ani;
    };


    $scope.updateAni = function() {
        $http({
            method: 'PUT',
            url: url,
            data: $scope.editAni
        }).then(function successCallback(response) {
            $scope.editAni = {};
            console.log(response);
        }, function errorCallback(response) {
            $scope.editAni = {};
            console.log(response);
        });
    };
       
  }]); 