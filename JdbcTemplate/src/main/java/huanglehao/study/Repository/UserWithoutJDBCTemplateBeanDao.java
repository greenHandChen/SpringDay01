package huanglehao.study.Repository;

import huanglehao.study.Entity.User;
import huanglehao.study.Entity.UserObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


public class UserWithoutJDBCTemplateBeanDao extends  JdbcDaoSupport{


    public void update(User user){
        String updateSql="update sys_user u set u.username = ?,u.password = ? where u.id =?";
        getJdbcTemplate().update(updateSql,user.getUsername(),user.getPassword(),user.getId());
    }

    public void insert(){
        String sql="insert into sys_user(username,password) values(?,?);";
        getJdbcTemplate().update(sql,"lili","1314");
    }

    public void delete(){
        String sql="delete from sys_user where id = ?;";
        getJdbcTemplate().update(sql,"3");
    }

    public void count(){
        String sql="select count(*) from sys_user";
        Integer c=getJdbcTemplate().queryForObject(sql,null,Integer.class);
        System.out.println(c);
    }

    public void queryForObject(){
        String sql="select username from sys_user u where u.id =?";
        Object[]objects={1};
        String userName=getJdbcTemplate().queryForObject(sql,objects,String.class);
        System.out.println(userName);
    }

    public UserObject getUserObjectById(UserObject userObject){
        String queryUserSql="select * from sys_user u where u.id=?";
        Object[] objects={userObject.getId()};
        return getJdbcTemplate().queryForObject(queryUserSql,new UserObject(),objects);

    }

    public List<UserObject> getUserObject(){
        String queryUserObjectSql="select * from sys_user";
        return getJdbcTemplate().query(queryUserObjectSql,new UserObject());

    }
}
