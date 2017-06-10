package com.abdullah.Controller;

import com.abdullah.Sales.SalesListBean;
import com.abdullah.SalesDatabase.SalesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdullah on 6/11/17.
 */
@Controller
public class AddSale {
    @Autowired
    SalesDetails cd;
    @RequestMapping(value="/add-sales")
    public ModelAndView processSalesRegister(@ModelAttribute SalesListBean salesListBean)
    {

        ModelAndView model= null;
        try
        {
            if(salesListBean.getProduct()!=""&&salesListBean.getCustomer()!=""&&salesListBean.getQuantity()!=0&&salesListBean.getPayMode()!="")
            {
                cd.registerSales(salesListBean.getDate(),salesListBean.getProduct(),salesListBean.getCustomer(),salesListBean.getQuantity(),salesListBean.getPayMode());
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddSales");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value="/update-sales")
    public ModelAndView processSalesProducts(@RequestParam int userId)
    {
        ModelAndView model= null;
        List<SalesListBean> list=cd.getListSales();
        //System.out.println(list.size());
        try
        {
            model = new ModelAndView("UpdateSales");
            List<SalesListBean> l=new ArrayList();
            SalesListBean clb=list.get(userId-1);
            l.add(clb);
            //checking if reading the databse
           // System.out.println(l.get(0).getName());
            model.addObject("saleslist",l);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        // System.out.println(userId);
        return model;
    }

    @RequestMapping(value="/update-sales-row")
    public ModelAndView processSalesUpdateRow(@ModelAttribute SalesListBean salesListBean)
    {

        ModelAndView model= null;
        try
        {
            if(salesListBean.getProduct()!=""&&salesListBean.getCustomer()!=""&&salesListBean.getQuantity()!=0&&salesListBean.getPayMode()!="")
            {
                cd.updateSales(salesListBean);
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddSales");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/delete-sales-row")
    public ModelAndView processSalesDeleteRow(@RequestParam int userId)
    {

        ModelAndView model= null;
        try
        {
            cd.DeleteSales(userId);
            model = new ModelAndView("SalesList");
            List<SalesListBean> salesList = cd.getListSales();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("salesList",salesList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}
