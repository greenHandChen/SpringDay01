package springDay02.demo2.dao;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public interface AccountDao {
    public void out(String outer, Double money);

    public void in(String inner, Double money);
}
