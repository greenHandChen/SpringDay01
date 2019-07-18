package huanglehao.study.po;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 16:05 2019/7/18
 */
public class UserQueryVo {
    private User user;

    private List<Integer> idList;

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
