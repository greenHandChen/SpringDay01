package com.zt.eureka_producer_user;

import com.zt.eureka_producer_user.dto.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 14:48
 */
public class TestDemo {

    private Logger logger = LoggerFactory.getLogger(TestDemo.class);

    private User user = new User();

    @Test
    public void test_01() {
        user.setUsername("invoker");
        logger.info(user.toString());
        user.setUsername(null);
        logger.info(user.toString());
    }
}
