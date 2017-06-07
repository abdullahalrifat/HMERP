package com.abdullah.CustomersList;

/**
 * Created by abdullah on 6/8/17.
 */
public class CustomersListBean
{
    private int id;
    private String Name;
    private String Mobile;
    private String Email;
    private String Address;
    private String PinCode;
    private String Country;
    private String City;
    private String BankDetails;

    public CustomersListBean() {
    }

    public CustomersListBean(String name, String mobile, String email, String address, String pinCode, String country, String city, String bankDetails) {
        Name = name;
        Mobile = mobile;
        Email = email;
        Address = address;
        PinCode = pinCode;
        Country = country;
        City = city;
        BankDetails = bankDetails;
    }

    public CustomersListBean(int id, String name, String mobile, String email, String address, String pinCode, String country, String city, String bankDetails) {
        this.id = id;
        Name = name;
        Mobile = mobile;
        Email = email;
        Address = address;
        PinCode = pinCode;
        Country = country;
        City = city;
        BankDetails = bankDetails;
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

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getBankDetails() {
        return BankDetails;
    }

    public void setBankDetails(String bankDetails) {
        BankDetails = bankDetails;
    }
}
