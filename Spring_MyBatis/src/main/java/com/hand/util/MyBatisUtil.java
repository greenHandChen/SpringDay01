package com.hand.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSession工具类
 * @author Fandelu
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 获取SqlSession对象
     *
     * @return
     */
    public static SqlSession getSqlSession() {
        if (sqlSessionFactory == null) {
            try {
                InputStream inputStream = Resources.getResourceAsStream("config/mybatis.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                return sqlSessionFactory.openSession();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return sqlSessionFactory.openSession();
        }
        return null;
    }
}
