package zbh.handspring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import zbh.handspring.pojo.User;

import javax.sql.DataSource;
import java.text.Format;
import java.util.List;

/**
 * @author: wuhui
 * @time: 2019/7/17 9:18
 * @desc:
 */
@Repository
public class UserDao extends JdbcDaoSupport {
    @Qualifier("druidDataSource")
    @Autowired
    DataSource dataSource;

    @Autowired
   public void setDataSource(){
       super.setDataSource(dataSource);
   }

    public  void addUser(User user){
       String sql="insert into sys_user values(null,?,?)";
       getJdbcTemplate().update(sql,user.getUsername(),user.getPassword());
   }
    public  User getUserById(Integer id){
        String sql="select * from sys_user u where id=?";
        Object objects[]={id};
        return (User) getJdbcTemplate().queryForObject(sql,new User(),objects);
    }
    public List<User> getUserByIds(Integer[] ids){
        String sql="select * from sys_user u where id in (";
        for (int i = 0; i < ids.length; i++) {
            if (i==ids.length-1){
                sql+="?";
            }
            else
              sql+="?,";

        }
        sql=sql+");";

        return  getJdbcTemplate().query(sql, ids, new BeanPropertyRowMapper<User>(User.class));
    }

}
