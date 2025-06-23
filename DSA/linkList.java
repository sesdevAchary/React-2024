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
    public void addfront(String data){
       Node newNd = new Node (data);
       if(head == null){
        head = newNd;
        return;
       }
       else{
        newNd.next = head;
        head = newNd;
       }

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
        ll.addfront("a");
        ll.addfront("b");
        ll.addfront("c");
        ll.PrintList(); 
    }
}