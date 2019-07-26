package com.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.UUID;

public class AccessFilter  extends ZuulFilter {
    private static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);
    private static String accessToken;

    public AccessFilter() {
        accessToken = UUID.randomUUID().toString();
        logger.info("-----"+accessToken);
    }

    /**
     *
     * @return
     */
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
        return false;
    }

    @Override
    public Object run(){
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String access_token = request.getParameter("access_token");
        if (Objects.equals(access_token,AccessFilter.accessToken)){
            requestContext.setResponseStatusCode(HttpStatus.OK.value());
            requestContext.setResponseBody("yishouquan");
            requestContext.setSendZuulResponse(false);
        }else {
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            requestContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            requestContext.setSendZuulResponse(false);
        }
        return null;
    }
}
