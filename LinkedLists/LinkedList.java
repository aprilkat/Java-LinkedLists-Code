/*
    Author: April Bollinger
    Program: LinkedList
    Date: 2/20/2021
    Purpose: To learn about and understand how to make linked lists
 */

    // Main class
    public class LinkedList {
    
        LLNode head;


        // Method adding a node to the end of the linkedlist
        public LinkedList addNode(LinkedList LinkList, int newX) {

            // creating the new node with the new x value
            LLNode NewNode = new LLNode(newX);

            // Checking if there is a node in the list.
            // If not it is adding one as the head node
            if (head == null) {
                head = NewNode;

                // Setting the address of the next node as null
                NewNode.next = null;

            } else {
                LLNode lastNode = head;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode = NewNode;

            }

            return LinkList;
        }

        public void printinglist() {
            LLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }

        public void main(String[] args) {
            LinkedList LinkList = new LinkedList();
            LinkList = addNode(LinkList, 29);
            LinkList = addNode(LinkList, 5);
        }
    }