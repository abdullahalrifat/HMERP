package com.abdullah.InventoryDataBase;

import com.abdullah.Inventory.InventoryListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by abdullah on 7/30/17.
 */
public class JdbcInventoryDAO extends JdbcDaoSupport implements InventoryDAO
{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public JdbcInventoryDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void insertInventory(InventoryListBean inventoryListBean) {
        String sql="INSERT INTO Inventory "+"(Id,Name,CostPrice,CostTax,SalesPrice,SalesTax,Quantity) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try
        {
            jdbcTemplate.update(sql,inventoryListBean.getId(),inventoryListBean.getName(),inventoryListBean.getCostPrice(),inventoryListBean.getCostTax(),inventoryListBean.getSalesPrice(),inventoryListBean.getSalesTax(),inventoryListBean.getQuantity());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<InventoryListBean> ListOfInventory() {
        String sql="SELECT * FROM Inventory ";
        List<InventoryListBean >listInventory=jdbcTemplate.query(sql, new RowMapper<InventoryListBean >() {
            @Override
            public InventoryListBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
               InventoryListBean  inventoryBean=new InventoryListBean ();
               inventoryBean.setId(resultSet.getInt("Id"));
                inventoryBean.setName(resultSet.getString("Name"));
                inventoryBean.setCostPrice(resultSet.getDouble("CostPrice"));
                inventoryBean.setCostTax(resultSet.getDouble("CostTax"));
                inventoryBean.setSalesPrice(resultSet.getDouble("SalesPrice"));
                inventoryBean.setSalesTax(resultSet.getDouble("SalesTax"));
                inventoryBean.setQuantity(resultSet.getInt("Quantity"));

                return  inventoryBean;
            }
        });
        return listInventory;
    }

    @Override
    public void updateInventory(InventoryListBean inventoryListBean) {
        String sql = "UPDATE Inventory set Name = ?, CostPrice = ?, CostTax = ?, SalesPrice = ?, SalesTax = ?, Quantity = ? where Id = ?";
        jdbcTemplate.update(sql,inventoryListBean.getName(),inventoryListBean.getCostPrice(),inventoryListBean.getCostTax(),inventoryListBean.getSalesPrice(),inventoryListBean.getSalesTax(),inventoryListBean.getQuantity(),inventoryListBean.getId());
    }

    @Override
    public void DeleteInventory(int userid) {
        String sql ="DELETE FROM Inventory Where Id = ?";
        jdbcTemplate.update(sql,userid);
    }
}
