import java.util.ArrayList;

public class AddressBookCollection<T extends GetName> {
    ArrayList<T> adBook = new ArrayList<>();

    public void add(T a){
        adBook.add(a);
    }

    public void display(){
        System.out.println(adBook);
    }

    public void delete(String n){
        adBook.removeIf(t-> t.getName().equalsIgnoreCase(n));

    }
    public void searchByName(String n){
        adBook.stream().filter(t-> t.getName().equalsIgnoreCase(n)).forEach(System.out::println);
    }
    public void searchByState(String n){
        adBook.stream().filter(t-> t.getState().equalsIgnoreCase(n)).forEach(System.out::println);

    }
    public void editByName(String n, String editedName){
        adBook.stream().map(t -> {
            if (t.getName().equalsIgnoreCase(n)){
                t.setName(editedName) ;
            }
            return t;
        }).forEach(System.out::println);;
    }

	public String getName() {
		return getName();
	}

}