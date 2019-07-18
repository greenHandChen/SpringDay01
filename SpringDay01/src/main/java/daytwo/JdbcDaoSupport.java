package daytwo;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public abstract class JdbcDaoSupport extends DaoSupport {
    private JdbcTemplate jdbcTemplate;
    public JdbcDaoSupport(){

    }
    public final void setDataSource(DataSource dataSource){
        if(this.jdbcTemplate==null||dataSource!=this.jdbcTemplate.getDataSource()){
            this.jdbcTemplate=this.createJdbcTemplate(dataSource);
            this.initTemplateConfig();
        }
    }
}
