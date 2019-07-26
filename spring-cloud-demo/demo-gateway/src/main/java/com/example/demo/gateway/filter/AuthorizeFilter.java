package com.example.demo.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.UUID;

@Component
public class AuthorizeFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(AuthorizeFilter.class);
    private static String accessToken;

    public AuthorizeFilter(){
        accessToken = UUID.randomUUID().toString();
        logger.info("==>accessToken={}",accessToken);
    }




    /**
     * 外部请求 -》zuul -（pre）》选择路由的服务 -（routing）》请求服务-（post）》zuul
     * pre: 在请求路由之前执行
     * routing：在请求路由之后执行
     * post;在请求路由到服务之后执行
     * error：在其他阶段发生错误的时候执行
     * @return   路由的类型是什么
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     *
     * @return  过滤器执行的顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 需不需要执行过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体的执行逻辑
     * @return 被忽略
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String access_token = request.getParameter("access_token");
        //模拟access_token授权
        if(!Objects.equals(access_token,AuthorizeFilter.accessToken)){
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            requestContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            //设置当前路由需不需要进行转发
            requestContext.setSendZuulResponse(false);
        }
        return null;
    }
}
