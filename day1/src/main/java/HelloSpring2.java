import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HelloSpring2 {
    private String info;

    @Override
    public String toString() {
        return "HelloSpring2{" +
                "info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
