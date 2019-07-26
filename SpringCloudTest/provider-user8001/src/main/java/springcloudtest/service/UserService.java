package springcloudtest.service;

import springcloudtest.entities.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();

    User getUserById(int id);
}
