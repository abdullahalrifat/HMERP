package com.abdullah.EmployeeDatabase;

import com.abdullah.Employee.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by abdullah on 3/21/17.
 */
public class JdbcEmployeeDAO extends JdbcDaoSupport implements EmployeeDAO
{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public JdbcEmployeeDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void insertEmployees(EmployeeBean employeeBeans) {
        String sql="INSERT INTO Employees "+"(Id,Name,Phone,Address,Position) VALUES (?, ?, ?, ?, ?)";

        try
        {
            jdbcTemplate.update(sql,employeeBeans.getId(),employeeBeans.getName(),employeeBeans.getPhone(),employeeBeans.getAddress(),employeeBeans.getPosition());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<EmployeeBean> ListOfEmployees() {
        String sql="SELECT * FROM Employees ";
        List<EmployeeBean >listEmployees=jdbcTemplate.query(sql, new RowMapper<EmployeeBean >() {
            @Override
            public EmployeeBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
                EmployeeBean  employeeBean=new EmployeeBean ();
                employeeBean.setId(resultSet.getInt("Id"));
                employeeBean.setName(resultSet.getString("Name"));
                employeeBean.setPhone(resultSet.getString("Phone"));
                employeeBean.setAddress(resultSet.getString("Address"));
                employeeBean.setPosition(resultSet.getString("Position"));
                return  employeeBean;
            }
        });
        return listEmployees;
    }
}
