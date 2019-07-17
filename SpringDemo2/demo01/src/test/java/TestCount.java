import Service.IAccountService;
import Service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestCount {

    @Autowired
    IAccountService iAccountService;

    @Test
    public void t1(){
        iAccountService.transfer("mybatis","hibernate",50.00);
    }
}
