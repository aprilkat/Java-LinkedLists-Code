/*
Copy of Mrs. Markley's program

    Author: April Bollinger
    Program: LinkedList
    Date: 2/20/2021
    Purpose: To learn about and understand how to make linked lists
 */

    // Main class
    public class linkedlist {
    
        LLNode head;

        // Method adding a node to the end of the linkedlist
        public static linkedlist addNode(linkedlist LinkList, int newX) {

            // creating the new node with the new x value
            LLNode NewNode = new LLNode(newX);

            // Checking if there is a node in the list.
            // If not it is adding one as the head node
            if (LinkList.head == null) {
                LinkList.head = NewNode;

                // Setting the address of the next node as null

            } else {
                LLNode lastNode = LinkList.head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = NewNode;

            }

            return LinkList;
        }

        public static void printinglist(linkedlist LinkList) {
            LLNode currentNode = LinkList.head;
            while (currentNode != null) {
                System.out.print(currentNode.data + ", ");
                currentNode = currentNode.next;
            }
        }

        public static void main(String[] args) {
            linkedlist LinkList = new linkedlist();
            LinkList = addNode(LinkList, 30);
            LinkList = addNode(LinkList, 5);
            printinglist(LinkList);
        }
    }