package pojo;

/**
 * Created by zq on 2019/7/16
 */
public class DISpring {
    private String info="Dependency Injection 依赖注入，" +
            "在Spring框架负责创建Bean对象时，动态的将依赖对象注入到Bean组件 ";
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
