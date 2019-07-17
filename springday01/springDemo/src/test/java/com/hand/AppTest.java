package com.hand;

import static org.junit.Assert.assertTrue;
import  com.hand.po.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void before(){
       //ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Users\\YXP\\IdeaProjects\\SpringDay01\\springDemo\\src\\main\\resources\\applicationContext");
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        HelloSpring HelloSpring =(HelloSpring) applicationContext.getBean("helloSpring");
        HelloSpring.sayHello();
    }
    @Test

 public  void now(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        HelloSpring HelloSpring =(HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(HelloSpring.helloDI());

    }
    @Test
    public  void testPerson(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }
    @Test
    public  void testCollectionBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        CollectionBean collection = (CollectionBean) applicationContext.getBean("collectionBean");
    for (String arr :collection.getArray()
         ) {
        System.out.println(arr);
    }
    for (String li :collection.getList()
    ) {
        System.out.println(li);
    }
        for (String key:collection.getMap().keySet()
             ) {
            String value = (String)collection.getMap().get(key);
            System.out.println(value);
        }
    }
   @Test
   public void testAnnotion(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
       AnnotationController annotationController = (AnnotationController) applicationContext.getBean("annotationController");
       annotationController.add();
   }
}