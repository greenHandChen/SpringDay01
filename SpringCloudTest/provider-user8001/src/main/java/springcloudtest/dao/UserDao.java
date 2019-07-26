package springcloudtest.dao;

import org.apache.ibatis.annotations.Mapper;
import springcloudtest.entities.User;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> listUsers();

    User getUserById(int id);
}
