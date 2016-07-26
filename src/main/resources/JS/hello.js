/**
 * 
 */
$(function() {
	$(document).on("click", "#submitButton", function() {
		$.ajax({
			dataType: 'json',
			type: "PUT",
			url: "ajax/test.do",
			success: function() {
				alert("succes");
			}
		})
	});
});