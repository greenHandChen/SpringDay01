package com.xyh.Transaction.Configuration;

import com.xyh.Transaction.Dao.AccountDao;
import com.xyh.Transaction.Entity.Account;
import com.xyh.Transaction.Service.AccountService;
import com.xyh.Transaction.Service.AccountServiceInter;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;
import org.springframework.transaction.support.TransactionTemplate;
import sun.instrument.TransformerManager;

import javax.sql.DataSource;
import java.util.List;
import java.util.Properties;

@Configuration
public class BeanConfiguration {

    @Bean
    public DataSource dataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/java_web?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT&useSSL=true");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");
        return hikariDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Autowired DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    /**
     * 事务管理器
     * @param dataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(@Autowired DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean
    public AccountService accountService(@Autowired DataSource dataSource){
        AccountService accountService=new AccountService();
        AccountDao accountDao=new AccountDao(dataSource);
        accountService.setAccountDao(accountDao);
        return accountService;
    }

    @Bean
    public TransactionProxyFactoryBean accountServiceProxy(@Autowired DataSourceTransactionManager dataSourceTransactionManager,
                                                           @Autowired AccountService accountService){
        TransactionProxyFactoryBean transactionProxyFactoryBean=new TransactionProxyFactoryBean();

        transactionProxyFactoryBean.setTransactionManager(dataSourceTransactionManager);

        transactionProxyFactoryBean.setTarget(accountService);

        transactionProxyFactoryBean.setProxyInterfaces(new Class[]{AccountServiceInter.class});

        Properties properties=new Properties();
        properties.setProperty("transaction","PROPAGATION_REQUIRED,ISOLATION_DEFAULT");
        transactionProxyFactoryBean.setTransactionAttributes(properties);
        return transactionProxyFactoryBean;
    }

}
