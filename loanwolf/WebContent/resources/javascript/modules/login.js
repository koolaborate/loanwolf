// for login
$(document).ready(function(){
	var $min, $remove, $apply, $uniformed;
	
	$uniformed = $(".styleThese").find("input, textarea, select, button, a.uniformTest").not(".skipThese");
	$uniformed.uniform();
}); 