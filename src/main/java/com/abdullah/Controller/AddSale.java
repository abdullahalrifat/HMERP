package com.abdullah.Controller;

import com.abdullah.CustomerListDataBase.CustomerDetails;
import com.abdullah.Customers.CustomersListBean;
import com.abdullah.Inventory.InventoryListBean;
import com.abdullah.InventoryDataBase.InventoryDetails;
import com.abdullah.ProductDatabase.ProductDetails;
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
    @Autowired
    ProductDetails prdet;
    @Autowired
    CustomerDetails customer;
    @Autowired
    InventoryDetails inv;
    @RequestMapping(value="/add-sales")
    public ModelAndView processSalesRegister(@ModelAttribute SalesListBean salesListBean)
    {

        ModelAndView model= null;
        try
        {
            if(salesListBean.getProduct()!=""&&salesListBean.getCustomer()!=""&&salesListBean.getQuantity()!=0&&salesListBean.getPayMode()!="")
            {
                System.out.println(salesListBean.getNet());
                cd.registerSales(salesListBean.getBillNo(), salesListBean.getDate(), salesListBean.getProduct(), salesListBean.getPrice(), salesListBean.getCustomer(), salesListBean.getQuantity(), salesListBean.getTotal(), salesListBean.getTax(), salesListBean.getNet(), salesListBean.getPayMode());
                updateInventory(salesListBean.getProduct(),salesListBean.getQuantity());
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
    public void updateInventory(String productName,int Quantity)
    {
        List<InventoryListBean> list=inv.getListInventory();
        for(int i=0;i<list.size();i++)
        {
            InventoryListBean iv=list.get(i);
            if(iv.getName().equals(productName))
            {
                iv.setQuantity((iv.getQuantity()-Quantity));
                 inv.updateInventory(iv);
            }
        }
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
           //System.out.println(l.get(0).getProduct());
            model.addObject("saleslist",l);
            List<InventoryListBean> proList = inv.getListInventory();
            model.addObject("productList",proList);
            List<CustomersListBean> cust=customer.getListofCustomers();
            model.addObject("customerList",cust);
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
                System.out.println(salesListBean.getBillNo());
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
