package huanglehao.study;

import huanglehao.study.Entity.User;
import huanglehao.study.Repository.UserDao;
import huanglehao.study.Repository.UserWithoutJDBCTemplateBeanDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBCDaoSupport {



    //测试jdbcDaoSupport
    @org.junit.Test
    public void testJdbcDaoSupport(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansWithoutJDBCTemplateBean.xml");
        UserWithoutJDBCTemplateBeanDao userWithoutJDBCTemplateBeanDao=applicationContext.getBean("userWithoutJDBCTemplate",UserWithoutJDBCTemplateBeanDao.class);
        User user=new User();
        user.setId(10);
        user.setUsername("2019/07/17");
        user.setPassword("11:47");
        userWithoutJDBCTemplateBeanDao.update(user);
    }
    @org.junit.Test
    public void testJdbcDaoSupportInsert(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansWithoutJDBCTemplateBean.xml");
        UserWithoutJDBCTemplateBeanDao userWithoutJDBCTemplateBeanDao=applicationContext.getBean("userWithoutJDBCTemplate",UserWithoutJDBCTemplateBeanDao.class);
        userWithoutJDBCTemplateBeanDao.insert();
    }
    @org.junit.Test
    public void testJdbcDaoSupportDelete(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansWithoutJDBCTemplateBean.xml");
        UserWithoutJDBCTemplateBeanDao userWithoutJDBCTemplateBeanDao=applicationContext.getBean("userWithoutJDBCTemplate",UserWithoutJDBCTemplateBeanDao.class);
        userWithoutJDBCTemplateBeanDao.delete();
    }

    @org.junit.Test
    public void testCount(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansWithoutJDBCTemplateBean.xml");
        UserWithoutJDBCTemplateBeanDao userWithoutJDBCTemplateBeanDao=applicationContext.getBean("userWithoutJDBCTemplate",UserWithoutJDBCTemplateBeanDao.class);
        userWithoutJDBCTemplateBeanDao.count();
    }
    @org.junit.Test
    public void testQueryForObject(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beansWithoutJDBCTemplateBean.xml");
        UserWithoutJDBCTemplateBeanDao userWithoutJDBCTemplateBeanDao=applicationContext.getBean("userWithoutJDBCTemplate",UserWithoutJDBCTemplateBeanDao.class);
        userWithoutJDBCTemplateBeanDao.queryForObject();
    }


}
