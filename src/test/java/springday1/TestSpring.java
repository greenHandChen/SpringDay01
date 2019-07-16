package springday1;

import com.softeem.spring1.HolleSpring;
import com.softeem.spring2.CollectionBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

  @Test
    public void before(){
         HolleSpring h = new HolleSpring();
         h.setInfo("你好，世界");
        System.out.println(h.getInfo());
    }
    @Test
    public void  now(){
      //第一步：根据XML配置文件生成，spring上下文.从类路径加载
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("beans.xml");
        //第二步，根据bean的ID获取bean
              HolleSpring holleSpring =   (HolleSpring)applicationContext.getBean("helloSpring");
              //第三部使用
        holleSpring.setInfo("你好啊。spring！");
        System.out.println(holleSpring.getInfo());

    }
    /*集合类型属性注入测试*/
@Test
    public void list(){
         ApplicationContext  applicationContext =  new ClassPathXmlApplicationContext("beans1.xml");
         CollectionBean collectionBean =  (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean);
        System.out.println(1);

    }
}
