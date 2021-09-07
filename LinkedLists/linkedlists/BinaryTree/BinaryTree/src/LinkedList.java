package BinaryTree.src;


/*
    Author: April Bollinger
    Program: LinkedList
    Date: 2/20/2021
    Purpose: To learn about and understand how to make linked lists.
    Resources Used: https://letstalkalgorithms.com/linkedlist-implementation-java/  
                    https://www.javatpoint.com/java-program-to-search-an-element-in-a-singly-linked-list
                    https://www.geeksforgeeks.org/delete-a-linked-list-node-at-a-given-position/
 */



public class LinkedList {
    

    // Retrieving information from the LLNode file.
    LLNode head;
    LLNode tail;
    LLNode next;
    

    
    // Adds a new node to the end of the LinkedList.
    public LinkedList addNode(int data, LinkedList List) {
        // Checking to see if the head of the list is the only node in the list.
        if (head == null){
            LLNode temp = new LLNode(data);
            head = temp;
            tail = temp;
        }else{
            // if there is more than one node it moves to the last node and adds one after the tail node.
            tail.next = new LLNode(data);
            // Sets the value of the tail to the new node after the original tail node.
            tail = tail.next;
        }
        
        // Returning the List so that I can print it out to show the changes.
        return List;
    }

    // Deletes a Node at a specific index of the list.
    public static LinkedList deleteNode(LinkedList List) {
        // The index of the list to be removed from the list.
        // The index of the list starts at zero like arrays.
        int index = 3;
        // Checks to see if there are more that just one node;
        if (List.head == null){
            return List;
        }

        LLNode temp = List.head;
        // Checks to see if it is the head node that is to be deleted.
        if (index == 0){
            // Removes the head node and changes the head node to the next node in the list.
            List.head = temp.next;
            return List;
        }

        // Finds the node before the one to be deleted.
        for(int i = 0; temp != null && i < index - 1; i++){
           temp = temp.next;

        }

        // Checks to see if the index is more than the length of the list.
        if (temp == null || temp.next == null){
            return List;
        }

        // Changes the pointer of the node before the one to be deleted to point to the one after the one to be deleted.
        LLNode next = temp.next.next;
        // Removes the one to be deleted from the list.
        temp.next = next;
        return List;


    }

    // Searches the list for the target.
    // Has the parameters that are declared somewhere else, but need to be used here.
    public static void findNode(int data, LinkedList List, int target) {
        // Place holder for the node we are on currently. It starts out being the head node.
        LLNode currentNode = List.head;
        // Flag value to check if the value has been found in the list.
        boolean flag = false;

        // While loop that goes trough the loop and checks each value in the list.
        while(currentNode != null){
            // If statement catches if the value is in the list and uses a break statement to go back to the start of the while loop.
            if(currentNode.data == target){
                flag = true;
                break;
            }
            // Moves on the the next node to test it.
            currentNode = currentNode.next;
        }
    
        // If statement using the boolean flag to print if it is in the list or not.
        if(flag)
            System.out.println("The value is present in the list.");
        else
            System.out.println("The value is not present in the list.");
    }

        
    // Method that prints out the lists.
    // Made so it can be used after each other method in the program. The more method specific print statements are in the main method.
    public static void printNodes(LinkedList List) {
        LLNode temp = List.head;
        while (temp != null) {
            // Steps through each node and prints the data value in that node.
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        // Empty print statement to space out the output.
        System.out.println("");

    }

    public static void main(String[] args) {
        LinkedList List = new LinkedList();

        // Adding Nodes and printing them.
        List.addNode(90, List);
        List.addNode(23, List);
        List.addNode(2, List);
        List.addNode(50, List);
        List.addNode(86, List);
        System.out.println("The complete LinkedList.");
        printNodes(List);

        // Deleteing Nodes and printing them. 
       
        deleteNode(List);
        System.out.println("The LinkedList after deleteing node.");
        printNodes(List);

        // Finding a specific value.
        // The target value. If changed here, it does not need to be changed anywhere else.
        int target = 86;
        findNode(target, List, target);
        
    }

    // This was added on for the Ticket manager program.
    // this chunk of code was used above.
	void Enqueue(Object info, LinkedList queue) {
        if (head == null) {
            LLNode temp = new LLNode(info);
            head = temp;
            tail = temp;
        } else {
            // if there is more than one node it moves to the last node and adds one after
            // the tail node.
            tail.next = new LLNode(info);
            // Sets the value of the tail to the new node after the original tail node.
            tail = tail.next;
        }
       
    }

    // This was also added for the Ticket Manager program.
    // It removes the first ticket from the program.
    void Dequeue() {
        // If there are no tickets in the queue it will print the statement and return to the Ticket Manager file.
        if (this.head == null){
            System.out.println("There are no tickets in the queue.");
            return;
        }
        // Sets the next node after the first node to be the head node.
        System.out.println("The first ticket in the queue was removed. ");
        LLNode temp = this.head;
        this.head = this.head.next;
        // Says that if the head node is null then the tail value is also null because then the tail value would not exist.
        if (this.head == null)
            this.tail = null;
    }

   
}

