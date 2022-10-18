package com.example.servicelayer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Geo")
public class Geo implements Serializable {
    @Id
    @Column(name = "address_Id")
    public Long address_Id;
    @Column(name = "lat")
    public String lat;
    @Column(name = "lng")
    public String lng;


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Long getAddress_Id() {
        return address_Id;
    }

    public void setAddress_Id(Long address_Id) {
        this.address_Id = address_Id;
    }
}
