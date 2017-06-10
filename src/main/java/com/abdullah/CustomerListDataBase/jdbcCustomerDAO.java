package com.abdullah.CustomerListDataBase;

import com.abdullah.CustomersList.CustomersListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by abdullah on 6/8/17.
 */
public class jdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO
{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public jdbcCustomerDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insertCustomers(CustomersListBean customersListBean) {
        String sql="INSERT INTO Customers "+"(Id,Name,Mobile,Email,Address,Pincode,Country,City,BankDetails) VALUES (?, ?, ?, ?, ?,?,?,?,?)";

        try
        {
            jdbcTemplate.update(sql,customersListBean.getId(),customersListBean.getName(),customersListBean.getMobile(),customersListBean.getEmail(),customersListBean.getAddress(),customersListBean.getPinCode(),customersListBean.getCountry(),customersListBean.getCity(),customersListBean.getBankDetails());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<CustomersListBean> ListOfCustomers() {
        String sql="SELECT * FROM Customers ";
        List<CustomersListBean >listCustomers=jdbcTemplate.query(sql, new RowMapper<CustomersListBean >() {
            @Override
            public CustomersListBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
                CustomersListBean  employeeBean=new CustomersListBean ();
                employeeBean.setId(resultSet.getInt("Id"));
                employeeBean.setName(resultSet.getString("Name"));
                employeeBean.setEmail(resultSet.getString("Email"));
                employeeBean.setMobile(resultSet.getString("Mobile"));
                employeeBean.setAddress(resultSet.getString("Address"));
                employeeBean.setPinCode(resultSet.getString("PinCode"));
                employeeBean.setCountry(resultSet.getString("Country"));
                employeeBean.setCity(resultSet.getString("City"));
                employeeBean.setBankDetails(resultSet.getString("BankDetails"));
                return  employeeBean;
            }
        });
        return listCustomers;
    }

    @Override
    public void updateCustomer(CustomersListBean customersListBean) {
        String sql ="UPDATE Customers set Name = ?, Mobile = ?, Email = ?, Address = ?, Pincode = ?, Country = ?, City = ?, BankDetails = ? where Id = ?";
        jdbcTemplate.update(sql,customersListBean.getName(),customersListBean.getMobile(),customersListBean.getEmail(),customersListBean.getAddress(),customersListBean.getPinCode(),customersListBean.getCountry(),customersListBean.getCity(),customersListBean.getBankDetails(),customersListBean.getId());

    }

    @Override
    public void DeleteCustomer(int userid) {
        String sql ="DELETE FROM Customers Where Id = ?";
        jdbcTemplate.update(sql,userid);
    }
}
