package com.abdullah.Controller;

import com.abdullah.Product.ProductListBean;
import com.abdullah.ProductDatabase.ProductDetails;
import com.abdullah.Purchase.PurchaseListBean;
import com.abdullah.PurchaseDatabase.PurchaseDetails;
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
public class AddPurchase {
    @Autowired
    PurchaseDetails cd;
    @Autowired
    ProductDetails prdet;
    @RequestMapping(value="/add-purchase")
    public ModelAndView processPurchaseRegister(@ModelAttribute PurchaseListBean pruchaseListBean)
    {

        ModelAndView model= null;

        try
        {
            if(pruchaseListBean.getProduct()!=""&&pruchaseListBean.getBillNo()!=0&&pruchaseListBean.getTotalAmount()!=0)
            {
                cd.registerPurchase(pruchaseListBean.getDate(),pruchaseListBean.getBillNo(),pruchaseListBean.getProduct(),pruchaseListBean.getSupplier(),pruchaseListBean.getTax(),pruchaseListBean.getQuantity(),pruchaseListBean.getRate(),pruchaseListBean.getTotalAmount(),pruchaseListBean.getPayMode(),pruchaseListBean.getNet());
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddPurchase");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value="/update-purchase")
    public ModelAndView processUpdatePurchase(@RequestParam int userId)
    {
        ModelAndView model= null;
        List<PurchaseListBean> list=cd.getListPurchase();
        //System.out.println(list.size());
        try
        {
            model = new ModelAndView("UpdatePurchase");
            List<PurchaseListBean> l=new ArrayList();
            PurchaseListBean clb=list.get(userId-1);
            List<ProductListBean> proList = prdet.getListProducts();
            l.add(clb);
            //checking if reading the databse
            //System.out.println(l.get(0).getName());
            model.addObject("purchaselist",l);



            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("productList",proList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        // System.out.println(userId);
        return model;
    }

    @RequestMapping(value="/update-purchase-row")
    public ModelAndView processPurchaseUpdateRow(@ModelAttribute PurchaseListBean purchaseListBean)
    {
       // System.out.println(purchaseListBean.getSupplier());
        ModelAndView model= null;
        try
        {
            if(purchaseListBean.getProduct()!=""&&purchaseListBean.getBillNo()!=0&&purchaseListBean.getTotalAmount()!=0)
            {

                cd.updatePurchase(purchaseListBean);
                model = new ModelAndView("Home");
            }
            else
            {
                model = new ModelAndView("AddPurchase");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/delete-purchase-row")
    public ModelAndView processPurchaseDeleteRow(@RequestParam int userId)
    {

        ModelAndView model= null;
        try
        {
            cd.DeletePurchase(userId);
            model = new ModelAndView("PurchaseList");
            List<PurchaseListBean> purchaseList = cd.getListPurchase();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("purchaseList",purchaseList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
}
