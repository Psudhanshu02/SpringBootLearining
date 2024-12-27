package com.example.tutorial1_mavin.model;

import jakarta.persistence.*;

@Entity
@Table(name= "vendor_info")
public class vendorDetails {

    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

//    @Column(nullable = false, length = 100)
    private String name;

//    @Column(name = "phone_number", length = 15)
    private String phone_number;

//    @Column(length = 255)
    private String address;


    public vendorDetails(String id, String name, String phone_number, String address) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
    }

    public vendorDetails() {
    }
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
