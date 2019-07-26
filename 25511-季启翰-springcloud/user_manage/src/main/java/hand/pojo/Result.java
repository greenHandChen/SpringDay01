package hand.pojo;

import lombok.Data;

/**
 * @Auther: 几米
 * @Date: 2019/5/4 20:11
 * @Description: Result
 */
@Data
public class Result {
    private Boolean flag;
    private Integer code;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(Boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(Boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}