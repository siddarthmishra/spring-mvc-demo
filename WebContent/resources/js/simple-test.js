function doSomeWork() {
	
	alert('I\'m doing some work!!!');
	
}
function checkSubmitButton(){
	var name = $("#studentName").val($("#studentName").val().trim()).val();
	if(name.length > 0){
		$("#submitForm").removeAttr('disabled');
	} else if(name.length == 0) {
		$("#submitForm").attr('disabled', 'disabled');
	}
}