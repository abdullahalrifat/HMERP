package com.abdullah.CustomerListDataBase;

import com.abdullah.Customers.CustomersListBean;
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
    public void updateCustomer(CustomersListBean customersListBean);
    public void DeleteCustomer(int userid);
}