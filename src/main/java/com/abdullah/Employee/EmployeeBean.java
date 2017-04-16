package com.abdullah.Employee;

/**
 * Created by abdullah on 3/21/17.
 */
public class EmployeeBean
{
    private int id;
    private String Name;
    private String Phone;
    private String Address;
    private String Position;


    public EmployeeBean() {

    }
    public EmployeeBean(String name, String phone, String address, String position) {
        this.id = 0;
        Name = name;
        Phone = phone;
        Address = address;
        Position = position;
    }
    public EmployeeBean(int id, String name, String phone, String address, String position) {
        this.id = id;
        Name = name;
        Phone = phone;
        Address = address;
        Position = position;
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

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
