package TransferCase.Dao;

public interface AccountDao {

    // 转入
    // inner：转入账户
    // money：转入金额
    public void in(String inner, Double money);

    // 转出
    // outer：转出账户
    // money：转出金额
    public void out(String outer, Double money);
}
