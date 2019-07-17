package com.hand;

import com.hand.Entity.User;
import com.hand.Repository.UserRepository;
import com.hand.Repository.UserRepositoryImJdbcDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //
        UserRepository userRepository = (UserRepository)ctx.getBean("userRepository", UserRepository.class);

        // JdbcDaoSupport
        UserRepositoryImJdbcDaoSupport userRepositoryImJdbcDaoSupport = (UserRepositoryImJdbcDaoSupport)ctx.getBean("userRepositoryImJdbcDaoSupport", UserRepositoryImJdbcDaoSupport.class);

        User user = (User)ctx.getBean("user", User.class);

        user.setUsername("25573");
        user.setPassword("25573");

        userRepository.createUser(user);
        userRepositoryImJdbcDaoSupport.createUser(user);


    }

}
