package springMvc.com.hand.repository;

import springMvc.com.hand.entity.User;

public interface UserRepository {

    // 创建账号
    public boolean createUser(User user);

    // 获取账号
    public User getUserById(Long id);

}
