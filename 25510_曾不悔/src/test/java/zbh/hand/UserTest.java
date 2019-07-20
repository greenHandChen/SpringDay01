package zbh.hand;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zbh.hand.mappers.UserMapper;
import zbh.hand.pojo.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/18 10:03
 * @desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTest {
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @Autowired
    UserMapper mapper;
    @Test
    public void testSelect(){
        User user = mapper.selectById(1);
        System.out.println(user);
    }
    @Test
    public void testSelectList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(30);
        List<User> userList = mapper.selectBatchIds(list);
        userList.forEach(System.out::println);
    }
    @Test
    public void testSelectCondition(){
        IPage<User> list= mapper.selectPage(new Page<User>(1,3),
                new QueryWrapper<User>()
                        .like("address", "成都")
                        .or()
                        .le("birthday", "2000-01-01")
        );
        list.getRecords().forEach(System.out::println);
    }
    @Test
    public void testSelectCondition2(){

    }
    @Test
    public void testInsert() throws ParseException {
        User user = new User();
        user.setUsername("zbhzbh");
        user.setAddress("芜湖");
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
        user.setBirthday(new java.sql.Date(date.getTime()));
        user.setSex(1);
        mapper.insert(user);
        System.out.println("done");
    }
    @Test
    public void testUpdate() throws ParseException {
        User user = new User();
        user.setId(30);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
        user.setBirthday(new java.sql.Date(date.getTime()));
        mapper.updateById(user);
        /*mapper.update(user, null);//条件更新*/
        System.out.println("done");
    }
    @Test
    public void testUpdateCondition() throws ParseException {
        User user = new User();
        user.setId(30);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01");
        user.setBirthday(new java.sql.Date(date.getTime()));

        mapper.update(user, new UpdateWrapper<User>().like("username", "zbh"));//条件更新
        System.out.println("done");
    }
    @Test
    public void testDelete(){
        //mapper.deleteById(26);
        mapper.delete(new UpdateWrapper<User>()
                .in("username", Arrays.asList("tt","dd","ww")));
        System.out.println("done");
    }



}
