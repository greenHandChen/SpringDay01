package test;

public class DemoService {
    public static void printService(String msg){
        new DemoDao().printDao(msg);
    }
}
