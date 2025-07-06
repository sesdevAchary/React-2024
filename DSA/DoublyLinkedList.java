class DoublyLinkedList{
    Node head;

    class Node{
        int data; Node next; Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }

     public DoublyLinkedList() {
        head = null;
    }



    public void append( int data){
        Node newNd = new Node(data);

        if( head == null){
            head = newNd;
            return;
        }

        Node current = head;
        while(current != null){
            current = current.next;
        }

        current.next= newNd;
        newNd.prev = current;
    }

public void printForward(){
    Node current = head ;
    System.out.println(" printing the dll");
    while( current != null){
        System.out.print(current.data + " ");
    current=current.next;
    }
    System.out.println();
}


    public static void main ( String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(5);
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.add(50);
        dll.add(60);



        dll.printForward();
    }
}