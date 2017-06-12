package com.abdullah.PurchaseDatabase;

import com.abdullah.Purchase.PurchaseListBean;
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
public class jdbcPurchaseDAO extends JdbcDaoSupport implements PurchaseDAO
{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public jdbcPurchaseDAO(DataSource dataSource)
    {
        super();
        setDataSource(dataSource);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void insertPurchase(PurchaseListBean purchaseListBean) {
        String sql="INSERT INTO Purchase "+"(Id,Date,BillNo,Product,Supplier,Tax,Quantity,Rate,TotalAmount,Net,Paymode) VALUES (?, ?, ?, ?,?,?,?,?,?,?,?)";

        try
        {
            jdbcTemplate.update(sql,purchaseListBean.getId(),purchaseListBean.getDate(),purchaseListBean.getBillNo(),purchaseListBean.getProduct(),purchaseListBean.getSupplier(),purchaseListBean.getTax(),purchaseListBean.getQuantity(),purchaseListBean.getRate(),purchaseListBean.getTotalAmount(),purchaseListBean.getNet(),purchaseListBean.getPayMode());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PurchaseListBean> ListOfPurchase() {
        String sql="SELECT * FROM Purchase ";
        List<PurchaseListBean >listPurchase=jdbcTemplate.query(sql, new RowMapper<PurchaseListBean >() {
            @Override
            public PurchaseListBean mapRow(ResultSet resultSet, int i) throws SQLException
            {
                PurchaseListBean  purchaseListBean=new PurchaseListBean ();
                purchaseListBean.setId(resultSet.getInt("Id"));
                purchaseListBean.setDate(resultSet.getString("Date"));
                purchaseListBean.setBillNo(resultSet.getInt("BillNo"));
                purchaseListBean.setProduct(resultSet.getString("Product"));
                purchaseListBean.setSupplier(resultSet.getString("Supplier"));
                purchaseListBean.setTax(resultSet.getDouble("Tax"));
                purchaseListBean.setQuantity(resultSet.getInt("Quantity"));
                purchaseListBean.setRate(resultSet.getInt("Rate"));
                purchaseListBean.setTotalAmount(resultSet.getInt("TotalAmount"));
                purchaseListBean.setNet(resultSet.getDouble("Net"));
                purchaseListBean.setPayMode(resultSet.getString("Paymode"));

                return purchaseListBean;
            }
        });
        return listPurchase;
    }

    @Override
    public void updatePurchase(PurchaseListBean purchaseListBean) {
        //System.out.println(purchaseListBean.getSupplier());
        String sql = "UPDATE Purchase set Date = ?, BillNo = ?, Product = ?, Supplier = ?, Tax = ?, Quantity = ?, Rate = ?, TotalAmount = ?, Net = ?, Paymode = ? where Id = ?";
        jdbcTemplate.update(sql,purchaseListBean.getDate(),purchaseListBean.getBillNo(),purchaseListBean.getProduct(),purchaseListBean.getSupplier(),purchaseListBean.getTax(),purchaseListBean.getQuantity(),purchaseListBean.getRate(),purchaseListBean.getTotalAmount(),purchaseListBean.getNet(),purchaseListBean.getPayMode(),purchaseListBean.getId());
    }

    @Override
    public void DeletePrurchase(int userid) {
        String sql ="DELETE FROM Purchase Where Id = ?";
        jdbcTemplate.update(sql,userid);
    }
}
