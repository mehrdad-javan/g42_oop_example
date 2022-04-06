package se.lexicon;

public class Address {

  private String street;
  private String zipCode;
  private String country;
  private String city;

  public Address() {
  }

  public Address(String street, String zipCode, String country, String city) {
    this.street = street;
    this.zipCode = zipCode;
    this.country = country;
    this.city = city;
  }

  public String addressInformation(){
    return " Street: " + street + " City: " + city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
