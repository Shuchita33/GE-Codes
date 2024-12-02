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
        
        
        Contact newContact = new Contact(name,lname, city, state, email, phone, zip);

        // Add the contact to the address book
        adBook.add(newContact);
        System.out.println("Contact has been added successfully!");
    }
    
    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of the contact to edit:");
        String name = sc.next();
        boolean found = false;

        for (Contact contact : adBook) {
            if (contact.firstName.equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Editing contact: " + contact);
                System.out.println("Enter new city:");
                contact.city = sc.next();
                System.out.println("Enter new state:");
                contact.state = sc.next();
                System.out.println("Enter new email:");
                contact.email = sc.next();
                System.out.println("Enter new phone number:");
                contact.phone = sc.nextInt();
                System.out.println("Enter new zip:");
                contact.zip = sc.nextInt();
                System.out.println("Contact updated: " + contact);
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
      }
    
    public void display() {
    	for (Contact contact : adBook) {
            System.out.println(contact);
        }
    }
}
