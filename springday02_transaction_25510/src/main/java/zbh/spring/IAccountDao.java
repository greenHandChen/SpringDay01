package zbh.spring;

import org.springframework.stereotype.Repository;

/**
 * @author: wuhui
 * @time: 2019/7/17 11:16
 * @desc:
 */
public interface IAccountDao {
    public void out(String outer,Double money);
    public void in(String inner ,Double money);

}
