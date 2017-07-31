package com.abdullah.InventoryDataBase;

import com.abdullah.Inventory.InventoryListBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 7/30/17.
 */
@Component
public interface InventoryDAO
{
    public void insertInventory(InventoryListBean inventoryListBean);
    public List<InventoryListBean> ListOfInventory();
    public void updateInventory(InventoryListBean inventoryListBean);
    public void DeleteInventory(int userid);
}