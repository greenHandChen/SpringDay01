package com.tlq.zull.filter;

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

/**
 * @Description: 网关过滤器
 * @Author: TanLinQuan
 * @Date: 2019/7/26 19:35
 * @Version: V1.0
 **/
@Component
public class AuthorizeFilter  extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizeFilter.class);
    private static String accessToken;

    public AuthorizeFilter() {
        accessToken = UUID.randomUUID().toString();
        LOGGER.info("==> access_token : {}", accessToken);
    }

    /**
     * 外部请求 -> zuul -(pre)> 选择路由的服务 -(routing)> 请求服务 -(post)> zuul
     *      * pre:在请路由之前执行
     *      * routing:在请求路由之后执行
     *      * post:在请求路由到服务之后执行
     *      * error:在其他阶段发生错误的时候执行
     * **/

    /**
    * @Description: 过滤器类型
    * @Author: TanLinQuan
    * @Date: 2019/7/26 19:40
    * @params: []
    * @return: java.lang.String
    **/
    @Override
    public String filterType() {
        return "pre";
    }

    /**
    * @Description: 过滤器执行顺序
    * @Author: TanLinQuan
    * @Date: 2019/7/26 19:41
    * @params: []
    * @return: int
    **/
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
    * @Description: 需不需要执行过滤器
    * @Author: TanLinQuan
    * @Date: 2019/7/26 19:41
    * @params: []
    * @return: boolean
    **/
    @Override
    public boolean shouldFilter() {
        return false;
    }


    /**
    * @Description: 执行具体逻辑过程
    * @Author: TanLinQuan
    * @Date: 2019/7/26 19:41
    * @params: []
    * @return: java.lang.Object
    **/
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = new RequestContext();
        HttpServletRequest request = requestContext.getRequest();
        String accessToken = request.getParameter("access_token");
//        模拟鉴权
        if (!Objects.equals(accessToken,AuthorizeFilter.accessToken)) {
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            requestContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            requestContext.setSendZuulResponse(false);
        }
        return null;
    }
}
