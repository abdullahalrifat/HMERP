package com.abdullah.PurchaseDatabase;

import com.abdullah.Purchase.PurchaseListBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/11/17.
 */
@Component
public interface PurchaseDAO
{
    public void insertPurchase(PurchaseListBean purchaseListBean);
    public List<PurchaseListBean> ListOfPurchase();
    public void updatePurchase(PurchaseListBean purchaseListBean);
    public void DeletePrurchase(int userid);
}