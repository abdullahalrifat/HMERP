package com.abdullah.ProductDatabase;

import com.abdullah.Product.ProductListBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abdullah on 6/10/17.
 */
@Component
public interface ProductsDAO
{
    public void insertProducts(ProductListBean productsListBean);
    public List<ProductListBean> ListOfProducts();
}
