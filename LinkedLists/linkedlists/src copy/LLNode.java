/* 
    Author: April Bollinger
    Program: LLNode (Connected to LinkedList)
*/
    // This class is setting up the first node in the linked list
    public class LLNode {
        // initializing variables
        int data;
        LLNode next;
        String Name;
        String Problem;
        
        // Setting up the structure of the new nodes
        LLNode(int x) {
            data = x;
            next = null;
        }

        public void setData(int data, String Name, String Problem) {
            this.data = data;
            this.Name = Name;
            this.Problem = Problem;
        }


    }

