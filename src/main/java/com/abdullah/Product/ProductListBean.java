package com.abdullah.Product;

/**
 * Created by abdullah on 6/10/17.
 */
public class ProductListBean
{
    private int id;
    private String name;
    private int price;
    private Double tax;

    public ProductListBean() {
    }

    public ProductListBean(String name, int price, Double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public ProductListBean(int id, String name, int price, Double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
