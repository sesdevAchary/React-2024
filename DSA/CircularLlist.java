// public class circularLlist {
//     Node head = null ;   //Points to the first node.
//     Node tail = null;   //Points to the last node.


//     class Node {
//         int data ;
//         Node next;

//         Node ( int data){
//             this.data= data;
//             this.next= null;
//         }
//     }


//     public void addLast( int data){
//         Node newNd = new Node(data);

//         if(head == null ){
//             head = newNd;tail=newNd;
//             newNd.next= head;  //circular reference.//
//         }
//         else{
//             tail.next = newNd;    //Link the current last node to the new one//
//             tail= newNd;          //Update the tail reference points to the new node //
//             tail.next=head;       //Re-link the new tail back to the head//
            


//             // [10] → [20] → [30] → [40] ─┐
//             //   ^                        |
//             //   |________________________|
//             //  head              tail



//         }     
//     }


//     public void addFirst(int data){
//         Node newNd= new Node (data);

//         if( head == null){
//             head = newNd; tail= newNd;newNd.next= head;
//         }
//         else{
//             newNd.next=head; // Point new node to current head	Connects new to old first node//
//             head=newNd;     //  Update head to new node	Makes new node the first in the list//
//             tail.next=head;  // Update circular link	Makes last node point to new head//
//         }
//     }

//     public void deleteFromFirst(){
//         if ( head == null){
//             System.out.print(" empty list");
//             return;
//         }
//         if( head == tail){
//             head.next=null;
//             tail.next=null;
//         }else{
//             head=head.next;
//             tail.next=head;
//         }

//     }
// public void deleteLast(){
//     if( head == null ){
//         System.out.println( " empty list ");
//     }

//     if ( head == tail ){
//         head = null ;
//         tail = null;
//     }else {
//         Node current = head ;
//         while ( current.next!= tail){
//             current= current.next;

//         }
//         current.next = head ;
//         tail = current;
//     }


// }


// public void insertAtSpecificPlace(int data, int position){
//     if(position <=1 || head == null){
//         addFirst(data);  // If position is 1 or less, OR if the list is empty, insert at front.
//         return ; 
//     }

//     Node current=head;
//     int index = 0;

//     while( index< position-1 && current.next != head){
//         current=current.next;  //stopping at the node just before the target position.
//         index++;
//     }

//     if( current.next ==  head){
//     addLast(data);  //If the loop hit the end of the list before reaching position − 1, just add to the end.

//     } else {
//         Node newNd= new Node ( data);
//         newNd.next = current.next;
//         current.next = newNd;


//     }


// }

// //// search and Return boolean value ///////
//     public boolean search (int target){
//         if(head == null) return false;

//         Node current=head;
//         do{
//             if(current.data == target )return true;
//             current = current.next;
//         }while(current != head);
//         return false;

//     }


//      /** Updates first node whose value == oldVal to newVal. */
// public boolean update ( int oldVal,int newVal){
//     if(head == null) return false;
//     Node current = head;
//     do{
// if ( current.data == oldVal){
//     current.data = newVal;
//     return true;
// }
// current=current.next;
//     }while( current != head);
// }

// public int  update( int oldV, int newV){
//     if(head == null) return false;

//     Node current = head ;
//     int index = 0;

//     do{
//         if( current.data == oldV){
//             current.data = newV;
//             return index ;
//         }
//         current = current.next;
//     } while ( current != head);
    
//     return -1 ; // old value not found //
// }


//     public void printList(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;        
//         }

//         Node current = head ;
//         do{
//             System.out.print(current.data + " -> ");
//             current=current.next;

//         } while(current!= head);
// /* Use a do-while loop because:must check at least one node even if head == tail.
// A regular while could skip checking the first node in circular structure.
// */
//         System.out.println("back to head");
//     }



//     public static void main ( String args[]){
//         circularLlist cll = new circularLlist();

//         cll.addLast(10);
//         cll.addLast(20);
//         cll.addLast(30);
//         System.out.println("After adding last:");


//         cll.addFirst(5);
//         System.out.println("After adding first:");


//         cll.deleteFromFirst();
//         System.out.println("After deleting first:");

//         cll.deleteLast();
//         System.out.println("After deleting last:");


//         cll.insertAtPosition(15, 3);      // 5 → 10 → 15 → 20 → 30
//         System.out.println("inserting at index 3:");


//     //    cll.update(10,90);
//     //    System.out.println("updating old value, the new value is:");

//     int updateIndex = cll.update(10,70);

//     if ( updateIndex != -1){
//         System.out.println(" value updated at index" + updateIndex);
//     }
//     else{
//         System.out.println(" value not found");
//     }


//         cll.printList();


