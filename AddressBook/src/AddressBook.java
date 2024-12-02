import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();

    public void createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name");
        String name = sc.next();
        System.out.println("Enter Last name");
        String lname = sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter Email ID");
        String email = sc.next();
        System.out.println("Enter Phone no.");
        int phone = sc.nextInt();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        adBook.add(c1);
        System.out.println("Contact is added");
    }

    public void display() {
        System.out.println(adBook);
    }
}