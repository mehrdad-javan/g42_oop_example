package se.lexicon;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Address erikAddress = new Address("Teleborg", "35252", "Sweden", "Växjö");
    Person erik = new Person("Erik", "erik.test@lexicon.se", "123456789", erikAddress);
    erik.displayInformation();

    Address mehrdadAddress = new Address("Stortorget", "35236", "Sweden", "Jonkoping");
    Person mehrdad = new Person("Mehrdad", "mehrdad.javan@lexicon.se", "1234554321", mehrdadAddress);
    mehrdad.displayInformation();
  }
}
