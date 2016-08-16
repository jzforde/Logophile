package quiz.app.db;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by jillianforde on 7/29/16.
 */
public class Database{

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void setupDatabase(){
        /*
        jdbcTemplate.execute(createTable);
        jdbcTemplate.execute(createOptionsTable);
        */

    }



}
