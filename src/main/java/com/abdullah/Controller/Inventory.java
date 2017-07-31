package com.abdullah.Controller;

import com.abdullah.Inventory.InventoryListBean;
import com.abdullah.InventoryDataBase.InventoryDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdullah on 7/30/17.
 */
@Controller
public class Inventory
{

    @Autowired
    InventoryDetails cd;
    @RequestMapping(value="/add-inventory")
    public ModelAndView processInventoryRegister(@ModelAttribute InventoryListBean inventoryListBean)
    {

        ModelAndView model= null;
        try
        {

                cd.registerInventory(inventoryListBean.getName(),inventoryListBean.getCostPrice(),inventoryListBean.getCostTax(),inventoryListBean.getSalesPrice(),inventoryListBean.getSalesTax(),inventoryListBean.getQuantity());
                model = new ModelAndView("InventoryList");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value="/update-inventory")
    public ModelAndView processUpdateInventory(@RequestParam int userId)
    {
        ModelAndView model= null;
        List<InventoryListBean> list=cd.getListInventory();
        //System.out.println(list.size());
        try
        {
            model = new ModelAndView("UpdateInventory");
            List<InventoryListBean> l=new ArrayList();
            InventoryListBean clb=list.get(userId-1);
            l.add(clb);
            //checking if reading the databse
            System.out.println(l.get(0).getName());
            model.addObject("productlist",l);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        // System.out.println(userId);
        return model;
    }

    @RequestMapping(value="/update-inventory-row")
    public ModelAndView processProductUpdateRow(@ModelAttribute InventoryListBean inventoryListBean)
    {

        ModelAndView model= null;
        try
        {

                cd.updateInventory(inventoryListBean);
                model = new ModelAndView("InventoryList");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/delete-inventory-row")
    public ModelAndView processProductDeleteRow(@RequestParam int userId)
    {

        ModelAndView model= null;
        try
        {
            cd.DeleteInventory(userId);
            model = new ModelAndView("InventoryList");
            List<InventoryListBean> productList = cd.getListInventory();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("productList",productList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}
