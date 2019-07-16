package huanglehao.study.h_colletions.Map;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {


    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\h_colletions\\Map\\beans.xml");
        CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("collectionBean");
        //collectionBean.getMap();
    }


}
