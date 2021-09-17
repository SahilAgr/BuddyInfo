import java.util.ArrayList;
public class AddressBook{

    ArrayList<BuddyInfo> addressBook;

    public AddressBook(){
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.addressBook.remove(buddy);
    }


    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }

}