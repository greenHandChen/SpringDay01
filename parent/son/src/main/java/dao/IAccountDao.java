package dao;

/**
 * @Author xiongyilin
 * @Date 2019/7/17 22:58
 * @Version 1.0
 */

public interface IAccountDao {
    void in(String inner, Double money);
    void out(String outer, Double money);
}