package com.abdullah.CustomerListDataBase;

import com.abdullah.CustomersList.CustomersListBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/8/17.
 */
@Component
public interface CustomerDAO
{
    public void insertCustomers(CustomersListBean customersListBean);
    public List<CustomersListBean> ListOfCustomers();
}