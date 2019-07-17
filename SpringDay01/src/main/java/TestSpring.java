import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

//    @Test
//    public void before(){
//
//        HelloSpring helloSpring =new HelloSpring();
//
//        helloSpring.setInfo("芜湖班的同学们好!");
//
//        System.out.println(helloSpring.getInfo());
//    }
//
//    @Test
//    public void now(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//
//        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
//
//        helloSpring.setInfo("Spring：hello");
//
//        System.out.println(helloSpring.getInfo());
//    }

    @Test
    public void before() {
        HelloSpring helloSpring = new HelloSpring();

        DISpring diSpring = new DISpring();

        helloSpring.setDiSpirng(diSpring);

        helloSpring.helloDI();
    }


    @Test
    public void now() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");

        helloSpring.helloDI();
    }

    @Test
    public void Byset(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person)applicationContext.getBean("person");

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