import java.util.HashMap;
public class AddressBook{

    private HashMap<String, BuddyInfo> addressBook;

    public AddressBook(){
        addressBook = new HashMap<>();
    }

    public void addBuddy(String name, BuddyInfo buddies){
        this.addressBook.put(name, buddies);
    }

    public void remove(String name){
        this.addressBook.remove(name);
    }


    public static void main(String[] args){
        System.out.println("Address Book");

    }

}