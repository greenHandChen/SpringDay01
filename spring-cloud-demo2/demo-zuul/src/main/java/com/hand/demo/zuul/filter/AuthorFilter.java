package com.hand.demo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.UUID;
@Component
public class AuthorFilter extends ZuulFilter {
    private static final Logger logger= LoggerFactory.getLogger(AuthorFilter.class);
    private static  String accessToken;
    public AuthorFilter(){
        accessToken= UUID.randomUUID().toString();
        logger.info("==>accessToken : {}",accessToken);
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
        RequestContext requestContext= RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String accessToken = request.getParameter("access_token");
        if (!Objects.equals(accessToken,AuthorFilter.accessToken)){
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            requestContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());
            requestContext.setSendZuulResponse(false);
        }
        return null;
    }
}
