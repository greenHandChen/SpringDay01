package hand.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Auther: 几米
 * @Date: 2019/7/25 19:03
 * @Description: Task
 */
@Data
@Table(name = "todo_task")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task implements Serializable {
    @Id
    private Long id;
    private Long employeeId;
    private String state;
    private String taskNumber;
    private String taskDescription;
}