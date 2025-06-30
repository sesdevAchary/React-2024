import java.util.*;

// // class linkList{
// //     Node head ;
// //     class Node{
// //          String data;
// //          Node next;
// //         Node(String data){
// //             this.data = data ;
// //             this.next= null;
// //         }
// //     }


//   //2//
//     // public void addfront(String data){
//     //    Node newNd = new Node (data);
//     //    if(head == null){
//     //     head = newNd;
//     //     return;
//     //    }
//     //    else{
//     //     newNd.next = head;
//     //     head = newNd;
//     //    }

//     // }

// ///////    adding at the last /////
//     //1//
//     // public void addlast(String data){
//     //     Node newNd= new Node(data);
//     //     if(head == null){
//     //         head = newNd;
//     //         return ;
//     //     }
//     //     Node current=head;
//     //     while(current.next!= null){
//     //         current=current.next;
//     //     }
//     //     current.next=newNd;
//     // }

// ///// deleting the first //////

// //5//
// // public void deleteFirst(){
// //     if(head == null){
// //         System.out.println(" list is empty , no need to delete")        ;
// //     return ;
// //     }
// //     head=head.next;  // just shift the head to the next node.//
// // }


// ///// delete last  ///////

// // public void deleteLast(){
// //     if (head == null){
// //         System.out.print("empty array");
// //         return;
// //     }
// //     if(head.next==null){
// //         head=null; // only one node
// //         return ; 
// //     }
// //     node.current= head;
// //     while(current.next.next!= null){    // ensures current stops at the second-last node. //
// //         current=current.next;         // increasing the loop //
// //     }
// //     current.next=null;        // assigning the middle as last and deleting the last node //
// // }


// ////// searching the value ///////
// //3//
// // public int search (int key){
// //     Node current = head;
// //     int index =0;
// //     while(current != null){
// //         if ( current.data == key )
// //         return index;
    
// //     current=current.next;
// //     index ++;
// //                 System.out.print(" asset found "+ index);

// //     }
// //   return -1;
// // }


// ////// delete by value //////

// //4//
// // public value deleteByValue(int key){
//     //   if ( head == null){
//     //     System.out.println("No value found here ");
//     //     return ;
//     //   }
//     //   if(head.data=key){
//     //     head=head.next;
//     //     return;
//     //   }
//     //   Node current=head ;    // Traversal pointer. It will always point to the node just before the one we’re testing.//
//     //   while ( current.next != null && current.next.data=key){
//     //     current=current.next;
//     //   }

//     //   if(current.next == null )
//     //   System.out.println(" value was unavailable");
//     //   else
//     //   current.next = current.next.next;
// // }

// ///// the same above we can do with the help of string key value too ///////
// //4//
// // public void deleteByValue(String key){
// //     if ( head == null){
// //         System.out.println(" not found ");
// //         return;
// //     }

// //         // 2. Does the head itself contain the key?
// //     if( head.data.equals(key)){
// //         head = head.next ;
// //         return;
// //     }


// //     Node current=head;

// //         // 3. Walk until we’re right before the target (or end of list)
// //     while(current.next != null && !current.next.data.equals(key)){
// //         current=current.next;
// //     }

// //         // 4. Did we find it?
// //     if(current.next == null){
// //         System.out.print("value not found ");
// //     }
// //     else
// //     {
// //         curr.next = curr.next.next; // bypass the node, deleting it

// //     }
// // }



// ////// reversing through the iterative method //////

// //6//
// // public void reverseItr(){
    
// //     Node next;
// //     Node current=head;
// //     Node previous = null;

// //     while(current!= null){
// //         next=current.next;       // stores the next value
// //         current.next=previous;   // Now b → a instead of b → c. (reverse ptr)
// //         previous = current;      // // move prev forward
// //         current=next;            // // move current  forward
// //     }
// //     head = prev; // finally update head
//  // }


// ////// reversing through the recursive  method //////


// //7//
// // public Node reverseRecursive(Node head){
// //     if ( head == null || head.next == null){
// //         SYstem.out.println("No element found ");
// //         return head ;
// //     }
    
// //     Node newhd = reverseRecursive(head.next);   // Reverse everything after head  //
// //     head.next.next=head;             // assigning prev value to head next --- makes d → c  //
// //     head.next = null;               //  cuts c → d, so it doesn't form a cycle   //
// // }
// // public void reverseRecursiveCaller() {
// //     head = reverseRecursive(head);
// // }



// //// printing the link list //////

// //8//
// // public int countNd(){
// //     int count =0;
// //     Node current=head;  

// //     while( current!= null) {
// //     count++;
// //     current=current.next;
// //     }
// //     return count;
// // }



// ///// obtaining the middle value /////

// //9//
// /// slow moves 1 step, fast moves 2 steps.........When fast reaches end, slow will be at middle///

