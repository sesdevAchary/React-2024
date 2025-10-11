package DSA.linkedList;

public class linkList {
    class Node{
        int data;Node next;
        Node(int data){
            this.next=null;this.data=data;
        }
    }

    public void reverseItr()
    {
        Node head;
        
        Node next;
        Node prev=null;
        Node current=head;

        while(current!=null){
            next=current.next;  // stores the next value
            current.next=prev;
            prev=current;
            current=next;


        }
    }

        
    }
    
}
