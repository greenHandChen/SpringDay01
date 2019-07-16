package SpringStudy.Annotion.Service.Impl;

import SpringStudy.Annotion.Dao.PersonMapper;
import SpringStudy.Annotion.Enity.Person;
import SpringStudy.Annotion.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/16 16:09
 * @Version: V1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    PersonMapper personMapper;

    public int addUser(Person person) {
        if (personMapper.addUser(person) == 1) {
            return 1;
        }else {
            return 0;
        }
    }
}
