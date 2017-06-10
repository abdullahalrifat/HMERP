package com.abdullah.Controller;

import com.abdullah.CustomerListDataBase.CustomerDetails;
import com.abdullah.CustomersList.CustomersListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdullah on 6/10/17.
 */
@Controller
public class AddCustomer {

    @Autowired
    CustomerDetails cd;
    @RequestMapping(value="/add-customer")
    public ModelAndView processProductRegister(@ModelAttribute CustomersListBean customersListBean)
    {

        ModelAndView model= null;
        try
        {
            if(customersListBean.getName()!=""&&customersListBean.getMobile()!=""&& customersListBean.getAddress()!=""&&customersListBean.getCountry()!="")
            {
                //System.out.println(customersListBean.getName());
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


    @RequestMapping(value="/update-customers")
    public ModelAndView processUpdateCustomers(@RequestParam int userId)
    {
        ModelAndView model= null;
        List<CustomersListBean> list=cd.getListofCustomers();
       // System.out.println(userId);
        try
        {
            model = new ModelAndView("UpdateCustomers");
            List<CustomersListBean> l=new ArrayList();
            CustomersListBean clb=list.get(userId-1);
            l.add(clb);
            //checking if reading the databse
            //System.out.println(l.get(0).getName());
            model.addObject("customerlist",l);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        // System.out.println(userId);
        return model;
    }

    @RequestMapping(value="/update-customers-row")
    public ModelAndView processProductUpdateRow(@ModelAttribute CustomersListBean customersListBean)
    {

        ModelAndView model= null;
        try
        {
            if(customersListBean.getName()!=""&&customersListBean.getMobile()!=""&& customersListBean.getAddress()!=""&&customersListBean.getCountry()!="")
            {
                //System.out.println(customersListBean.getName());
                cd.updateCustomer(customersListBean);
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
    @RequestMapping(value="/delete-customers-row")
    public ModelAndView processProductDeleteRow(@RequestParam int userId)
    {

        ModelAndView model= null;
        try
        {
                //System.out.println(customersListBean.getName());
                cd.DeleteCustomer(userId);
                model = new ModelAndView("CustomersList");
                List<CustomersListBean> customerList = cd.getListofCustomers();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

                model.addObject("customerList",customerList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

}

