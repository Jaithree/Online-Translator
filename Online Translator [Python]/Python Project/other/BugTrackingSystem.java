import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Class name: MemoryGame
public class BugTrackingSystem {

    // Function to file the Bug into the Bug Tracking System
    public static void fileBug(int id) {
        System.out.println("**********");
        System.out.println("FILING A BUG");
        System.out.println("***********\n");

        // Current Time
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (Scanner scanner = new Scanner(System.in)) {
            String name, bugType, bugDescription, bugPriority;
            int bugStatus;
            // User name
            System.out.println("Enter your name:");
            name = scanner.nextLine();
            String filename = name + id + ".txt";
            // Filename of the Bug
            System.out.println("Filename: " + filename);
            try (FileWriter writer = new FileWriter(filename)) {
                // Date and time of Bug Creation
                writer.write("DATE AND TIME: " + currentTime.format(formatter) + "\n");
                
                // ID in the Text File
                writer.write("BUG ID: " + id + "\n\n");
                
                
// Bug ID
System.out.println("BUG ID: " + id);
writer.write("BUG FILED BY: " + name + "\n\n");

System.out.println("Enter bug type:");
bugType = scanner.nextLine();
writer.write("TYPE OF BUG: " + bugType + "\n\n");

System.out.println("Enter bug priority:");
bugPriority = scanner.nextLine();
writer.write("BUG PRIORITY: " + bugPriority + "\n\n");

System.out.println("Enter the bug description:");
bugDescription = scanner.nextLine();
writer.write("BUG DESCRIPTION: " + bugDescription + "\n\n");

System.out.println("Status of bug:\n1. NOT YET ASSIGNED\n2. IN PROCESS\n3. FIXED\n4. DELIVERED\nENTER YOUR CHOICE:");
bugStatus = scanner.nextInt();
scanner.nextLine(); // Consume newline

writer.write("BUG STATUS: ");
switch (bugStatus) {
    case 1->{
        writer.write("NOT YET ASSIGNED\n");
        break;
    }
    case 2->{
        writer.write("IN PROCESS\n");
        break;
    }
    case 3->{
        writer.write("FIXED\n");
        break;
    }
    case 4->{
        writer.write("DELIVERED\n");
        break;
    }
    default->{
        System.out.println("Invalid choice");
        break;
    }
}
            }
            catch (IOException e) {
                System.out.println("Cannot create file!!!");
            }
} 
}

// Function to Change the status of the Bug
public static void changeStatus() {
System.out.println("*************");
System.out.println("CHANGE STATUS");
System.out.println("**************\n");

// Current Time
LocalDateTime currentTime = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

try (Scanner scanner = new Scanner(System.in)) {
    String name;
    // Bug File name
    System.out.println("Enter file name:");
    name = scanner.nextLine() + ".txt";
    try (FileWriter writer = new FileWriter(name, true)) {
        System.out.println("\n1. NOT YET ASSIGNED\n2. IN PROCESS\n3. FIXED\n4. DELIVERED\nENTER YOUR CHOICE:");
        int status = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        writer.write("\nDATE AND TIME: " + currentTime.format(formatter) + "\nBUG STATUS: ");
        switch (status) {
            case 1->{
                writer.write("NOT YET ASSIGNED\n");
                break;
            }
            case 2->{
                writer.write("IN PROCESS\n");
                break;
            }
            case 3->{
                writer.write("FIXED\n");
                break;
            }
            case 4->{
                writer.write("DELIVERED\n");
                break;
            }
            default->{
                System.out.println("Invalid choice");
                break;
            }
            
            
        }
    } catch (IOException e) {
        System.out.println("Cannot open file!!!");
    }
}}

// Function to report the Bug in the Bug Tracking System
public static void report() {
System.out.println("**********");
System.out.println("REPORT");
System.out.println("**********\n");

try (   Scanner scanner = new Scanner(System.in)) {
    String name;
    // Asking the Filename to report the bug of the file
    System.out.println("Enter file name:");
    name = scanner.nextLine() + ".txt";
    try {
        String content = new String(Files.readAllBytes(Paths.get(name)));
        System.out.println(content);
    } catch (IOException e) {
        System.out.println("Cannot read file!!!");
    }
}}

// Driver Code
public static void main(String[] args) {
System.out.println("***************");
System.out.println("BUG TRACKING SYSTEM");
System.out.println("***************\n");

        try (Scanner scanner = new Scanner(System.in)) {
            int number, id = 0;
            boolean run = true;
            while (run) {
                System.out.println("\n1. FILE A NEW BUG\n2. CHANGE THE STATUS OF THE BUG\n3. GET BUG REPORT\n4. EXIT\n\nENTER YOUR CHOICE:");
                number = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (number) {
                    case 1->{
                        id++;
                        fileBug(id);
                        break;
                    }
                    case 2->{
                        changeStatus();
                        break;
                    }
                    case 3->{
                        report();
                        break;
                    }
                    case 4->{
                        run = false;
                        break;
                    }
                    default->{
                        System.out.println("Invalid entry");
                        break;
                    }
                }
            }       }
}
}
