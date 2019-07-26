package springcloudtest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloudtest.dao.UserDao;
import springcloudtest.entities.User;
import springcloudtest.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    /**
     * @Description list
     * @Author  ChenWeixong
     * @Date   2019/7/26 17:02
     * @Param
     * @Return
     * @Exception
     * */
    @Override
    public List<User> listUsers() {
        return this.userDao.listUsers();
    }


    /**
     * @Description  getUser
     * @Author  ChenWeixong
     * @Date   2019/7/26 17:02
     * @Param
     * @Return
     * @Exception
     * */
    @Override
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }
}
