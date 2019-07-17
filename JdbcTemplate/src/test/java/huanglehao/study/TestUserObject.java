package huanglehao.study;

import huanglehao.study.Entity.UserObject;
import huanglehao.study.Repository.UserWithoutJDBCTemplateBeanDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserObject {

    @org.junit.Test
    public void getUserObjectById(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansWithoutJDBCTemplateBean.xml");
        UserWithoutJDBCTemplateBeanDao userWithoutJDBCTemplateBeanDao=applicationContext.getBean("userWithoutJDBCTemplate",UserWithoutJDBCTemplateBeanDao.class);
        UserObject userObject=new UserObject();
        userObject.setId(1);
        System.out.println(userWithoutJDBCTemplateBeanDao.getUserObjectById(userObject));
    }

    @org.junit.Test
    public void getUserObject(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansWithoutJDBCTemplateBean.xml");
        UserWithoutJDBCTemplateBeanDao userWithoutJDBCTemplateBeanDao=applicationContext.getBean("userWithoutJDBCTemplate",UserWithoutJDBCTemplateBeanDao.class);
        System.out.println(userWithoutJDBCTemplateBeanDao.getUserObject());
    }


}
