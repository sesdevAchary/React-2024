package DSA.linkedList;

public class ReverseQueue {
    Node head;
    class Node{
        int data;Node next;
        Node(int data){
            this.next=null;this.data=data;
        }
    }

    public void reverseItr()
    {
        Node next;
        Node prev=null;
        Node current=head;

        while(current!=null){
            next=current.next;  // stores the next value
            current.next=prev;  // Now b → a instead of b → c. (reverse ptr)
            prev=current;       // move prev forward
            current=next;       // move current forward
        }
        head=prev;
    }

    public void printList(){
        Node current=head;

        while(current != null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
         System.out.println("null");
    }
    public static void main ( String args[])
    {
        ReverseQueue l= new ReverseQueue();
        l.reverseItr();
        l.printList();
    }

        
    
    
}











