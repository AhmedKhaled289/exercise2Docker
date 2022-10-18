package com.example.servicelayer.DTO;

import java.io.Serializable;

public class UsersDto implements Serializable {
    public int id;
    public String name;
    public String username;
    public String email;
    public AddressDto addressDto;
    public String phone;
    public String website;
    public CompanyDto companyDto;

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

    public AddressDto getAddress() {
        return addressDto;
    }

    public void setAddress(AddressDto addressDto) {
        this.addressDto = addressDto;
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

    public CompanyDto getCompany() {
        return companyDto;
    }

    public void setCompany(CompanyDto companyDto) {
        this.companyDto = companyDto;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + addressDto.toString() +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + companyDto.toString() +
                '}';
    }
}
