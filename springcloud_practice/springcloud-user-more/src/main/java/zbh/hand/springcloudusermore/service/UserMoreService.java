package zbh.hand.springcloudusermore.service;

import entity.UserMore;
import org.springframework.stereotype.Service;
import zbh.hand.springcloudusermore.dao.UserMoreMapper;

import javax.annotation.Resource;

/**
 * @author: wuhui
 * @time: 2019/7/26 11:32
 * @desc:
 */
@Service
public class UserMoreService {
    @Resource
    UserMoreMapper mapper;

    public UserMore selectUserMoreById(Integer id){
        return mapper.selectById(id);
    }
    public void addUserMore(UserMore usermore){
        mapper.insert(usermore);
    }
    public void deleteUserMoreById(Integer id){
        mapper.deleteById(id);
    }
    public void updateUserMore(UserMore usermore){
        mapper.updateById(usermore);
    }
}