// // public int middleVal(){
// //     if ( head == null){
// //         System.out.println(" no such node is present");
// //     }

// //     Node slow= head; Node fast = head;

// //     while ( fast!= null || fast.next != nul){
// //         slow=  slow.next;   fast = fast.next.next;
// //     }

// //         System.out.println("Middle node is: " + slow.data);

// // }



// ////// REMOVING Nth NODE FROM END OF LIST /////////
//  //10//
// //  public ListNode removeNthElementFromEnd( ListNode head , int n){
// //     if( head.next == null )
// //     return null;

// //     //size//
// //     int size = 0; ListNode current=head;
// //     while( current!=null){
// //         current=current.next;     //     // 2. Find the node before the one to delete //
// //          size ++;
// //     }

// //     int indexToSearch = size -n;
// //     if (indexToSearch == 0) {
// //         // remove the head
// //         return head.next;
// //     }

// //     ListNode prev=head;  int prev =1;
// //     while( i < indexToSearch ){
// //         prev=prev.next; i++ ;
// //     }

// //     prev.next = prev.next.next;
// //     return head;
// //  }


// ////// checking for CYCLE in a LinkList //////


// // public boolean hasCycle(){
// //     Node slow = head;
// //     Node fast= head;

// //     while(fast!= null && fast.next != null){
// //         slow = slow.next ;     // slow moves 1 step, 
// //         fast = fast.next.next; // fast moves 2 steps

// //         if(slow==fast)   // If there's a loop, they'll eventually meet (like runners on a track)
// //         return true;   
// //     }
     
// //      return false;      // If no loop, fast reaches end

// // } 


// // public void PrintList(){
// //     Node current = head;

// //     while(current != null){
// //         System.out.print(current.data+"->");
// //         current= current.next;
// //     }
// // }





//     public static void main ( String[] args){
//         linkList ll = new linkList();

//         //1//ll.addlast("a");
//         // ll.addlast("b");
//         // ll.addlast("c");
//         // ll.addlast("d");
//         // ll.addlast("e");
//         // ll.addlast("f");

//         //2//ll.addfirst("0")

//         //3// ll.search("c");

//         //4// ll.deleteByValue(3);
//         //5// ll.deleteFirst();


//         //6//ll.reverseItr();
//         //7//ll.reverseRecursive;()

//         //8// ll.countNd();
//         //9//ll.middleVal();


//     //10// Creating a manual cycle: last node points back to second
//     // list.head.next.next.next = list.head.next;
//     // System.out.println("Cycle detected? " + list.hasCycle()); // Output: true



//         ll.PrintList(); 
//     }
// }

 public void PrintList(){
     Node current = head;

     while(current != null){
         System.out.print(current.data+"->");
         current= current.next;
    }
 }


 public int search (int key){
  Node current = head;
    int index =0;
    while(current != null){
       if ( current.data == key )
      return index;
    
     current=current.next;
     index ++;
                 System.out.print(" asset found "+ index);

     }
  return -1;
 }






class linkList{
    Node head;

   static  class Node{
        int data; Node next;


        Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    public void addLast(int data){
        Node newNd = new Node(data);

        if(head == null){
            head= newNd ;
            return;
        }

        Node current=head;
        while(current.next != null){
            current=current.next;
        }
        current.next = newNd;

    }

// public static  Node mergeTwoList(Node head1, Node head2){
//     // takes 2 sorted LL as params then return head of a new merged sorted list//
//     Node dummy = new Node(-1);
//     Node tail = dummy ;


//     while( head1!= null && head2!= null){
//         if(head1.data <= head2.data){    // if h1<h2 => dummy- list1-list2
//             tail.next= head1;
//             head1= head1.next;
//         }
//         else{                           // if h2<h1 => dummy- list2-list1
//             tail.next = head2;
//             head2 = head2.next;
//         }
//         tail = tail.next;
//     }
 
//     if(head1 !=null)tail.next=head1;
//     if(head2 !=null)tail.next=head2;


//      return dummy.next;

// }

// public ListNode reverse( ListNode head){
//     ListNode prev = null;
//     ListNode current=head;

//     while ( current != null){
//         Node next  = current.next ; // save first //
//         current.next = prev;        // reverse the node //
//         prev = current;             // move prev //
//         current=next;              // move curr //
//     }
//     return prev;
// }

// public ListNode findMiddle ( ListNode head){
//     ListNode slow =  head;
//     ListNode fast = head ;

//     while(fast != null && fast.next != null){
//         slow = slow.next;
//         fast = fast.next.next;
//     }
//     return slow;

// }


// public boolean isPalindrome(ListNode head ){
//       if( head == null || head.next == null ){
//         return true;
//       }

//       ListNode middle = findMiddle(head); // end of the first half //
//       ListNode secondHalfStart= reverse(middle.next);


//       ListNode firstHalfStart = head ;
//       while ( secondHalfStart != null ){
//         if ( firstHalfStart.value != secondHalfStart.value )
//         return false;

    
//       firstHalfStart= firstHalfStart.next ;
//       secondHalfStart=secondHalfStart.next ;
//       }
//       return true;

//}
    public void printList(){
        Node current = head;

        while(current != null){
            System.out.print( current.data + " -> ");
             current=current.next;

        }
         System.out.println ( " NULL ");
    }


/////// OrElse we can also the STACK method to use /////////

