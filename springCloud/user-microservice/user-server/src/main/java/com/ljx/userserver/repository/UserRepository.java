package com.ljx.userserver.repository;

import com.ljx.userserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 10:19
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>{

    /**
     *功能描述  根据id获取用户信息
     * @author LJX
     * @date 2019/7/26  10:51
     * @param idList
     * @return java.util.List<com.ljx.userserver.domain.User>
     */
    List<User> findByIdIn(List<Integer> idList);

    /**
     *功能描述   查询所有用户
     * @author LJX
     * @date 2019/7/26  10:52
     * @param
     * @return java.util.List<com.ljx.userserver.domain.User>
     */
    @Override
    List<User> findAll();

    /**
     *功能描述  根据id删除用户
     * @author LJX
     * @date 2019/7/26  10:55
     * @param integer
     * @return void
     */
    @Override
    void deleteById(Integer integer);

}
