package com.lx.zuuldemo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Zuul过滤器
 * 在请求被路由之前检查请求中是否有accessToken参数，若有就进行路由，
 * 若没有就拒绝访问，返回 401 Unauthorized 错误
 */

public class AccessFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     * pre：可以在请求路由之前调用
     * routing：在路由请求时候被调用
     * post：在routing和error过滤器之后被调用
     * error：处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    // 通过int值来定义过滤器的执行顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    // 返回一个boolean类型来判断该过滤器是否要执行
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * 通过 ctx.setSendZuulResponse(false)  令zuul过滤该请求，不对其进⾏路由
     * 通过 ctx.setResponseStatusCode(401)  设置了其返回的错误码
     * 我们也可以进⼀步优化我们的返回，⽐如，通过 ctx.setResponseBody(body)  对返回body内容进⾏编辑等
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("accessToken");
        if (accessToken == null){
            logger.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        logger.info("access token ok");
        return null;
    }
}
