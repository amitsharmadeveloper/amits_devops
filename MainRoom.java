import java.util.Scanner;

// Room class
class Room {
    // Attributes of the Room class
    int roomNo;
    String roomType;
    double roomArea;
    boolean hasAC;

    // Method to set data for a room
    void setData(int no, String type, double area, boolean ac) {
        roomNo = no;
        roomType = type;
        roomArea = area;
        hasAC = ac;
    }

    // Method to display data of a room
    void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq.ft.");
        System.out.println("AC Available: " + (hasAC ? "Yes" : "No"));
    }
}

// Main class to test the Room class
public class MainRoom {
    public static void main(String[] args) {
        // Create an object of Room class
        Room room1 = new Room();

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter room number: ");
        int roomNo = scanner.nextInt();

        System.out.print("Enter room type: ");
        scanner.nextLine(); // Consume newline
        String roomType = scanner.nextLine();

        System.out.print("Enter room area in sq.ft: ");
        double roomArea = scanner.nextDouble();

        System.out.print("Is there an AC in the room (true/false)? ");
        boolean hasAC = scanner.nextBoolean();

        // Set data for the room
        room1.setData(roomNo, roomType, roomArea, hasAC);

        // Display the room data
        room1.displayData();

        // Close the scanner
        scanner.close();
    }
}