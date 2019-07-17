package com.xyh.Transaction.Configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

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

    /**
     * 事务模板
     * @param dataSourceTransactionManager
     * @return
     */
    @Bean
    public TransactionTemplate transactionTemplate(@Autowired DataSourceTransactionManager dataSourceTransactionManager){
        TransactionTemplate transactionTemplate=new TransactionTemplate();
        transactionTemplate.setTransactionManager(dataSourceTransactionManager);
        return transactionTemplate;
    }

}
