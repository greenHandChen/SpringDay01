package transaction.service;


import transaction.dao.IAccountDao;

public class IAccountServiceImpl implements IAccountService{

    private IAccountDao iAccountDao;

    public void setiAccountDao(IAccountDao iAccountDao) {
        this.iAccountDao = iAccountDao;
    }

    public void transfer(String outer, String inner, Double money){


            iAccountDao.out(outer,money);
            int i = 1/0;
            iAccountDao.in(inner,money);

    }
}
