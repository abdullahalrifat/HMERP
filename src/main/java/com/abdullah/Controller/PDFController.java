package com.abdullah.Controller;

import com.abdullah.Report.SalesReport.DataClass;
import com.abdullah.Report.SalesReport.Generate;
import com.abdullah.Sales.SalesListBean;
import com.abdullah.SalesDatabase.SalesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdullah on 7/15/17.
 */
@Controller
public class PDFController {


    @RequestMapping(value="/PDF")
    public ModelAndView processPDF(@RequestParam("index") List<String> values)
    {

        setIndexData(values);
        //System.out.println(values.size());
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("PDF");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;

    }
    @Autowired
    SalesDetails sldet;
    public void setIndexData(List<String> values)
    {
        List<SalesListBean>salesList = sldet.getListSales();
        Generate generate=new Generate();
        if(salesList!=null) {
            for (int i = 0; i < values.size(); i++) {
                SalesListBean salesListBean = salesList.get(Integer.parseInt(values.get(i)) - 1);
                generate.setData(salesListBean.getProduct(), salesListBean.getQuantity(), salesListBean.getPrice(), salesListBean.getTax(), salesListBean.getTotal(),salesListBean.getNet());
            }
        }
        else
        {
            System.out.println("Sales List Null");
        }
    }

    @RequestMapping(value = "/downloadPDF", method = RequestMethod.POST)
    public String downloadExcel(@RequestParam String  clientName,@RequestParam String datepicker,Model model, HttpServletRequest request) {


         // / create some sample data
       // System.out.println(datepicker+clientName);


        List<DataClass> listBooks = new ArrayList<DataClass>();
        Generate generate=new Generate();

        ArrayList<DataClass> arrayList=new ArrayList<>(generate.getData());
        for(int i=0;i<arrayList.size();i++)
        {
            listBooks.add(arrayList.get(i));
        }

        XmlWebApplicationContext context=new XmlWebApplicationContext();
        context.setServletContext(request.getServletContext());
        context.refresh();
        //System.out.println("in download pdf");
        // create some sample data


        model.addAttribute("listBooks",listBooks);
        model.addAttribute("clientName",clientName);
        model.addAttribute("date",datepicker);
        return "pdfView";

    }

}