   public boolean palindromeCheck( ){
     Stack<Integer> stack = new Stack();  // We use a stack to store all the node values in reverse order LIFO //
     Node current = head ;

   

// pushing elements to the stack //
while ( current != null){
    stack.push(current.data);
    current = current.next;
}

// comparing each value of the stack is palindrome //

current = head;
while ( current != null){
    if (current.data != stack.pop()){     // For each node, pop a value from the stack and compare it.//
        return false;
    }
    current = current.next ;
}
return true ;

   }


    public static void main ( String args[]){

        linkList list1 = new linkList();

        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(30);
        list1.addLast(20);
        list1.addLast(10);


        // linkList list2 = new linkList();
        // list2.addLast(2);
        // list2.addLast(4);
        // list2.addLast(6);

     System.out.print("List 1: ");
    list1.printList();

    // System.out.print("List 2: ");
    // list2.printList();

                         // Merge the lists
        // Node mergedHead = linkList.mergeTwoList(list1.head, list2.head);

        // // Print merged list
        // System.out.print("Merged List: ");
        // Node current = mergedHead;
        // while (current != null) {
        //     System.out.print(current.data + " → ");
        //     current = current.next;
        //     }
        // System.out.println("null");


    //                  //  printing the palindrome //
    //         System.out.print(" Is it a palindrome ?" + list1.isPalindrome(list1.head));


    //         // finding the middle //
    //         Node mid= list1.findMiddle(list1.head);
    //         System.out.println(" the middle value  is "+ mid.data);

    //           // Reverse list and print
    // Node reversedHead = list1.reverse(list1.head);
    // System.out.print("Reversed List: ");
    // Node current = reversedHead;
    // while (current != null) {
    //     System.out.print(current.data + " -> ");
    //     current = current.next;
    // }
    // System.out.println("NULL");

  if ( list1.palindromeCheck()){
                System.out.println("✅ It is a Palindrome!");

  }else{
                System.out.println("❌ Not a Palindrome.");

  }


    }
}








































// class Node:
//     def __init__(self, data):
//         self.data = data
//         self.next = None
// def insert_at_beginning(head, data):
//     new_node = Node(data)
//     new_node.next = head
//     return new_node
// def insert_at_end(head, data):
//     new_node = Node(data)
//     if not head:
//         return new_node
//     temp = head
//     while temp.next:
//         temp = temp.next
//     temp.next = new_node
//     return head
// def reverse_list(head):
//     prev = None
//     while head:
//         next_node = head.next
//         head.next = prev
//         prev = head
//         head = next_node
//     return prev
// def find_middle(head):
//     slow = fast = head
//     while fast and fast.next:
//         slow = slow.next
//         fast = fast.next.next
//     return slow
// def has_cycle(head):
//     slow = fast = head
//     while fast and fast.next:
//         slow = slow.next
//         fast = fast.next.next
//         if slow == fast:
//             return True
//     return False
// def length(head):
//     count = 0
//     while head:
//         count += 1
//         head = head.next
//     return count
// def merge_lists(l1, l2):
//     dummy = Node(0)
//     tail = dummy
//     while l1 and l2:
//         if l1.data < l2.data:
//             tail.next, l1 = l1, l1.next
//         else:
//             tail.next, l2 = l2, l2.next
//         tail = tail.next
//     tail.next = l1 or l2
//     return dummy.next
// def is_palindrome(head):
//     vals = []
//     while head:
//         vals.append(head.data)
//         head = head.next
//     return vals == vals[::-1]
// def get_intersection(head1, head2):
//     a, b = head1, head2
//     while a != b:
//         a = a.next if a else head2
//         b = b.next if b else head1
//     return a
// class RandomNode:
//     def __init__(self, val, next=None, random=None):
//         self.val = val
//         self.next = next
//         self.random = random

// def copy_random_list(head):
//     if not head:
//         return None
//     m = {}
//     curr = head
//     while curr:
//         m[curr] = RandomNode(curr.val)
//         curr = curr.next
//     curr = head
//     while curr:
//         m[curr].next = m.get(curr.next)
//         m[curr].random = m.get(curr.random)
//         curr = curr.next
//     return m[head]
// def find_middle(head):
//     slow = fast = head
//     while fast and fast.next:
//         slow = slow.next
//         fast = fast.next.next
//     return slow
