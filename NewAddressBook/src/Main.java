import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	//System.out.println("New Address Book");
    	AddressBook<Contact> a1 = new AddressBook<>();
        System.out.println("Welcome to Address book");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do{
            System.out.println("Enter 1 -> Add contact\nEnter 2 -> Display all contacts");
            int userInput = sc.nextInt();
            switch (userInput){
                case 1 -> a1.addToAdBook(Contact.createContact(sc));
                case 2 -> a1.display();
                default -> System.out.println("Wrong input");
            }
            System.out.println("Press 0 to exit");
            input = sc.nextInt();
        }while (input != 0);
       
    	Contact c1=Contact.createContact(sc);
    	//System.out.println(c1);
    	
    }
}