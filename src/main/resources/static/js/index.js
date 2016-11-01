//权限管理弹框--添加新权限
	$('.addAuthority').click(function(){
		alert("你好");
		$('#addAuthorityBox').show();
		openDialog("addAuthorityBox");
	});
	$('.cancel').click(function(){
		$('#addAuthorityBox,.deletBox,.noPassBox,.noPassBoxWrap').hide();
	});
	

	$('.coledit').click(function(){
		var cid=$(this).parent().siblings(".colId").text();
		$("#cid").val(cid);
		var cname=$("#colName"+cid).val();
		$("#name").val(cname);
		$('#addAuthorityBox1').show();
		
	});
	$('.cancel1').click(function(){
		$('#addAuthorityBox1,.deletBox,.noPassBox,.noPassBoxWrap').hide();
	});
	//分页用的js（GO的点击）
	function isNumber2(oNum) {
		if (!oNum)
			return false;
		var strP = /^\d+/;
		if (!strP.test(oNum))
			return false;
		try {
			if (parseFloat(oNum) != oNum)
				return false;
		} catch (ex) {
			return false;
		}
		return true;
	}