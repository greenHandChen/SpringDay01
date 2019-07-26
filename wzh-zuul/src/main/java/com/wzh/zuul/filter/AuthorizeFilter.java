package com.wzh.zuul.filter;

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
    private static String accesToken;

    public AuthorizeFilter() {
        accesToken = UUID.randomUUID().toString();
        logger.info("==>accesToken:{}", accesToken);
    }

    /**
     * pre请求路由前执行
     * routing:请求路由后执行
     * post 在请求路由到服务之后执行
     * error发生错误时执行
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器的优先级
     * 数字越小优先级越高
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行run方法
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 返回的Obeject没有意义
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestcontext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestcontext.getRequest();
        String accesToken = request.getParameter("accesToken");
        if (!Objects.equals(accesToken, AuthorizeFilter.accesToken)) {
            requestcontext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            requestcontext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            requestcontext.setSendZuulResponse(false);
        }
        return null;
    }
}
