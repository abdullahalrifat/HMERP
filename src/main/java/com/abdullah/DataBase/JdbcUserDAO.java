package com.abdullah.DataBase;

import com.abdullah.Login.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by abdullah on 2/6/17.
 */

public class JdbcUserDAO extends JdbcDaoSupport implements UserDAO
{

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public JdbcUserDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(LoginBean loginBean) {
        String sql="INSERT INTO Login "+"(Id,FullName,UserName,PassWord) VALUES (?, ?, ?, ?)";

        try
        {
            jdbcTemplate.update(sql,loginBean.getId(),loginBean.getFullname(),loginBean.getUsername(),loginBean.getPassword());

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<LoginBean> UserVarifier()
    {

        String sql="SELECT * FROM Login ";
        List<LoginBean>listUser=jdbcTemplate.query(sql, new RowMapper<LoginBean>() {
            @Override
            public LoginBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
                LoginBean loginBean=new LoginBean();
                loginBean.setId(resultSet.getInt("Id"));
                loginBean.setFullname(resultSet.getString("FullName"));
                loginBean.setUsername(resultSet.getString("UserName"));
                loginBean.setPassword(resultSet.getString("PassWord"));
                return loginBean;
            }
        });
        return listUser;

    }
}
