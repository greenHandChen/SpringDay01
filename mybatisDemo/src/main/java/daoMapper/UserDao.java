package daoMapper;

import domain.User;

public interface UserDao {
    User findUserById(Integer id);
}
