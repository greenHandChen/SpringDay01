package huanglehao.study.Repository;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcDaoSupport extends DaoSupport {

    private JdbcTemplate jdbcTemplate;

    public JdbcDaoSupport() {
    }

    @Override
    protected void checkDaoConfig() throws IllegalArgumentException {

    }

    public final void setDataSource(DataSource dataSource){
        if(this.jdbcTemplate==null||dataSource!=this.jdbcTemplate.getDataSource()){
            this.jdbcTemplate=this.createJdbcTemplate(dataSource);
          //  this.initTemplateConfig();
            }
    }

    protected JdbcTemplate createJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }


    public final JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }
}
