/**
 * 
 */
app.controller('userPopupCtrl',function($scope,$http,$uibModalInstance,$uibModal)
		{
			$scope.close=function()
			{
				$uibModalInstance.dismiss('cancel');
			};
		});