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


   /* isnerting new node at the last part */
   
    public void append(int data) {
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


    /* isnerting new node at the initial  part */

public void prepend( int data ){
    Node newNode = new Node(data);
               if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;  // point forward to current head
        head.prev = newNode;  // point back from old head
        head = newNode;       // update head to new node
}

     /* isnerting new node at the middle part */

public void insertAtPosition( int data , int position ){
    if( position<= 1){
        prepend(data);
        return;
    }

    Node newNd= new Node(data);
    Node current = head ;
    int index = 1;

    while(current != null && index<position-1){
        current = current.next;
        index ++ ;
    }
    if ( current == null || current.next == null){
        append(data);
        return ;
    }else{
        newNd.next=current.next;
        newNd.prev=current;
        current.next.prev=newNd;
        current.next=newNd;
    }
} 

   /* Deleting  node form the first position  */

public void deleteBeginning( ){
    if ( head == null ){
        System.out.println("List is already empty.");
        return;
    }

    head = head.next;

    if( head != null){
        head.prev = null;
    }
}


     /* Printing the List by backward  Traversal 
      public void printBackward(){
        if( head == null){
            System.out.println(" empty list");
            return ;
        }

        Node current = head ;
        while( current.next != null){
            current = current.next;
        }
        //print in reverse//
        System.out.println(" printing in reverse ");
        while( current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
      }
       */
    /* deleting a node from the last poise */
 public void deleteFromEnd() {
    if (head == null) {
        System.out.println("Empty list");
        return;
    }

    if (head.next == null) {
        head = null;
        return;
    }

    Node current = head;

    // Traverse to the last node
    while (current.next != null) {
        current = current.next;
    }

    // Remove the last node
    if (current.prev != null) {
        current.prev.next = null;
    }
}


        /* deleting a node from the middle  poise with a certain value */

        public deleteByValue( int value){
            if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        if ( current.data ==  value){
            deleteBeginning();
            return ;
        }
        while ( current != null && current.data != value ){
            current=current.next;
        }

        if ( current = null){
            System.out.println("value not found ");
            return ;
        }
        if( current.next == null){
            deleteFromEnd();
        }
        
        ccurrent.prev.next=current.next;
        current.next.prev=current.prev;

        
        }



        /* searching for a value */

        public boolean search(int target ){
            Node current = head;
            while ( current != null){
                if( current.data == target)
                return true;

                current = current.next;

            }
            return false;
        }

        /* updating the value and returning the index value */

public int updateByIndex( int oldV , int newV){
    Node current = head ;
    int index = 0;

    while ( current != null){
        if( current.data == oldV){
            current.data =  newV ;
            return  index ;
        }
        current = curent.next;
        index ++;
    }
    return -1; //old value not found//
}


    // public void reverseFullList(){
    //     Node current = head ;
    //     Node temp = null;

    //     while( current != null){
    //         temp = current.prev;
    //         current.prev=current.next;
    //         current.next=temp;

    //         current = current.prev; // moving the ptr to next node //
    //     }
    //     // After loop, temp is at old tail. Set it as new head.
    //     if (temp != null) {
    //         head = temp.prev;
    //     }
    // }



/* Getting the Fulll length by counting it */
    public int getLength(){
     int count = 0;
     Node current = head ;

     while( current != null){
        count ++ ;
        current = current.next;
     }
     return count ;
    }


    /* converting a doubly linked list into Array Format */

    public int[] toArray(){
        List<Integer> list = new ArrayList<>();
        Node current = head;

        while ( current != null){
            list.add(current.data);
            current = current.next;
        }

        // convert list<Integer> to int[]//
        // dynamic to primitive type //

        int[] arr= new int[list.size()];
        for ( int i =0 ; i< list.size();i++){
            arr[i]= list.get(i);
        }
        return arr;
    }
 
 /* Printing the List by Traversal  */

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

        dll.append(5);
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.append(50);
        dll.append(60);

        dll.prepend(0);  // insert at beginning
        dll.prepend(1); 
        dll.prepend(2);
        dll.prepend(3);
        dll.prepend(4);
        

        dll.insertAtPosition(70,5);


        System.out.println("Before deletion:");
        dll.printForward();  

        dll.deleteBeginning();

        System.out.println("After deleting from beginning:");
        dll.printForward();  

         dll.deleteFromEnd();

        System.out.println("After deleting from end:");
        dll.printForward(); 


        dll.deleteByValue(20);

        System.out.println("After deleting 20:");
        dll.printForward(); 

        dll.search(60);


         int index = dll.updateByIndex(30, 300);
        if (index != -1) {
            System.out.println("Update by value (index): updated at position " + index);
        } else {
            System.out.println("Update by value (index): value not found");
        }
        dll.printForward();
    }


        dll.reverse();

        System.out.println("After reverse:");
        dll.printForward(); 


        System.out.println("Length: " + dll.getLength());


        int[] input = { 1,2,3,4,5,6,7,8,9,10};
        dll.toArray(input);
        System.out.println("After fromArray:");
        dll.printForward();



}











class BrowseHistory{
    Node current;

    class Node{
        String url; // stores the web address //
         Node next; // next page refernce
         Node prev; // prev page reference

       Node(String url){
        //Each Node represents a web page://
        this.url=url 
        //The this.url refers to the instance variable (field) of the Node class.
        // The right-hand url is the parameter passed into the constructor.
       }
    }



// when browser starts opens the homepage...cuurrent val points to the first node 
    public BrowseHistory( String homePage){
        current = new Node(homepage);
    }

    public void visit(String url){
        // new node with the url , a new current page ..
        Node newNd =  new Node(homePage); 

        current.next = null ; // cut off the forward history //
        newNd.prev = current ; // create the backward link ..set the ptr to point back to the current page
        current.next=newNd; //This sets the next pointer of the current page to point forward to the new node.
        current = newNd;
    }
  public void back(int steps) {
        while (steps > 0 && current.prev != null) {
            current = current.prev;
            steps--;
        }
    }

    
}









