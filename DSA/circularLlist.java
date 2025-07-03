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
            newNd.next= head;
        }
    }
}