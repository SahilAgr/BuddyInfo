public class BuddyInfo {

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public static String getName() {
        return name;
    }
    public static String getAddress() {
        return address;
    }
    public static String getNumber() {
        return number;
    }

    private static String name;
    public static void main(String[] args) {
        new BuddyInfo("Sahil","Carleton","123-456-7890");
        System.out.println("Hello "+ getName() + "!");

    }
}
