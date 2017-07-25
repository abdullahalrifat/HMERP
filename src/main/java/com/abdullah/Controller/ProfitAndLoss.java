package com.abdullah.Controller;

import com.abdullah.Purchase.PurchaseListBean;
import com.abdullah.PurchaseDatabase.PurchaseDetails;
import com.abdullah.Sales.SalesListBean;
import com.abdullah.SalesDatabase.SalesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by abdullah on 7/23/17.
 */
@Controller
public class ProfitAndLoss
{
    @Autowired
    SalesDetails salesDetails;
    @Autowired
    PurchaseDetails purchaseDetails;
    @RequestMapping(value = "/profitLossPDF", method = RequestMethod.GET)
    public String downloadExcel(Model model, HttpServletRequest request) {


        // / create some sample data
        // System.out.println(datepicker+clientName);


        List<SalesListBean> salesList = salesDetails.getListSales();
        List<PurchaseListBean> purchaseList = purchaseDetails.getListPurchase();

        XmlWebApplicationContext context=new XmlWebApplicationContext();
        context.setServletContext(request.getServletContext());
        context.refresh();
        //System.out.println("in download pdf");
        // create some sample data


        model.addAttribute("salesList",salesList);
        model.addAttribute("purchaseList",purchaseList);
        return "profitLosspdfView";

    }

}
