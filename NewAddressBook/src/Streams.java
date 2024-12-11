import java.util.Scanner;

public class Streams { 
	public static void main(String[] args) { 
		System.out.println("Welcome to the AddressBook"); 
		AddressBookCollection<Contact> a1 = new AddressBookCollection<>();
        int input = 1;
        Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("\nAddress Book Menu:\n 1. Add Contact\n 2. Display Contacts\n "
            		+ "3. Delete Contact by Name\n "
            		+ "4. Search Contact by Name\n 5. Search Contact by State\n "
            		+ "6. Edit Contact Name\n "
            		+ "0. Exit\n Enter your choice: ");
            input = sc.nextInt();
            switch (input) {
                case 0->{}
                case 1 -> a1.add(Contact.createContact(sc)); 
                case 2 -> {System.out.println("Contacts:\n"); a1.display();}
                case 3 -> {
                	System.out.println("\nEnter name to delete: ");
                	String name=sc.next();
	                a1.delete(name);
                }
                case 4 -> {
                	System.out.println("\nEnter name to search: ");
                	String name=sc.next();
                	a1.searchByName(name);             	
                }
                case 5 -> {
                	System.out.println("\nEnter state to search: ");
                	String state=sc.next();
                	a1.searchByState(state);              	
                }
                case 6 -> {
                	System.out.println("\nEnter name to edit: ");
                	String name=sc.next();
                	System.out.println("\nEnter new name: ");
                	String newname=sc.next();            	
                	a1.editByName(name, newname);
                	
                }
                default -> System.out.println("Wrong input");
            }
            
            System.out.println("\nEnter 0 to exit");
        } while (input !=0);

        System.out.println("Thank you for using address book");
        sc.close();
	} 
} 
