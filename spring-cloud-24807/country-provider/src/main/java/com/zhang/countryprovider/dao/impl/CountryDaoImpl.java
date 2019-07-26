package com.zhang.countryprovider.dao.impl;

import com.zhang.countryprovider.dao.CountryDao;
import com.zhang.countryprovider.pojo.Country;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:CountryDaoImpl
 * Author:ZhangChunjia
 * Date:2019/7/26 11:37
 */
@Repository
public class CountryDaoImpl extends SqlSessionDaoSupport implements CountryDao {

    @Resource
    public void setSqlsessionFactory(SqlSessionFactory sqlsessionFactory){
        super.setSqlSessionFactory(sqlsessionFactory);
    }

    @Override
    public Country findCountryById(Integer id) {
        return this.getSqlSession().selectOne("findCountryById");
    }

    @Override
    public void addCountry(Country country) {
        this.getSqlSession().update("addCountry");
    }

    @Override
    public void deleteCountry(Country country) {
        this.getSqlSession().update("deleteCountry");
    }

    @Override
    public void updateCountry(Country country) {
        this.getSqlSession().update("updateCountry");
    }

    @Override
    public List<Country> showCountry() {
        return this.getSqlSession().selectList("showCountry");
    }
}
