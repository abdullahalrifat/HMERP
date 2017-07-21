package com.abdullah.Report.SalesReport;

import java.util.ArrayList;

/**
 * Created by abdullah on 7/15/17.
 */


public class Generate
{
    private static ArrayList<DataClass> data=new ArrayList<>();
    public ArrayList getData()
    {
        return data;
    }

    public void setData(String product, int quantity, int  unitPrice, Double  tax, int  total,Double netTotal)
    {
        if(product==null)
        {
            System.out.println("real class =null");
        }
        else
        {
           // System.out.println(product);
            DataClass dataClass=new DataClass(product,quantity,unitPrice,tax,total,netTotal);
            data.add(dataClass);
        }

    }
    public void Setclear()
    {
        data.clear();
    }


}
