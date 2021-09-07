package BinaryTree.src;


/*
    Author: April Bollinger
    Program: LLNode (to be used with linkedlist.java)
    Purpose: This program sets up the structure of the nodes used in the linkedlist
*/


// A class with various constructers for both the LinkedList.java and the TicketManager.java file.
public class LLNode {

    int data;
    LLNode next;
    LLNode tail;
    LLNode head;
    Object info;
 
    public void construct(LLNode head, LLNode tail, LLNode next) {
        this.head = head;
        this.tail = tail;
        this.next = next;
    }

	LLNode(int x) {
        data = x;
        next = null;
	}

	public LLNode(Object info) {
        this.info = info;
	}

    public void queue() {
        this.head = this.tail = null;
    }
	

}