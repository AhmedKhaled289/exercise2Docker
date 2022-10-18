package com.example.servicelayer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Address")
public class Address implements Serializable {


   @Id
   @Column(name = "add_Id")
   public Long add_Id;
   @Column(name = "street")
   public String street;
   @Column(name = "suite")
   public String suite;
   @Column(name = "city")
   public String city;
   @Column(name = "zipcode")
   public String zipcode;
    @OneToOne(cascade = {CascadeType.ALL})
   @JoinColumn(name = "address_id")
   public Geo geo;

   public Long getAdd_Id() {
      return add_Id;
   }

   public void setAdd_Id(Long add_Id) {
      this.add_Id = add_Id;
   }


   public String getStreet() {
      return street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public String getSuite() {
      return suite;
   }

   public void setSuite(String suite) {
      this.suite = suite;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getZipcode() {
      return zipcode;
   }

   public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
   }

   public Geo getGeo() {
      return geo;
   }

   public void setGeo(Geo geo) {
      this.geo = geo;
   }
}
