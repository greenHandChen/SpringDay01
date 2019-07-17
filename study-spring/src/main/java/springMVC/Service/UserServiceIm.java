package springMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springMVC.Entity.User;
import springMVC.Repository.UserRepository;

@Service
public class UserServiceIm implements UserService {

    @Autowired
    private UserRepository userRepository;

    // 注册
    public void signUp(User user) {

        userRepository.createUser(user);

        System.out.println("注册成功");

        user.getAllInfo();

    }
}
