package club.osai.zuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.logging.slf4j.SLF4JLoggerContextFactory;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AccessFilter.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description: token 认证
 */
@Component
public class AccessFilter extends ZuulFilter {

    @Value("${spring.profiles.active}")
    private String model;

    private static String token = "";
    private Logger logger = Logger.getLogger(ZuulFilter.class);

    @Override
    public String filterType() {
        token = UUID.randomUUID().toString();
        logger.info("token:" + token);
        logger.info("model:" + model);


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
        String token = request.getParameter("token");
        if (model.equals("dev")) {
            logger.info("认证通过");

            return null;
        }
        if (!AccessFilter.token.equals(token)) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            requestContext.setResponseBody(HttpStatus.UNAUTHORIZED.getReasonPhrase());

            return null;
        }
        logger.info("认证通过");

        return null;


    }
}
