package com.hand.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {


    // 过滤器执行位置
    /*
    * pre
    * rooting
    * post
    * error
    *
    * @return
    * */
    @Override
    public String filterType() {

        return "pre";

    }

    // 过滤器执行顺序
    // 执行顺序从小到大
    @Override
    public int filterOrder() {

        return 0;

    }

    // 过滤器开关
    @Override
    public boolean shouldFilter() {

        return true;

    }

    // 过滤器具体方法
    @Override
    public Object run() {

        // 获取当前请求的上下文
        RequestContext requestContext = RequestContext.getCurrentContext();

        // 获取当前HTTP请求
        HttpServletRequest httpServletRequest = requestContext.getRequest();

        // 获取请求口令
        String key = httpServletRequest.getParameter("key");

        // 请求失败
//        if(!key.equals("25573")) {
//
//            System.out.println("请求失败");
//
//            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//            requestContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
//
//            // 关闭请求
//            requestContext.setSendZuulResponse(false);
//
//        }

        // 请求成功

        return null;

    }

}
