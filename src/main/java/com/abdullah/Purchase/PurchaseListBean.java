package com.abdullah.Purchase;

/**
 * Created by abdullah on 6/11/17.
 */
public class PurchaseListBean
{
    private int id;
    private String Date;
    private int BillNo;
    private String Product;
    private String Supplier;
    private Double Tax;
    private int Quantity;
    private int Rate;
    private int TotalAmount;
    private String PayMode;
    private Double Net;

    public PurchaseListBean() {
    }

    public PurchaseListBean(String date, int billNo, String product, String supplier, Double tax, int quantity, int rate, int totalAmount, String payMode,Double net) {
        Date = date;
        BillNo = billNo;
        Product = product;
        Supplier = supplier;
        Tax = tax;
        Quantity = quantity;
        Rate = rate;
        TotalAmount = totalAmount;
        PayMode = payMode;
        Net=net;
    }

    public PurchaseListBean(int id, String date, int billNo, String product, String supplier, Double tax, int quantity, int rate, int totalAmount, String payMode,Double net) {
        this.id = id;
        Date = date;
        BillNo = billNo;
        Product = product;
        Supplier = supplier;
        Tax = tax;
        Quantity = quantity;
        Rate = rate;
        TotalAmount = totalAmount;
        PayMode = payMode;
        Net=net;
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

    public int getBillNo() {
        return BillNo;
    }

    public void setBillNo(int billNo) {
        BillNo = billNo;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public String getPayMode() {
        return PayMode;
    }

    public void setPayMode(String payMode) {
        PayMode = payMode;
    }

    public Double getNet() {
        return Net;
    }

    public void setNet(Double net) {
        Net = net;
    }
}
