package club.osai.other.dao;

import club.osai.other.po.Other;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: OtherDao.java
 * @Version: 1.0
 * @Date: 2019/7/26
 * @Description:
 */

public interface OtherDao extends JpaRepository<Other, Long> {
    Optional<Other> findByUserId(Long userId);

}
