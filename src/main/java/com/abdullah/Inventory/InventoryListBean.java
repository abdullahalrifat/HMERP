package com.abdullah.Inventory;

/**
 * Created by abdullah on 7/30/17.
 */
public class InventoryListBean
{
    private int id;
    private String Name;
    private Double CostPrice;
    private Double CostTax;
    private Double SalesPrice;
    private Double SalesTax;
    private int Quantity;

    public InventoryListBean() {
    }

    public InventoryListBean(String name, Double costPrice, Double costTax, Double salesPrice, Double salesTax, int quantity) {
        Name = name;
        CostPrice = costPrice;
        CostTax = costTax;
        SalesPrice = salesPrice;
        SalesTax = salesTax;
        Quantity = quantity;
    }

    public InventoryListBean(int id, String name, Double costPrice, Double costTax, Double salesPrice, Double salesTax, int quantity) {
        this.id = id;
        Name = name;
        CostPrice = costPrice;
        CostTax = costTax;
        SalesPrice = salesPrice;
        SalesTax = salesTax;
        Quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(Double costPrice) {
        CostPrice = costPrice;
    }

    public Double getCostTax() {
        return CostTax;
    }

    public void setCostTax(Double costTax) {
        CostTax = costTax;
    }

    public Double getSalesPrice() {
        return SalesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        SalesPrice = salesPrice;
    }

    public Double getSalesTax() {
        return SalesTax;
    }

    public void setSalesTax(Double salesTax) {
        SalesTax = salesTax;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
