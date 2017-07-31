package com.abdullah.InventoryDataBase;

import com.abdullah.Inventory.InventoryListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 7/30/17.
 */
@Component
public class InventoryDetails {

    @Autowired
    private InventoryDAO inventoryDAO;
    public List<InventoryListBean> getListInventory()
    {

        List<InventoryListBean> listUser=inventoryDAO.ListOfInventory();
        return listUser;
    }
    public void registerInventory(String name,Double CostPrice,Double CostTax,Double SalesPrice, Double Salestax,int Quantity) {
        List<InventoryListBean> listUser=inventoryDAO.ListOfInventory();
        int size=listUser.size();
        InventoryListBean inventoryListBean=new InventoryListBean(size+1, name,CostPrice,CostTax,SalesPrice,SalesPrice,Quantity);
        inventoryDAO.insertInventory(inventoryListBean);
    }
    public void updateInventory(InventoryListBean inventoryListBean) {
        inventoryDAO.updateInventory(inventoryListBean);
    }
    public void DeleteInventory(int userid) {
        inventoryDAO.DeleteInventory(userid);
    }
}


