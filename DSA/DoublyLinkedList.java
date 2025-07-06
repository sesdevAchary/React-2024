public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNd = new Node(data);

        if (head == null) {
            head = newNd;
            return;
        }

        Node current = head;

        // Traverse till the last node
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNd;
        newNd.prev = current;
    }



public void addFirst( int data ){
               if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;  // point forward to current head
        head.prev = newNode;  // point back from old head
        head = newNode;       // update head to new node
}
    public void printForward() {
        Node current = head;
        System.out.println("Printing the DLL:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(5);
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.add(50);
        dll.add(60);

        dll.prepend(0);  // insert at beginning
        dll.prepend(1); 
        dll.prepend(2);
        dll.prepend(3);
        dll.prepend(4);
        

        dll.printForward();
    }
}
