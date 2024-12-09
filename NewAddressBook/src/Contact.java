import java.util.Scanner;

public class Contact {
    private String name;
    private String email;
    private String state;
    private int phoneNumber;

    public Contact(String name, String email, String state, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name  = sc.next();
        System.out.println("Email");
        String email  = sc.next();
        System.out.println("State");
        String state  = sc.next();
        System.out.println("PhoneNumber");
        int phone  = sc.nextInt();

        return new Contact(name,email,state,phone);

    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}