//     }
// }



// class BrowseHistory {
//     Node current ;


//     class Node{
//         String url; // to hold the webpage like xyz.com//
//         Node next; // points to the next visited page//
//         Node prev; // points to the prev vstd page //

//         Node(String url){
//             this.url=url;  // con that stores the url into the node //
//         }
//     }

//     public BrowseHistory(homePage){
//         current= BrowseHistory(homePage); // when a browser is opened , starts on homepage //
        
//     }
// }





public class CircularLlist{
    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            //It initializes the data field. (next) is implicitly null at this point (default)
        }
    }

public void addFirst( int data){
    Node newNd = new Node(data);
    if ( head == null){
        head = tail = newNd;
        tail.next = head;
    }
    else{
        newNd.next= head;
        head = newNd;
        tail.next = head;  // Update circular link
    }
}


public void addLast(int data){
        Node newNd = new Node(data);//A linked list is made up of Node objects.So to insert, you first have to make a node.

        if ( head == null )
        {
            head = tail = newNd;
            tail.next= head;

        }else{
            tail.next = newNd;
            tail=newNd;
            tail.next = head;
        }
}

public void insertAtMiddle(int data , int position){
    if (position <= 1 || head == null) {
            addFirst(data);
            return;
    }

    Node newNd = new Node(data);
    Node current = data ;
    int index = 1;
    while( index<position-1|| current.next != head  ){
        current = current.next;
        index++;

    }
    newNd.next = current.next;
    current.next = newNd;

    if(current==tail){
        tail=newNd;
    }

}



public void deleteFirst(){
    if( head == null){
        System.out.println(" empty list");
    }

    if( head == tail){
        head = tail = null;
    }
    else{
        head=head.next;
        tail.next=head;
    }
}


public void deleteLast(){
     if( head == null){
        System.out.println(" empty list");
    }

    if( head == tail){
        head = tail = null;
    }else{
        Node current= head;
        while(current.next != tail ){
            current = current.next;
        }
        current.next = head;
        tail = current;
    }


}


public void deleteByValue(int value ){
    if ( head == null){
        System.out.print(" not found the list");
        return ;
    }

    if ( head.data = value){
        deleteLast();
    }

    Node current = head ;
    while ( current .next != head && current.next.data != value){
        current=current.next;
    }

    if( current.next.data == value){
        tail = current;
    }
    current.next.next= current.next;
    else{
          System.out.println("Value not found.");
    }
}


public int search( int value){
    if ( head == null) return -1;

    Node current = head ;
    int index =0; 
    do{
        if( current.data == value){
            return index;
        }
           current = current.next;
           index ++;
    }while( current != head );

   
        return -1;
    
}


public int update( int oldv , int newv){
    if(head == null) return -1;

    Node current = head;
    int index =0;

    do{
        if(current.value == oldv){
            current.data = newValue;
                return index;
        }

        current=current.index;
        index ++;
    }while (current != head);
}

public int countNode(){
    if(head==null) return 0;

    int count = 0;
    Node current = head ;

    do{
        count ++
        current = current.next;
    }while(current != head);

    return count;
}



public void reverse(){
    if( head == null || head.next== head) return ;

    Node prev = tail , current = head , next;

    do{
        next = current.next;    // save the next val
        current.next=prev;     // reverse the ptr
        prev = current;        //prev++
        currenrt = next;       // current ++
    }while(current!= head);


    tail = head ; head = tail // swapping the value of head and tail ..

}


public void printList(){
    if ( head == null){
        System.out.println("List is empty.");
        return;
    }

    Node current = head;
    do{
        System.out.println( current.data+"->");
        current=current.next;

    }while ( current != head );

    System.out.println("(Back to Head: " + head.data + ")"); // to ensure that head data is there the last  //

}


public static void main(String[] args) {
        CircularLlist cll = new CircularLlist();
        //cll.printList();   Empty
        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        cll.addLast(40);
        cll.addLast(50);
        cll.printList();

        cll.insertAtPosition(20, 2);
        cll.printList();

        cll.deleteFirst();
        cll.deleteLast();
        cll.deleteByValue(100);
        cll.printList();  


        CircularLlist cll = new CircularLlist();
        int value = 50;
        int result = cll.search(value);
        if( result != -1){
            System.out.println("Value " + value + " found at index: " + result);
        }else {
            System.out.println("Value " + value + " not found in the list.");
        }

        int pos = cll.update(20, 25);
        System.out.println("Updated at index: " + pos);     // index of update
        cll.printList();    



        System.out.println("Node count: " + cll.countNode());

        System.out.println("\n🔄 Reversed Circular Linked List:" + cll.reverse());
        cll.printList();




    }
}

    


