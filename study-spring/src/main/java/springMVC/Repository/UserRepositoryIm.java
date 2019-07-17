package springMVC.Repository;

import org.springframework.stereotype.Repository;
import springMVC.Entity.User;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryIm implements UserRepository {

    // 模拟数据库
    private static Map<Long, User> userMap = new HashMap<Long, User>();

    public void createUser(User user) {

        userMap.put(user.getId(), user);

    }

    public void removeUser(User user) {

    }

    public void getUserById(long id) {


    }
}
