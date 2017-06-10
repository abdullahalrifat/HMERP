package com.abdullah.Sales;

/**
 * Created by abdullah on 6/11/17.
 */
public class SalesListBean
{
    private int id;
    private String Date;
    private String Product;
    private String Customer;
    private int Quantity;
    private String PayMode;

    public SalesListBean() {
    }

    public SalesListBean(String date, String product, String customer, int quantity, String payMode) {
        Date = date;
        Product = product;
        Customer = customer;
        Quantity = quantity;
        PayMode = payMode;
    }

    public SalesListBean(int id, String date, String product, String customer, int quantity, String payMode) {
        this.id = id;
        Date = date;
        Product = product;
        Customer = customer;
        Quantity = quantity;
        PayMode = payMode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getPayMode() {
        return PayMode;
    }

    public void setPayMode(String payMode) {
        PayMode = payMode;
    }
}
