/**
 * 
 */
app
		.controller(
				'depositEntryCtrl',
				function($scope, $http, $q, commonService, depositService,
						$routeParams) {
					$scope.model = {
						id : 0
					};
					$scope.departments = [];
					$scope.branches = [];
					$scope.positions = [];
					$scope.objectives = [];
					$scope.documentGroups = [];
					$scope.documentModes = [];
					$scope.documentTypes = [];
					$scope.id = $routeParams.id;
					$scope.init = function() {

						if ($scope.id == null || $scope.id == undefined) {
							$scope.id = 0;
						}
						var promise = $scope.initPage();
						promise.then(function() {

						});

					};
					$scope.initPage = function() {
						var deferred = $q.defer();
						var promise = $q
								.all(
										[
												commonService.getAllBranch(),
												commonService
														.getAllDepartment(),
												commonService.getAllPosition(),
												commonService
														.getAllDepositObjective(),
												commonService
														.getAllDocumentGroup(),
												commonService
														.getAllDocumentMode(),
												commonService
														.getAllDocumentType(),
												depositService
														.getByKey($scope.id) ])
								.then(
										function(data) {
											$scope.branches = data[0].data.list;
											$scope.departments = data[1].data.list;
											$scope.positions = data[2].data.list;
											$scope.objectives = data[3].data.list;
											$scope.documentGroups = data[4].data.list;
											$scope.documentModes = data[5].data.list;
											$scope.documentTypes = data[6].data.list;
											$scope.model = data[7].data;
											if($scope.model==null || $scope.model==undefined)
											{
												$scope.model={};
												$scope.model.items=[];
											}
											$scope.model.id = $scope.id;
											if ($scope.model.id > 0) {
												$scope.model.depositBy = commonService
														.getObject($scope.model.depositBy);
												$scope.model.reviewBy = commonService
														.getObject($scope.model.reviewBy);
												$scope.model.approveBy = commonService
														.getObject($scope.model.approveBy);
												$scope.model.branch = commonService
														.getObject($scope.model.branch);
												$scope.model.department = commonService
														.getObject($scope.model.department);
												$scope.model.position = commonService
														.getObject($scope.model.position);
												$scope.model.depositDate = commonService
														.getDate($scope.model.depositDate);
												$scope.model.reviewDate = commonService
														.getDate($scope.model.reviewDate);
												$scope.model.approveDate = commonService
														.getDate($scope.model.approveDate);
												$scope.model.documentGroup = commonService
														.getObject($scope.model.documentGroup);
												$scope.model.documentMode = commonService
														.getObject($scope.model.documentMode);
												$scope.model.items = commonService
														.getArray($scope.model.items);
												for (var index = 0; index < $scope.model.items.length; index++) {
													var item = $scope.model.items[index];
													item.documentType = commonService
															.getObject(item.documentType);
												}
											}
											deferred.resolve(data);
										});

						return promise;
					};
					$scope.addItem = function() {
						if($scope.model.items==null || $scope.model.items==undefined)
							{
								$scope.model.items=[];
							}
						var item = {};
						if ($scope.id == 0) {
							item.depositId = undefined;
						} else {
							item.depositId = $scope.id;
						}
						item.selected = false;
						
						$scope.model.items.push(item);
					};
					$scope.delItem = function() {
						for (var index = 0; index < $scope.model.items.length; index++) {
							var item = $scope.model.items[index];
							if (item.selected) {
								$scope.model.items.splice(index, 1);
								index--;
							}
						}
					};
					$scope.findBorrowBy = function() {

					};
					$scope.findReviewBy = function() {

					};
					$scope.findApproveBy = function() {

					};
					$scope.save = function() {
						depositService.save($scope.model).success(
								function(data) {
									$scope.model = {
											id : 0
										};
									alert("success");
								});
					};
				});