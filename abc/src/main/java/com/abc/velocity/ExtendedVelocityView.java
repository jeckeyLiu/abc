package com.abc.velocity;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.context.Context;
import org.springframework.web.servlet.view.velocity.VelocityView;

public class ExtendedVelocityView extends VelocityView {
	
	protected Context createVelocityContext(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        // 增加服务器路径
        String host = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        model.put("SERVER_HOST", host);
        // 上下文
        model.put("SERVER_CONTEXT", request.getContextPath());
        // 加入date工具类
        //model.put("DATE_UTIL", DateUtils.class);
        return super.createVelocityContext(model, request, response);
    }
}
