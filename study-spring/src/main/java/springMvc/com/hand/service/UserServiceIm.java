package springMvc.com.hand.service;

import springMvc.com.hand.entity.User;
import springMvc.com.hand.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIm implements UserService {

    @Autowired
    private UserRepository userRepository;

    // 注册
    public boolean signUp(User user) {

        if(userRepository.createUser(user)) {

            System.out.println("注册成功");

            user.getAllInfo();

            return true;
        }

        System.out.println("注册失败");

        return false;

    }
}
