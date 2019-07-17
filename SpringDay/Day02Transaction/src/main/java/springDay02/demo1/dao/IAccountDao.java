package springDay02.demo1.dao;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
public interface IAccountDao {
    public void out(String outer,Double money);

    public void in(String inner,Double money);
}
