package com.hand.handuserdetail;

import com.hand.handuserdetail.userdetail.entity.UserDetail;
import com.hand.handuserdetail.userdetail.service.IUserDetailService;
import com.hand.handuserdetail.userdetail.service.impl.UserDetailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HandUserDetailApplicationTests {

    @Test
    public void contextLoads() {
        IUserDetailService userDetailService = new UserDetailServiceImpl();
        UserDetail userDetail = userDetailService.findUserDetailById(1L);
        System.out.println(userDetail.toString());
    }

}
