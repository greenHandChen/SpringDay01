package club.osai.ui.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person implements Serializable {
    private static final Long serialVersionUID = 2L;
    private Long id;
    private String name;
    private Long age;
}
