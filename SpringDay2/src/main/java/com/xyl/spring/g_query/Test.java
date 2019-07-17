
package com.xyl.spring.g_query;

/**
 * @Author xiongyilin
 * @Date 2019/7/17 11:11
 * @Version 1.0
 */

public class Test {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(
                "C:\\Users\\75741\\IdeaProjects\\SpringDay01\\SpringDay2\\src\\main\\java\\com\\xyl\\spring\\g_query\\applicationContext.xml");

        UserDao userDao= (UserDao) applicationContext.getBean("userDao");
        System.out.println("用户集合："+userDao.getUsers());
    }


}