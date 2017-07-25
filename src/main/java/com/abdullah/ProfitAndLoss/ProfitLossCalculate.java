package com.abdullah.ProfitAndLoss;

import com.abdullah.Purchase.PurchaseListBean;
import com.abdullah.PurchaseDatabase.PurchaseDetails;
import com.abdullah.Sales.SalesListBean;
import com.abdullah.SalesDatabase.SalesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 7/22/17.
 */
@Component
public class ProfitLossCalculate
{
    public static Double income=0.0;
    public static Double expense=0.0;
    @Autowired
    SalesDetails salesDetails;
    @Autowired
    PurchaseDetails purchaseDetails;

    public static void setIncome() {
        ProfitLossCalculate.income = 0.0;
    }

    public static void setExpense() {
        ProfitLossCalculate.expense = 0.0;
    }

    public static Double getIncome() {
        return income;
    }

    public static Double getExpense() {
        return expense;
    }

    public void CalculateIncome()
    {
        List<SalesListBean> salesList = salesDetails.getListSales();
        for(int i=0;i<salesList.size();i++)
        {
            SalesListBean sb=salesList.get(0);
            income+=sb.getNet();
        }

    }
    public void CalculateExpense()
    {
        List<PurchaseListBean> purchaseList = purchaseDetails.getListPurchase();
        for(int i=0;i<purchaseList.size();i++)
        {
            PurchaseListBean pb=purchaseList.get(0);
            expense+=pb.getNet();
        }
    }
}
