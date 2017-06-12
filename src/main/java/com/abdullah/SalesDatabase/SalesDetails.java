package com.abdullah.SalesDatabase;

import com.abdullah.Sales.SalesListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/11/17.
 */
@Component
public class SalesDetails
{
    @Autowired
    private SalesDAO salesDAO;
    public List<SalesListBean> getListSales()
    {

        List<SalesListBean> listSales=salesDAO.ListOfSales();
        return listSales;
    }
    public void registerSales(int billNo, String date, String product, int price, String customer, int quantity, int total, Double tax, Double net, String payMode) {
        List<SalesListBean> listSales=salesDAO.ListOfSales();
        int size=listSales.size();
        SalesListBean salesListBean=new SalesListBean(size+1,billNo,date,product,price,customer,quantity,total,tax,net,payMode);
        salesDAO.insertSales(salesListBean);
    }
    public void updateSales(SalesListBean salesListBean) {
        salesDAO.updateSales(salesListBean);
    }
    public void DeleteSales(int userid) {
        salesDAO.DeleteSales(userid);
    }
}