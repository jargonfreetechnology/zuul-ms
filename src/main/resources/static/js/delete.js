function showDelConfirm(userId) {
	addSoftMask("Delete");
	$("#userId").val(userId);
	$(".del-confirm-dlg").show();
}

function confirmDelete(userId) {
	$("#delForm").attr("action", "delete-record");
	$("#delForm").submit();
}

function cancelDelete() {
	event.preventDefault();
    hideDialogs();
    removeMasks();
}