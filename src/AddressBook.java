//Name: Sahil Agrawal
import java.util.ArrayList;
public class AddressBook{

    ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }


    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
    public void add(){

    }

}
