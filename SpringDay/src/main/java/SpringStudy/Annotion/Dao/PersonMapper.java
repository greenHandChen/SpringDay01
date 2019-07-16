package SpringStudy.Annotion.Dao;

import SpringStudy.Annotion.Enity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description: 用户Mapper
 * @Author: TanLinQuan
 * @Date: 2019/7/16 16:03
 * @Version: V1.0
 **/
public interface PersonMapper {

    public int addUser(Person person);

}
