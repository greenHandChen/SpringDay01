package com.zhang.countryprovider.test;

import com.zhang.countryprovider.controller.CountryController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName:Test1
 * Author:ZhangChunjia
 * Date:2019/7/26 15:47
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

    @Autowired
    private CountryController countryController;

    @Test
    public void testDemo1() {
        System.out.println(countryController.countryFeign(1));
    }
}
