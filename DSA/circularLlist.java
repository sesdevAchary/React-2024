public class circularLlist {
    Node head = null ;   //Points to the first node.
    Node tail = null;   //Points to the last node.


    class Node {
        int data ;
        Node next;

        Node ( int data){
            this.data= data;
            this.next= null;
        }
    }


    public void addLast( int data){
        Node newNd = new Node(data);

        if(head == null ){
            head = newNd;tail=newNd;
            newNd.next= head;  //circular reference.//
        }
        else{
            tail.next = newNd;    //Link the current last node to the new one//
            tail= newNd;          //Update the tail reference points to the new node //
            tail.next=head;       //Re-link the new tail back to the head//
            


            // [10] → [20] → [30] → [40] ─┐
            //   ^                        |
            //   |________________________|
            //  head              tail



        }     
    }


    public void addFirst(int data){
        Node newNd= new Node (data);

        if( head == null){
            head = newNd; tail= newNd;newNd.next= head;
        }
        else{
            newNd.next=head; // Point new node to current head	Connects new to old first node//
            head=newNd;     //  Update head to new node	Makes new node the first in the list//
            tail.next=head;  // Update circular link	Makes last node point to new head//
        }
    }

    public void deleteFromFirst(){
        if ( head == null){
            System.out.print(" empty list");
            return;
        }
        if( head == tail){
            head.next=null;
            tail.next=null;
        }else{
            head=head.next;
            tail.next=head;
        }

    }
public void deleteLast(){
    if( head == null ){
        System.out.println( " empty list ");
    }

    if ( head == tail ){
        head = null ;
        tail = null;
    }else {
        Node current = head ;
        while ( current.next!= tail){
            current= current.next;

        }
        current.next = head ;
        tail = current;
    }


}


public void insertAtSpecificPlace(int data, int position){
    if(position <=1 || head == null){
        addFirst(data);  // If position is 1 or less, OR if the list is empty, insert at front.
        return ; 
    }

    Node current=head;
    int index = 0;

    while( index< position-1 && current.next != head){
        current=current.next;  //stopping at the node just before the target position.
        index++;
    }

    if( current.next ==  head){
    addLast(data);  //If the loop hit the end of the list before reaching position − 1, just add to the end.

    } else {
        Node newNd= new Node ( data);
        newNd.next = current.next;
        current.next = newNd;


    }


}


    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;        
        }

        Node current = head ;
        do{
            System.out.print(current.data + " -> ");
            current=current.next;

        } while(current!= head);

        System.out.println("back to head");
    }



    public static void main ( String args[]){
        circularLlist cll = new circularLlist();

        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        System.out.println("After adding last:");


        cll.addFirst(5);
        System.out.println("After adding first:");


        cll.deleteFromFirst();
        System.out.println("After deleting first:");

        cll.deleteLast();
        System.out.println("After deleting last:");

        cll.printList();


    }
}