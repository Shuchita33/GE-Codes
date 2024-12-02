import java.util.Scanner;

public class Main { 
	public static void main(String[] args) { 
		System.out.println("Welcome to the AddressBook"); 
		AddressBook a1 = new AddressBook();
        int input = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to create a new contact \nEnter 2 to display existing contacts \n"
            		+ "Enter 3 to edit contacts \nEnter 4 to delete contacts");
            input = sc.nextInt();
            switch (input) {
                case 0->{}
                case 1 -> a1.createContact(); // This is UC 1
                case 2 -> {System.out.println("Contacts:\n"); a1.display();}
                case 3 -> a1.editContact();
                case 4 -> a1.deleteContact();
                default -> System.out.println("Wrong input");
            }
            
            System.out.println("\nEnter 0 to exit");
        } while (input !=0);

        System.out.println("Thank you for using address book");
        sc.close();
	} 
} 
