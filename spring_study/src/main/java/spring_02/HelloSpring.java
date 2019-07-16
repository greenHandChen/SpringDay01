package spring_02;

public class HelloSpring {
    private  String info;

    public  void initBean(){
        System.out.println("数据库配置连接完成");
    }

    public void destoryBean(){
        System.out.println("当前数据库连接已被关闭");
    }
}
