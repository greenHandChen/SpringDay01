import com.wzh.service.impl.AccountServiceImpl;
import org.junit.Test;

public class testDemo {

    @Test
    public void test1(){
        AccountServiceImpl serviceImpl = new AccountServiceImpl();

        serviceImpl.transfer("mybatis","hibernate",200.00);
    }
}
