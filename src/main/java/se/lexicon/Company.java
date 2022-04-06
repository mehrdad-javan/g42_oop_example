package se.lexicon;

public class Company {
  private String name;
  private String organisationNUmber;
  private Address address;
  public Person[] employees;

  public Company() {
  }

  public Company(String name, String organisationNUmber, Address address) {
    this.name = name;
    this.organisationNUmber = organisationNUmber;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrganisationNUmber() {
    return organisationNUmber;
  }

  public void setOrganisationNUmber(String organisationNUmber) {
    this.organisationNUmber = organisationNUmber;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
