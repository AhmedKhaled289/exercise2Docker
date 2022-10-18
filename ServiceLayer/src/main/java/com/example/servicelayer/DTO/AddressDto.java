package com.example.servicelayer.DTO;

public class AddressDto {
   public String street;
   public String suite;
   public String city;
   public String zipcode;
   public GeoDto geoDto;

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

   public GeoDto getGeo() {
      return geoDto;
   }

   public void setGeo(GeoDto geoDto) {
      this.geoDto = geoDto;
   }

   @Override
   public String toString() {
      return "Address{" +
              "street='" + street + '\'' +
              ", suite='" + suite + '\'' +
              ", city='" + city + '\'' +
              ", zipcode='" + zipcode + '\'' +
              ", geo=" + geoDto.toString() +
              '}';
   }
}
