package club.osai.person.dao;

import club.osai.person.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: PersonRepository.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByNameLike(String name);
}
