import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    @Test
    public void test1() {
        MySpring mySpring = new MySpring();

        DISpring diSpring = new DISpring();

        mySpring.setDiSpirng(diSpring);

        mySpring.helloDI();
    }


    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        MySpring mySpring = (MySpring) applicationContext.getBean("mySpring");

        mySpring.helloDI();
    }

    @Test
    public void test3(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person)applicationContext.getBean("man");

        System.out.println(person.toString());
    }

    @Test
    public void collection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");

        System.out.println(collectionBean.getArray());

        System.out.println(collectionBean.getList());
    }
}