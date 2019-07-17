package springMVC.Repository;

import springMVC.Entity.User;

public interface UserRepository {

    public void createUser(User user);

    public void removeUser(User user);

    public void getUserById(long id);
}
