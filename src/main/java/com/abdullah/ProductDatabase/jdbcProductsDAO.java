package com.abdullah.ProductDatabase;

import com.abdullah.Product.ProductListBean;
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
public class jdbcProductsDAO extends JdbcDaoSupport implements ProductsDAO
{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public jdbcProductsDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void insertProducts(ProductListBean productsListBean) {
        String sql="INSERT INTO Products "+"(Id,Name,Price,Tax) VALUES (?, ?, ?, ?)";

        try
        {
            jdbcTemplate.update(sql,productsListBean.getId(),productsListBean.getName(),productsListBean.getPrice(),productsListBean.getTax());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ProductListBean> ListOfProducts() {
        String sql="SELECT * FROM Products ";
        List<ProductListBean >listProducts=jdbcTemplate.query(sql, new RowMapper<ProductListBean >() {
            @Override
            public ProductListBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
                ProductListBean  productBean=new ProductListBean ();
                productBean.setId(resultSet.getInt("Id"));
                productBean.setName(resultSet.getString("Name"));
                productBean.setPrice(resultSet.getInt("Price"));
                productBean.setTax(resultSet.getDouble("Tax"));

                return productBean;
            }
        });
        return listProducts;
    }
}
