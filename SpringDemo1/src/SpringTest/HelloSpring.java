package SpringTest;

public class HelloSpring {
    private String info="生命周期";

    public void initBean(){
        System.out.println("数据库连接成功");
    }

    public void destoryBean(){
        System.out.println("数据库连接关闭");
    }
}
