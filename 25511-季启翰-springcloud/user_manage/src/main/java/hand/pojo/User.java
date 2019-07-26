package hand.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Auther: 几米
 * @Date: 2019/7/25 19:01
 * @Description: User
 */
@Data
@Table(name = "todo_user")
@JsonInclude(JsonInclude.Include.NON_NULL)//实体类与json互转的时候 属性值为null的不参与序列化
public class User implements Serializable {
    @Id
    private Long id;
    private String employeeName;
    private String employeeNumber;
    private String email;

}