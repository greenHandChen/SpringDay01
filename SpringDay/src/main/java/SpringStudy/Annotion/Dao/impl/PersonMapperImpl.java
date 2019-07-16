package SpringStudy.Annotion.Dao.impl;

import SpringStudy.Annotion.Dao.PersonMapper;
import SpringStudy.Annotion.Enity.Person;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/16 17:10
 * @Version: V1.0
 **/
@Repository("personMapper")
public class PersonMapperImpl implements PersonMapper {

    public int addUser(Person person) {
        System.out.println("插入成功！用户信息如下：");
        System.out.println(person.toString());
        return 1;
    }
}
