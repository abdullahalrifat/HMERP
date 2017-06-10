package com.abdullah.ProductDatabase;

import com.abdullah.Product.ProductListBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/10/17.
 */
@Component
public class ProductDetails
{
    @Autowired
    private ProductsDAO productsDAO;
    public List<ProductListBean> getListProducts()
    {

        List<ProductListBean> listUser=productsDAO.ListOfProducts();
        return listUser;
    }
    public void registerProducts(String name, int price, Double tax) {
        List<ProductListBean> listUser=productsDAO.ListOfProducts();
        int size=listUser.size();
        ProductListBean productListBean=new ProductListBean(size+1, name,  price,tax);
        productsDAO.insertProducts(productListBean);
    }
}

