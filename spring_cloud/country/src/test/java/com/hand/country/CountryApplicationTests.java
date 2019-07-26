package com.hand.country;

import com.hand.country.entity.Country;
import com.hand.country.mapper.CountryMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    CountryMapper countryMapper;
    @Test
    public void testCountryMapper(){
        List<Country> list = countryMapper.findAll();
        Assert.assertTrue(list.size()>0);
    }
}
