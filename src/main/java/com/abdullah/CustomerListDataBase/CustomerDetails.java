package com.abdullah.CustomerListDataBase;

import com.abdullah.CustomersList.CustomersListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/8/17.
 */
@Component
public class CustomerDetails {
    @Autowired
    private CustomerDAO customerDAO;

    public List<CustomersListBean> getListofCustomers() {

        List<CustomersListBean> listUser = customerDAO.ListOfCustomers();
        return listUser;
    }

    public void registerCustomers(String name, String mobile, String email, String address, String pinCode, String country, String city, String bankDetails) {
        List<CustomersListBean> listUser = customerDAO.ListOfCustomers();
        int size = listUser.size();
        CustomersListBean customersListBean = new CustomersListBean(size + 1, name, mobile, email, address, pinCode, country, city, bankDetails);
        customerDAO.insertCustomers(customersListBean);
    }

    public void updateCustomer(CustomersListBean customersListBean) {
        customerDAO.updateCustomer(customersListBean);
    }
    public void DeleteCustomer(int userid) {
        customerDAO.DeleteCustomer(userid);
    }
}
