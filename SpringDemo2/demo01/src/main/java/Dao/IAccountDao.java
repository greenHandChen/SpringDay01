package Dao;

public interface IAccountDao {
    //转入
    void in(String outer,Double money);
    //转出
    void out(String outer,Double money);

}
