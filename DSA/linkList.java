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


    public void addlast(String data){
        Node newNd= new Node(data);
        if(head == null){
            head = newNd;
            return ;
        }
        Node current=head;
        while(current.next!= null){
            current=current.next;
        }
        current.next=newNd;
    }

// public void deleteFirst(){
//     if(head == null){
//         System.out.println(" list is empty , no need to delete")        ;
//     return ;
//     }
//     head=head.next;  // just shift the head to the next node.//
    
// }


public void deleteLast(){
    if (head == null){
        System.out.print("empty array");
        return;
    }
    if(head.next==null){
        head=null; // only one node
        return ; 
    }
    node.current= head;
    while(current.next.next!= null){
        current=current.next;
    }
    current.next=null;
}

public void PrintList(){
    Node current = head;

    while(current != null){
        System.out.print(current.data+"->");
        current= current.next;
    }
}
    public static void main ( String[] args){
        linkList ll = new linkList();

        ll.addlast("a");
        ll.addlast("b");
        ll.addlast("c");
        ll.addlast("d");
        ll.addlast("e");
        ll.addlast("f");

        // ll.deleteFirst();



        ll.PrintList(); 
    }
}









