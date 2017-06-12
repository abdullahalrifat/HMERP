package com.abdullah.Sales;

/**
 * Created by abdullah on 6/11/17.
 */
public class SalesListBean {
    private int id;
    private int BillNo;
    private String Date;
    private String Product;
    private int price;
    private String Customer;
    private int Quantity;
    private int Total;
    private Double Tax;
    private Double Net;
    private String PayMode;

    public SalesListBean() {
    }

    public SalesListBean(int billNo, String date, String product, int price, String customer, int quantity, int total, Double tax, Double net, String payMode) {
        BillNo = billNo;
        Date = date;
        Product = product;
        this.price = price;
        Customer = customer;
        Quantity = quantity;
        Total = total;
        Tax = tax;
        Net = net;
        PayMode = payMode;
    }

    public SalesListBean(int id, int billNo, String date, String product, int price, String customer, int quantity, int total, Double tax, Double net, String payMode) {
        this.id = id;
        BillNo = billNo;
        Date = date;
        Product = product;
        this.price = price;
        Customer = customer;
        Quantity = quantity;
        Total = total;
        Tax = tax;
        Net = net;
        PayMode = payMode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBillNo() {
        return BillNo;
    }

    public void setBillNo(int billNo) {
        BillNo = billNo;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }

    public Double getNet() {
        return Net;
    }

    public void setNet(Double net) {
        Net = net;
    }

    public String getPayMode() {
        return PayMode;
    }

    public void setPayMode(String payMode) {
        PayMode = payMode;
    }
}
