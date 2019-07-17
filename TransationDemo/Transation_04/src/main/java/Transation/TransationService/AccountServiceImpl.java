package Transation.TransationService;

import Transation.TransationDAO.IAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    public void transfer(String outer, String inner, BigDecimal money){
            accountDAO.in(inner,money);
            int i = 1/0;
            accountDAO.out(outer,money);
    }
}
