package club.osai.dao;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AccountDao.java
 * @Version: 1.0
 * @Date: 2019/7/17
 * @Description:
 */

public interface AccountDao {
    void in(String inner, Double money);

    void out(String outer, Double money);
}
