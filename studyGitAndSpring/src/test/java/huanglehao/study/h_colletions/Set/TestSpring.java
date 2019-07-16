package huanglehao.study.h_colletions.Set;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {


    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\h_colletions\\Set\\beans.xml");
        CollectionBean collectionBean =(CollectionBean)applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.getSet());

    }


}
