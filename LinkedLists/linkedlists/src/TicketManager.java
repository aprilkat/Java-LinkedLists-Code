
/*
    Author: April Bollinger
    Program: IT Help Desk Ticket Manager
    Date: 2/27/2021
    Purpose: To implement Linked Lists and queues
*/

// Importing the Scanners.
import java.util.Scanner;


public class TicketManager {
   
    // Getting stuff from the LLNode file.
    LLNode head;
    LLNode tail;
    LLNode next;
    
    // The method that will display the menu.
    public static void DisplayMenu() {
        System.out.println("Please choose one of the options displayed below by entering it's corresponding option number.");
        System.out.print("     Option 1. Create a Ticket. \n     Option 2. Close a Ticket. \n     Option 3. Display all Active Tickets.");
        System.out.println("\nPlease enter the number of your chosen action.  ");
    }

    // The method that prints out all of the tickets in the queue.
    public static void DisplayAll(LinkedList queue){
        // Sets temp to the head of the queue and them interates through if the head is not null.
        LLNode temp = queue.head;
            while (temp != null) {
                System.out.println(temp.info + " ");
                temp = temp.next;
            }
    }

    
    
    // The main method
    public static void main(String[] args) {
        // Sets up all of the variables
        // These are the objects that hold the information that is to be contained in the ticket.
        Object Name = "";
        Object Problem = "";
        // Sets up the LinkedList.
        LinkedList queue = new LinkedList();
        // The variable that will send the user to the menu item that they chose.
        int useInput = 0;
        // Contro for the while statement.
        String control = "yes";
        // Setting up the Scanners used.
        Scanner ScanName = new Scanner(System.in);
        Scanner ScanProb = new Scanner(System.in);
        Scanner scanControl = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        // General welcome message.
        System.out.println("Welcome to the Ticket Manager.");

        // Beginning of the main part of the program.
        while(control.equalsIgnoreCase("yes")){
            // Calls the method that dispays the menu.
            DisplayMenu();
            // Gets the users choice.
            useInput = sc.nextInt();
            // Switch statement.
            switch (useInput) {
                case 1:
                    // Gets the name of the client and a description of the problem.
                    System.out.println("Please enter your name. ");
                    Name = ScanName.nextLine();
                    System.out.println("Please Describe the issues you are having. ");
                    Problem = ScanProb.nextLine();
                    // Assisgns them to one Object variable so that they can be put into the queue.
                    Object info = ("Name: " + Name + "  Complaint: " + Problem);

                    // Uses the Enqueue on the information gathered.
                    queue.Enqueue(info, queue);

                    System.out.println("The ticket you created has been added to the queue. ");

                    System.out.println("The updated queue.");
                    // Dispaying the updated queue.
                    DisplayAll(queue);
                                
                    // Checks to see if they want to continue.
                    // If they do, it sends them back to the beginning of the loop.
                    System.out.println("Would you like to continue? ");
                    control = scanControl.nextLine();

                    break;

                case 2:

                    // Uses the Dequeue on the first ticket in the queue.
                    queue.Dequeue();
                    // Displays the queue after it the ticket is removed.
                    DisplayAll(queue);
                    
                    // Checks to see if they want to continue.
                    System.out.println("Would you like to continue? ");
                    control = scanControl.nextLine();

                    break;

                case 3:
                    // Just Displays the queue.
                    DisplayAll(queue);
                                
                    System.out.println("Would you like to continue? ");
                    control = scanControl.nextLine();

                    break;

                // In case the user enters an invalid number.
                default:

                    System.out.println("Invalid input. Please try again.");

                    break;
                    
                }

        }

        // Exits message.
        System.out.println("Thank you for using this application!");

        // Closes the scanners.
        ScanName.close();
        ScanProb.close();
        scanControl.close();
        sc.close();
    }

}