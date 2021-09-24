public class BuddyInfo {

    public  static String name,address,phoneNum;

    public BuddyInfo(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public static String getName() {
        return name;
    }
    public static String getAddress() {
        return address;
    }
    public static String getNumber() {
        return phoneNum;
    }

    //private static String name;
    public static void main(String[] args) {
        new BuddyInfo("Sahil","Carleton","123-456-7890");
        System.out.println("Hello "+ getName() + "!");

    }
}
