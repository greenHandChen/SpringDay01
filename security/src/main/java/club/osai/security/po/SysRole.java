package club.osai.security.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: SysRole.java
 * @Version: 1.0
 * @Date: 2019/7/24
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class SysRole {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
