package com.abdullah.Controller;

import com.abdullah.Product.ProductListBean;
import com.abdullah.ProductDatabase.ProductDetails;
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
public class AddProducts {

    @Autowired
    ProductDetails cd;
    @RequestMapping(value="/add-products")
    public ModelAndView processProductRegister(@ModelAttribute ProductListBean productListBean)
    {

        ModelAndView model= null;
        try
        {
            if(productListBean.getName()!=""&&productListBean.getPrice()!=0&& productListBean.getTax()!=0.0)
            {
                cd.registerProducts(productListBean.getName(),productListBean.getPrice(),productListBean.getTax());
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddProducts");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value="/update-products")
    public ModelAndView processUpdateProducts(@RequestParam int userId)
    {
        ModelAndView model= null;
        List<ProductListBean> list=cd.getListProducts();
        //System.out.println(list.size());
        try
        {
            model = new ModelAndView("UpdateProducts");
            List<ProductListBean> l=new ArrayList();
            ProductListBean clb=list.get(userId-1);
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

    @RequestMapping(value="/update-products-row")
    public ModelAndView processProductUpdateRow(@ModelAttribute ProductListBean productListBean)
    {

        ModelAndView model= null;
        try
        {
            if(productListBean.getName()!=""&&productListBean.getPrice()!=0&& productListBean.getTax()!=0.0)
            {
               cd.updateProducts(productListBean);
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddProducts");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/delete-products-row")
    public ModelAndView processProductDeleteRow(@RequestParam int userId)
    {

        ModelAndView model= null;
        try
        {
                cd.DeleteProducts(userId);
                model = new ModelAndView("ProductList");
                List<ProductListBean> productList = cd.getListProducts();


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
