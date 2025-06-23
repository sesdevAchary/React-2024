class linkList{
    Node head ;
    class Node{
         String data;
         Node next;
        Node(String data){
            this.data = data ;
            this.next= null;
        }
    }

    // public void addfront(String data){
    //    Node newNd = new Node (data);
    //    if(head == null){
    //     head = newNd;
    //     return;
    //    }
    //    else{
    //     newNd.next = head;
    //     head = newNd;
    //    }

    // }


    public void
     addlast(String data){
        Node newNd= new Node(data);
        if(head == null){
            head = newNd;
        }
        Node current=head;
        while(current.next!= null){
            current=current.next;
        }
        current.next=newNd;
    }

public void PrintList(){
    Node current = head;

    while(current != null){
        System.out.println(current.data+"->");
        current= current.next;
    }
}
    public static void main ( String[] args){
        linkList ll = new linkList();
        ll.addlast("a");
        ll.addlast("b");
        ll.addlast("c");
        ll.PrintList(); 
    }
}











public class linkList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the end
    public void addLast(String data) {
        Node newNd = new Node(data);
        if (head == null) {
            head = newNd;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNd;
    }

    public void PrintList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkList ll = new linkList();
        ll.addLast("a");
        ll.addLast("b");
        ll.addLast("c");

        ll.PrintList();  // Output: a → b → c → null
    }
}

public void addfront(String data){
   Node newNd = new Node(data);
   newNd.next = head;  // Connect to existing list
   head = newNd;       // Move head to new node
}
