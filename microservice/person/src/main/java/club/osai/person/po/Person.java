package club.osai.person.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: Person.java
 * @Version: 1.0
 * @Date: 2019/7/25
 * @Description:
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person implements Serializable {
    private static final Long serialVersionUID = 2L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long age;
}
