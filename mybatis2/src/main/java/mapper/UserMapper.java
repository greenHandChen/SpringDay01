package mapper;


import domain.User;

public interface UserMapper {
    User findUserById(Integer id);
}
