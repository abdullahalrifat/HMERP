package com.abdullah.Report.SalesReport;

/**
 * Created by abdullah on 7/15/17.
 */
public class DataClass
{
    private String Product;
    private int Quantity;
    private int  UnitPrice;
    private Double Tax;
    private int  Total;
    private Double NetTotal;


    public DataClass() {
    }

    public DataClass(String product, int quantity, int unitPrice, Double tax, int total,Double Nettotal) {
        Product = product;
        Quantity = quantity;
        UnitPrice = unitPrice;
        Tax = tax;
        Total = total;
        NetTotal=Nettotal;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        UnitPrice = unitPrice;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }
    public Double getNetTotal() {
        return NetTotal;
    }

    public void setNetTotal(Double netTotal) {
        NetTotal = netTotal;
    }

}
