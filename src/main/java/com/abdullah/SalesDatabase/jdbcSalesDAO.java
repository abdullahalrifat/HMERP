package com.abdullah.SalesDatabase;

import com.abdullah.Sales.SalesListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by abdullah on 6/11/17.
 */
public class jdbcSalesDAO extends JdbcDaoSupport implements SalesDAO
{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public jdbcSalesDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insertSales(SalesListBean salesListBean) {
        String sql="INSERT INTO Sale "+"(Id,BillNo,Date,Product,Price,Customer,Quantity,Total,Tax,Net,PayMode) VALUES (?, ?, ?, ?,?,?,?,?,?,?,?)";

        try
        {
            jdbcTemplate.update(sql,salesListBean.getId(),salesListBean.getBillNo(),salesListBean.getDate(),salesListBean.getProduct(),salesListBean.getPrice(),salesListBean.getCustomer(),salesListBean.getQuantity(),salesListBean.getTotal(),salesListBean.getTax(),salesListBean.getNet(),salesListBean.getPayMode());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SalesListBean> ListOfSales() {
        String sql="SELECT * FROM Sale ";
        List<SalesListBean >listSales=jdbcTemplate.query(sql, new RowMapper<SalesListBean >() {
            @Override
            public SalesListBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
                SalesListBean  salesListBean=new SalesListBean ();
                salesListBean.setId(resultSet.getInt("Id"));
                salesListBean.setBillNo(resultSet.getInt("BillNo"));
                salesListBean.setDate(resultSet.getString("Date"));
                salesListBean.setProduct(resultSet.getString("Product"));
                salesListBean.setPrice(resultSet.getInt("Price"));
                salesListBean.setCustomer(resultSet.getString("Customer"));
                salesListBean.setQuantity(resultSet.getInt("Quantity"));
                salesListBean.setTotal(resultSet.getInt("Total"));
                salesListBean.setTax(resultSet.getDouble("Tax"));
                salesListBean.setNet(resultSet.getDouble("Net"));
                salesListBean.setPayMode(resultSet.getString("PayMode"));

                return salesListBean;
            }
        });
        return listSales;
    }

    @Override
    public void updateSales(SalesListBean salesListBean) {
        String sql = "UPDATE Sale set BillNo = ?, Date = ?, Product = ?, Price = ?, Customer = ?, Quantity = ?, Total = ?, Tax = ?, Net = ?, PayMode = ? where Id = ?";
        System.out.println(salesListBean.getBillNo());
        jdbcTemplate.update(sql, salesListBean.getBillNo(), salesListBean.getDate(), salesListBean.getProduct(), salesListBean.getPrice(), salesListBean.getCustomer(), salesListBean.getQuantity(), salesListBean.getTotal(), salesListBean.getTax(), salesListBean.getNet(), salesListBean.getPayMode(),salesListBean.getId());
    }

    @Override
    public void DeleteSales(int userid) {
        String sql ="DELETE FROM Sale Where Id = ?";
        jdbcTemplate.update(sql,userid);
    }
}
