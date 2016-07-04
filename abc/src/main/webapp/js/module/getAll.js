$(function(){
	// 模块点击跳转
	$(".moduleDiv").on("click",function(){
		var chapterId = $(this).attr("data");
		var url = SERVER_CONTEXT+"/section/getByChapter.do?chapterId="+chapterId;
		window.location.href=url;
	});
});