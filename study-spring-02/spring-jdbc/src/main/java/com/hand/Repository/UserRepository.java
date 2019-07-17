package com.hand.Repository;

import com.hand.Entity.User;

public interface UserRepository {

    // 创建用户
    public void createUser(User user);

    // 删除用户
    public void removeUser(User user);

}
