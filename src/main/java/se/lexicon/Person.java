package se.lexicon;

public class Person {

  private String name;
  private String email;
  private String phoneNumber;
  private Address address;
  private String[] competences;


  public Person() {
  }

  public Person(String name, String email, String phoneNumber, Address address) {
    this(name,email,phoneNumber);
    this.address = address;
  }

  public Person(String name, String email, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }


  public void displayInformation(){
    System.out.println("Name: " + name + ", Email: " + email + " Address: " + address.addressInformation());
  }

  public void addCompetence(String competence){
    // ... Add competence to competences
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String[] getCompetences() {
    return competences;
  }

  public void setCompetences(String[] competences) {
    this.competences = competences;
  }
}
