package test;

/**
 * Created by zq on 2019/7/17
 */
public class DemoService {
    public  void printService(String msg){
        new DemoDao().printDao(msg);
    }
}
