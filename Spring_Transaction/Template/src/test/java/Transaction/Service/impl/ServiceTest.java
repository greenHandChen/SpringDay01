package Transaction.Service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/17 17:06
 * @Version: V1.0
 **/
public class ServiceTest {

    /**
    * @Description: 事务模板
    * @Author: TanLinQuan
    * @Date: 2019/7/17 17:07
    * @params: []
    * @return: void
    **/
    @Test
    public void ServiceTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAcountServiceImpl iAcountService = (IAcountServiceImpl) context.getBean("IAcountServiceImpl");
        iAcountService.transfer("mybatis","hibernate", BigDecimal.valueOf(100));
    }
}
