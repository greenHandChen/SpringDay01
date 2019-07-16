package springMvc.com.hand.repository;

import springMvc.com.hand.entity.User;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


@Repository
public class UserRepositoryIm implements UserRepository {

    // 保存用户账号信息
    private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();

    public boolean createUser(User user) {

        // 用户已创建
        if(user.getId() != null)  {

            System.out.println("用户已存在，创建失败");

            return false;
        }

        // 用户未创建
        userMap.put(user.getId(), user);

        System.out.println("用户创建成功");

        return  true;

    }

    public User getUserById(Long id) {

        return userMap.get(id);

    }

}
