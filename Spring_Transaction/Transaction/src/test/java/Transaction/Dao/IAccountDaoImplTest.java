package Transaction.Dao;

import Transaction.Dao.impl.IAccountDaoImpl;
import Transaction.Service.IAcountService;
import Transaction.Service.impl.IAcountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class IAccountDaoImplTest {

    /**
    * @Description: 转账SQL接口测试
    * @Author: TanLinQuan
    * @Date: 2019/7/17 16:54
    * @params: []
    * @return: void
    **/
    @Test
    public void sql() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountDaoImpl iAccountDao = (IAccountDaoImpl) context.getBean("IAccountDaoImpl");
        if (iAccountDao.out("mybatis", BigDecimal.valueOf(100)) == 1) {
            System.out.println("转出成功");
        }else {
            System.out.println("转出失败");
        }
        if (iAccountDao.in("hibernate",BigDecimal.valueOf(100)) == 1) {
            System.out.println("转入成功");
        }else {

            System.out.println("转入失败");
        }

    }


    /**
    * @Description: 转账service测试
    * @Author: TanLinQuan
    * @Date: 2019/7/17 16:54
    * @params: []
    * @return: void
    **/
    @Test
    public void CountService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAcountServiceImpl iAcountService = (IAcountServiceImpl) context.getBean("IAcountServiceImpl");
        iAcountService.transfer("mybatis","hibernate",BigDecimal.valueOf(100));
    }

}