$(function(){
	var player = videojs('videoDiv');
	player.src({
		"type":"video/mp4",
		"src":"http://source.cc.highso.com.cn/flvs/ca/QxBKK/mpnnCesAy-2.mp4"
	});
	player.poster("../img/5.jpg");
	player.controls(true);
	player.preload("auto");
	var currentTime = 300;
	player.play();// 自动播放
	player.on('timeupdate', function () {
		console.log(player.currentTime());
		var time = player.currentTime();
		if(time<1 && currentTime>time){// 手机浏览器对于currentTime的支持不友好，如果当前进度在1秒之内，则与参数中的播放时间进行比较
			player.currentTime(currentTime);
		}
		// TODO 记录观看记录
		$("#msg").empty().text(player.currentTime());
	});
	player.on('play', function() {  
	  console.log('开始/恢复播放');
	});
	// 暂停播放
	player.on('pause', function() {  
	  console.log('暂停播放');
	});
	player.on('loadedmetadata',function(){
		
	});
});	