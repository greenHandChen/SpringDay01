package com.hand.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.UUID;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 15:39
 **/
@Component
public class AuthorizeFilter extends ZuulFilter {
    private static final Logger logger = LoggerFactory.getLogger(AuthorizeFilter.class);
    private static String accessToken = "";

    public AuthorizeFilter() {
        accessToken = UUID.randomUUID().toString();
        logger.info("===>" + accessToken);
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("access_token");
        if (!Objects.equals(token, AuthorizeFilter.accessToken)) {
            requestContext.setResponseStatusCode(HttpStatus.OK.value());
            requestContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            requestContext.setSendZuulResponse(false);
        }
        return null;
    }
}
