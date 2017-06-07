package com.abdullah.Controller;

import com.abdullah.CustomerListDataBase.CustomerDetails;
import com.abdullah.CustomersList.CustomersListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
/**
 * Created by abdullah on 6/8/17.
 */
@Controller
public class AddCustomers
{
    @Autowired
    CustomerDetails cd;
    @RequestMapping(value="/add-customers")
    public ModelAndView processPersonRegister(@ModelAttribute CustomersListBean customersListBean)
    {

        ModelAndView model= null;
        try
        {
            if(customersListBean.getName()!=""&&customersListBean.getMobile()!=""&& customersListBean.getAddress()!=""&&customersListBean.getCountry()!="")
            {
                cd.registerCustomers(customersListBean.getName(),customersListBean.getMobile(),customersListBean.getEmail(),customersListBean.getAddress(),customersListBean.getPinCode(),customersListBean.getCountry(),customersListBean.getCity(),customersListBean.getBankDetails());
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddCustomers");
            }



        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}
