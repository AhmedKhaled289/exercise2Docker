package com.example.servicelayer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "Users")
public class Users implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "username")
    public String username;
    @Column(name = "email")
    public String email;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "add_id")
    public Address address;
    @Column(name = "phone")
    public String phone;
    @Column(name = "website")
    public String website;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "company_Id")
    public Company company;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
