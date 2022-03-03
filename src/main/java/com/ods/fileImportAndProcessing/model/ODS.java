package com.ods.fileImportAndProcessing.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Entity
public class ODS implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String address1;
    private String city;
    private String state;
    private String zip;
    private String company;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public ODS() {}

    public ODS(String name, String address1, String city, String state, String zip, String employeeCode, String company) {
        this.name = name;
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.company = company;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "ODS{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + address1 + '\'' +
                ", jobTitle='" + city + '\'' +
                ", phone='" + zip + '\'' +
                ", imageUrl='" + state + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}