import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import text.AnnotationController;
import text.Person;

import java.util.Iterator;
import java.util.Set;

public class TestSpring {

    @Test
    public void now1()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringDemo1\\src\\main\\java\\applicationContext.xml");
        HelloeSpring helloeSpring=(HelloeSpring) applicationContext.getBean("helloSpring");
        helloeSpring.setInfo("spring:芜湖班的同学们好！");
        System.out.println(helloeSpring.getInfo());
    }
    @Test
    public void new2()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringDemo1\\src\\main\\java\\applicationContext.xml");
        HelloeSpring helloeSpring=(HelloeSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloeSpring.getDiSpring().hellloDI());
    }
    @Test
    public void new3()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringDemo1\\src\\main\\java\\applicationContext.xml");
        Person person=(Person) applicationContext.getBean("person");
        System.out.println(person);
    }
    @Test
    public void new4()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringDemo1\\src\\main\\java\\applicationContext.xml");
        CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("collectionBean");
        for (String str:collectionBean.getArray() )
            System.out.println(str);
        for (String str:collectionBean.getList() )
            System.out.println(str);
        for (String str:collectionBean.getSet() )
            System.out.println(str);
        Set<String> keySet=collectionBean.getMap().keySet();
        Iterator<String> it =keySet.iterator();
        while (it.hasNext())
        {
            String key = it.next();
            String value = collectionBean.getMap().get(key);
            System.out.println(key+"和"+value);
        }
    }
    @Test
    public void new5()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringDemo1\\src\\main\\java\\applicationContext.xml");
        Person person=(Person) applicationContext.getBean("person");
        person.sayHello();
    }
    @Test
    public void new6()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("C:\\Users\\许博思\\IdeaProjects\\SpringDemo1\\src\\main\\java\\applicationContext.xml");
        AnnotationController annotationController=(AnnotationController) applicationContext.getBean("annotationController");
        annotationController.addUser();;
    }

}
