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

  public int countNd(){
     int count =0;
    Node current=head;  

    while( current!= null) {
     count++;
     current=current.next;
     }
     return count;
// 
public void PrintList(){
     Node current = head;

     while(current != null){
         System.out.print(current.data+"->");
         current= current.next;
    }
 }

public int countNd(){
     int count =0;
    Node current=head;  

    while( current!= null) {
     count++;
     current=current.next;
     }
     return count;

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








































        else:
            curr = curr.next
    return head




stack = []
stack.append(1)
stack.append(2)
print(stack.pop())  # 2
stack = [1, 2, 3]
print(stack[-1])  # 3
stack = [1, 2, 3]
print(len(stack))  # 3
def hanoi(n, source, aux, dest):
    if n == 1:
        print(f"Move disk 1 from {source} to {dest}")
        return
    hanoi(n-1, source, dest, aux)
    print(f"Move disk {n} from {source} to {dest}")
    hanoi(n-1, aux, source, dest)

hanoi(3, 'A', 'B', 'C')
def next_greater(nums):
    result = [-1]*len(nums)
    stack = []
    for i in range(len(nums)):
        while stack and nums[i] > nums[stack[-1]]:
            idx = stack.pop()
            result[idx] = nums[i]
        stack.append(i)
    return result

print(next_greater([4, 5, 2, 10]))  # [5, 10, 10, -1]
def eval_postfix(expr):
    stack = []
    for token in expr.split():
        if token.isdigit():
            stack.append(int(token))
        else:
            b, a = stack.pop(), stack.pop()
            stack.append(eval(f"{a}{token}{b}"))
    return stack[0]

print(eval_postfix("3 4 + 2 *"))  # 14
stack = []
stack.append("edit1")
stack.append("edit2")
undo = stack.pop()
print("Undo:", undo)  # "Undo: edit2"
class MaxStack:
    def __init__(self):
        self.stack = []
        self.max_stack = []

    def push(self, x):
        self.stack.append(x)
        self.max_stack.append(max(x, self.max_stack[-1] if self.max_stack else x))

    def pop(self):
        self.max_stack.pop()
        return self.stack.pop()

    def get_max(self):
        return self.max_stack[-1]

m = MaxStack()
m.push(3)
m.push(5)
m.push(2)
print(m.get_max())  # 5
def is_palindrome(s):
    return s == s[::-1]

print(is_palindrome("racecar"))  # True
def sort_stack(s):
    temp_stack = []
    while s:
        tmp = s.pop()
        while temp_stack and temp_stack[-1] > tmp:
            s.append(temp_stack.pop())
        temp_stack.append(tmp)
    return temp_stack

print(sort_stack([3, 1, 2]))  # [1, 2, 3]
def infix_to_postfix(expr):
    precedence = {'+':1, '-':1, '*':2, '/':2}
    stack, output = [], ''
    for c in expr:
        if c.isalnum():
            output += c
        elif c in precedence:
            while stack and precedence.get(stack[-1], 0) >= precedence[c]:
                output += stack.pop()
            stack.append(c)
    while stack:
        output += stack.pop()
    return output

print(infix_to_postfix("a+b*c"))  # "abc*+"
class MinStack:
    def __init__(self):
        self.stack = []
        self.min_stack = []

    def push(self, x):
        self.stack.append(x)
        if not self.min_stack or x <= self.min_stack[-1]:
            self.min_stack.append(x)

    def pop(self):
        if self.stack.pop() == self.min_stack[-1]:
            self.min_stack.pop()

    def get_min(self):
        return self.min_stack[-1]

m = MinStack()
m.push(3)
m.push(1)
m.push(2)
m.pop()
print(m.get_min())  # 1
def is_balanced(expr):
    stack = []
    for char in expr:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if not stack:
                return False
            stack.pop()
    return not stack

print(is_balanced("(())"))  # True

   def pop(self):
        if self.stack.pop() == self.min_stack[-1]:
            self.min_stack.pop()

    def get_min(self):
        return self.min_stack[-1]


 def push(self, x):
        self.stack.append(x)
        self.max_stack.append(max(x, self.max_stack[-1] if self.max_stack else x))

    def pop(self):
        self.max_stack.pop()
        return self.stack.pop()

    def get_max(self):
        return self.max_stack[-1]