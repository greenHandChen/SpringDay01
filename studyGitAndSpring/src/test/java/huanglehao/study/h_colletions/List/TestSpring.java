package huanglehao.study.h_colletions.List;


import huanglehao.study.f_constructor.arg.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {


    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\办公软件\\IDEAWorkSpace\\studyGitAndSpring\\src\\test\\java\\huanglehao\\study\\h_colletions\\List\\beans.xml");
       CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.getArray());
        System.out.println(collectionBean.getList());
    }


}
