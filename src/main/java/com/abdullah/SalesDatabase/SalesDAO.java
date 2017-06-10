package com.abdullah.SalesDatabase;

import com.abdullah.Sales.SalesListBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/11/17.
 */
@Component
public interface SalesDAO
{
    public void insertSales(SalesListBean salesListBean);
    public List<SalesListBean> ListOfSales();
    public void updateSales(SalesListBean salesListBean);
    public void DeleteSales(int userid);
}