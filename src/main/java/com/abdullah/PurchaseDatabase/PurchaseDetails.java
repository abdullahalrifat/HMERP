package com.abdullah.PurchaseDatabase;

import com.abdullah.Purchase.PurchaseListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/11/17.
 */
@Component
public class PurchaseDetails
{
    @Autowired
    private PurchaseDAO purchaseDAO;
    public List<PurchaseListBean> getListPurchase()
    {

        List<PurchaseListBean> listParches=purchaseDAO.ListOfPurchase();
        return listParches;
    }
    public void registerPurchase(String date, int billNo, String product, String supplier, Double tax, int quantity, int rate, int totalAmount, String payMode,Double Net) {
        List<PurchaseListBean> listParchase=purchaseDAO.ListOfPurchase();
        int size=listParchase.size();
        PurchaseListBean purchaseListBean=new PurchaseListBean(size+1,date,billNo,product,supplier,tax,quantity,rate,totalAmount,payMode,Net);
        purchaseDAO.insertPurchase(purchaseListBean);
    }
    public void updatePurchase(PurchaseListBean purchaseListBean) {
        purchaseDAO.updatePurchase(purchaseListBean);
    }
    public void DeletePurchase(int userid) {
        purchaseDAO.DeletePrurchase(userid);
    }
}


