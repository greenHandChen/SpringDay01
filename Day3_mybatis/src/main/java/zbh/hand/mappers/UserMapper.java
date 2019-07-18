package zbh.hand.mappers;

        import zbh.hand.pojo.User;

        import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/18 9:44
 * @desc:
 */
public interface UserMapper {
    public User selectUserById(Integer id);
    public List<User> selectUsersByName(String string);
    public void addUser(User u);

}
