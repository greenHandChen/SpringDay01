import org.junit.Test;

public class TestDISpring {
    @Test
    public void before(){
        HelloSpring helloSpring = new HelloSpring();
        DISpring diSpring = new DISpring();
        helloSpring.setDiSpring(diSpring);
        System.out.println(helloSpring.helloDI());
    }
}
