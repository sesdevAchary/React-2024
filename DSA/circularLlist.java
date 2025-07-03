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
            newNd.next= head;  //ircular reference.//
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
}