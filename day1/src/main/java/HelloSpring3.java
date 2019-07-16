import org.springframework.beans.factory.annotation.Autowired;


public class HelloSpring3 {
    @Autowired
    private HelloSpring2 helloSpring2;

    public HelloSpring2 getHelloSpring2() {
        return helloSpring2;
    }

    @Autowired
    public void setHelloSpring2(HelloSpring2 helloSpring2) {
        this.helloSpring2 = helloSpring2;
    }

    @Override
    public String toString() {
        return "HelloSpring3{" +
                "helloSpring2=" + helloSpring2 +
                '}';
    }
}
