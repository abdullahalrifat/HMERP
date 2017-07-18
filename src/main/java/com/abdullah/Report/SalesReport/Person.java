package com.abdullah.Report.SalesReport;

/**
 * Created by abdullah on 7/18/17.
 */
public class Person
{
    private String id;
    private String name;
    private String surname;
    private String birthYear;

    public Person(String id, String name, String surname, String birthYear) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    //...
    //getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
}
