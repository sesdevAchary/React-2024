

public class circularLlist{
    Node head=null;
    Node tail=null;

    class Node{
        int data;Node next;
        Node (int data){
            this.data=data;this.next=null;
        }
    }

    public void addLast(int data ){
        Node newhd= new Node(data);
        if(head == null){
            head=newhd;tail=newhd;newhd.next=head;
        }
        else{
            tail.next=newhd;  // Link the curr last node to the new one//
            tail=newhd;      //Update the tail reference points to the new node //
            tail.next=head;  //Re-link the new tail back to the head//
        }
    }
//             // [10] → [20] → [30] → [40] ─┐
//             //   ^                        |
//             //   |________________________|
//             //  head              tail

public void deleteLast(){
    if( head == null ){
        System.out.println( " empty list ");
    }

    if ( head == tail ){
        head = null ;
        tail = null;
    }else {
        Node current = head ;
        while ( current.next!= tail){
            current= current.next;

        }
        current.next = head ;
        tail = current;
    }


}
    public void deleteFromFirst(){
        if ( head == null){
            System.out.print(" empty list");
            return;
        }
        if( head == tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
            tail.next=head;
        }

    }

    public void addFirst(int data){
        Node newNd= new Node (data);

        if( head == null){
            head = newNd; tail= newNd;newNd.next= head;
        }
        else{
            newNd.next=head; // Point new node to current head	Connects new to old first node//
            head=newNd;     //  Update head to new node	Makes new node the first in the list//
            tail.next=head;  // Update circular link	Makes last node point to new head//
        }
    }

public void insertAtSpecificPlace(int data, int position){
    if(position <=1 || head== null){
        addFirst(data);
        return;
    }
    int index=0;Node current=head;
    while( index<position-1 && current.next != null){
        index+=1;current=current.next;
    }

    if(current.next == head)
    addLast(data);  //If the loop hit the end of the list before reaching position − 1, just add to the end.
    else{
        Node newhd= new Node(data);
        newhd.next=current.next;
        current.next=newhd;
    }
}

public Node searchVal(int target){
    if ( head == null){
        System.out.println("empty");
    }
    
        Node curr=head;int index=0;
        do{
            if(curr.data == target){
                System.out.print("found the value "+target+ "at the index"+index);
            return curr;
            }
            
            curr=curr.next;
            index+=1;

        }while(curr != head );
    
    System.out.print("Not found: " + target);
    return null;
}



boolean isCircular(){
    if(head == null)
    return true;

    Node temp= head.next;
    while(temp != null && temp != head){
        temp=temp.next;
    }
    return(temp==head);


}

Node convertToCircular(){
    if(head == null )return null;

    Node temp=head;
    while(temp.next != null){
        temp=temp.next;
    }
    temp.next=head; // make circular
    return head;
}

void splitNodes(Node head,Node[] halves){
    if(head == null) return;

    Node slow=head;Node fast=head;
    while(fast.next != head && fast.next.next != head){
        slow=slow.next; fast=fast.next.next;
    }
    return slow;

    Node head1=head;
    Node head2=slow.next;
    slow.next=head1; // make the first half circular//;


    Node temp=head2;
    while(temp != head){
        temp=temp.next;
    }
    temp.next=head2;

    halves[0]=head1;halves[1]=head2; //halves[0] = head of first half, halves[1] = head of second half.
}

public void printList(){
    if(head == null)
    System.out.print("empty");

Node curr=head;
do{
    System.out.print(curr.data + " -> ");
    curr=curr.next;
}while(curr != head);
System.out.println("(back to head)");
}

public static void main(String[] args){
    circularLlist cll=new circularLlist();

    cll.addLast(12);
    cll.addLast(13);
    cll.addLast(14);
    System.out.println("After adding last:"); //  12 -> 13 -> 14 -> (back to head)
    cll.printList();

    cll.addFirst(17);
    cll.addFirst(5);
    System.out.println("After adding first:"); //5 -> 17 -> 12 -> 13 -> 14 -> (back to head)
    cll.printList();

    cll.insertAtSpecificPlace(15, 3);    //  5 -> 17 -> 12 -> 15 -> 13 -> 14 -> (back to head)
    System.out.println("inserting at index 3:");
    cll.printList();    

    cll.searchVal(12);
    cll.printList();  

    System.out.println("Circular list? " + cll.isCircular());


}


}


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



