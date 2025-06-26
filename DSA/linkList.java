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

///////    adding at the last /////

    // public void addlast(String data){
    //     Node newNd= new Node(data);
    //     if(head == null){
    //         head = newNd;
    //         return ;
    //     }
    //     Node current=head;
    //     while(current.next!= null){
    //         current=current.next;
    //     }
    //     current.next=newNd;
    // }
///// deleting the first //////


// public void deleteFirst(){
//     if(head == null){
//         System.out.println(" list is empty , no need to delete")        ;
//     return ;
//     }
//     head=head.next;  // just shift the head to the next node.//
// }


///// delete last  ///////

// public void deleteLast(){
//     if (head == null){
//         System.out.print("empty array");
//         return;
//     }
//     if(head.next==null){
//         head=null; // only one node
//         return ; 
//     }
//     node.current= head;
//     while(current.next.next!= null){    // ensures current stops at the second-last node. //
//         current=current.next;         // increasing the loop //
//     }
//     current.next=null;        // assigning the middle as last and deleting the last node //
// }


////// searching the value ///////

// public int search (int key){
//     Node current = head;
//     int index =0;
//     while(current != null){
//         if ( current.data == key )
//         return index;
    
//     current=current.next;
//     index ++;
//                 System.out.print(" asset found "+ index);

//     }
//   return -1;
// }


////// delete by value //////


// public value deleteByValue(int key){
    //   if ( head == null){
    //     System.out.println("No value found here ");
    //     return ;
    //   }
    //   if(head.data=key){
    //     head=head.next;
    //     return;
    //   }
    //   Node current=head ;    // Traversal pointer. It will always point to the node just before the one we’re testing.//
    //   while ( current.next != null && current.next.data=key){
    //     current=current.next;
    //   }

    //   if(current.next == null )
    //   System.out.println(" value was unavailable");
    //   else
    //   current.next = current.next.next;
// }

///// the same above we can do with the help of string key value too ///////

// public void deleteByValue(String key){
//     if ( head == null){
//         System.out.println(" not found ");
//         return;
//     }

//         // 2. Does the head itself contain the key?
//     if( head.data.equals(key)){
//         head = head.next ;
//         return;
//     }


//     Node current=head;

//         // 3. Walk until we’re right before the target (or end of list)
//     while(current.next != null && !current.next.data.equals(key)){
//         current=current.next;
//     }

//         // 4. Did we find it?
//     if(current.next == null){
//         System.out.print("value not found ");
//     }
//     else
//     {
//         curr.next = curr.next.next; // bypass the node, deleting it

//     }
// }



////// reversing through the iterative method //////


// public void reverseItr(){
    
//     Node next;
//     Node current=head;
//     Node previous = null;

//     while(current!= null){
//         next=current.next;       // stores the next value
//         current.next=previous;   // Now b → a instead of b → c. (reverse ptr)
//         previous = current;      // // move prev forward
//         current=next;            // // move current  forward
//     }
//     head = prev; // finally update head
 // }


////// reversing through the recursive  method //////



// public Node reverseRecursive(Node head){
//     if ( head == null || head.next == null){
//         SYstem.out.println("No element found ");
//         return head ;
//     }
    
//     Node newhd = reverseRecursive(head.next);   // Reverse everything after head  //
//     head.next.next=head;             // assigning prev value to head next --- makes d → c  //
//     head.next = null;               //  cuts c → d, so it doesn't form a cycle   //
// }
// public void reverseRecursiveCaller() {
//     head = reverseRecursive(head);
// }



//// printing the link list //////


// public int countNd(){
//     int count =0;
//     Node current=head;  

//     while( current!= null) {
//     count++;
//     current=current.next;
//     }
//     return count;
// }



///// obtaining the middle value /////

/// slow moves 1 step, fast moves 2 steps.........When fast reaches end, slow will be at middle///

// public int middleVal(){
//     if ( head == null){
//         System.out.println(" no such node is present");
//     }

//     Node slow= head; Node fast = head;

//     while ( fast!= null || fast.next != nul){
//         slow=  slow.next;   fast = fast.next.next;
//     }

//         System.out.println("Middle node is: " + slow.data);

// }



////// REMOVING Nth NODE FROM END OF LIST /////////
 
 public ListNode removeNthElementFromEnd( ListNode head , int n){
    if( head.next == null )
    return null;

    //size//
    int size = 0; ListNode current=head;
    while( current!=null){
        current=current.next;     //     // 2. Find the node before the one to delete //
         size ++;
    }

    int indexToSearch = size -n;
    if (indexToSearch == 0) {
        // remove the head
        return head.next;
    }

    ListNode prev=head;  int prev =1;
    while( i < indexToSearch ){
        prev=prev.next; i++ ;
    }

    prev.next = prev.next.next;
    return head;
 }


////// checking for CYCLE in a LinkList //////


public boolean hasCycle(){
    Node slow = head;
    Node fast= head;

    while(fast!= null && fast.next != null){
        slow = slow.next ;     // slow moves 1 step, 
        fast = fast.next.next; // fast moves 2 steps

        if(slow==fast)   // If there's a loop, they'll eventually meet (like runners on a track)
        return true;   
    }
     
     return false;      // If no loop, fast reaches end

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

        // ll.addlast("a");
        // ll.addlast("b");
        // ll.addlast("c");
        // ll.addlast("d");
        // ll.addlast("e");
        // ll.addlast("f");

        // ll.search("c");

        // ll.deleteByValue(3);
        // ll.deleteFirst();

        // ll.countNd();
        //ll.middleVal();



        
    // // Creating a manual cycle: last node points back to second
    // list.head.next.next.next = list.head.next;

    // System.out.println("Cycle detected? " + list.hasCycle()); // Output: true



        ll.PrintList(); 
    }
}

















