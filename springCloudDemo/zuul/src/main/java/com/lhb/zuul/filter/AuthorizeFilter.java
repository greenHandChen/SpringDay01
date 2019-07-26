package com.lhb.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.UUID;

/**
 * Created By LHB on 2019/7/26;
 */
public class AuthorizeFilter extends ZuulFilter {
    private static final Logger logger=LoggerFactory.getLogger(AuthorizeFilter.class);
    private static String accessToken;

    public AuthorizeFilter(){
        accessToken = UUID.randomUUID().toString();
        logger.info("==> accessToken : {}",accessToken);
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
    public Object run() throws ZuulException {

        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String accessToken = request.getParameter("access_token");
        if (!Objects.equals(accessToken,AuthorizeFilter.accessToken)){
            requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            requestContext.setResponseBody(String.valueOf(HttpStatus.SC_UNAUTHORIZED));
            requestContext.setSendZuulResponse(false);
        }

        return null;
    }
}
