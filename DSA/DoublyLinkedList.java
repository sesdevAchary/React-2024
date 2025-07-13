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

     
    // Go forward n steps
    public void forward(int steps) {
        while (steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
    }

    // Get current page
    public String getCurrentPage() {
        return current.url;
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.com");

        browser.visit("a.com");
        browser.visit("b.com");
        browser.visit("c.com");
        System.out.println("Current: " + browser.getCurrentPage());  // c.com

        browser.back(1);
        System.out.println("After back 1: " + browser.getCurrentPage());  // b.com

        browser.back(1);
        System.out.println("After back 1: " + browser.getCurrentPage());  // a.com

         browser.forward(1);
        System.out.println("After forward 1: " + browser.getCurrentPage());  // b.com

        browser.visit("d.com");
        System.out.println("After visiting d.com: " + browser.getCurrentPage());  // d.com
        BrowserHistory browser = new BrowserHistory("home.com");

browser.visit("a.com");
browser.visit("b.com");
browser.visit("c.com");

System.out.println("Current: " + browser.getCurrentPage());  
// Output: c.com

browser.back(1);     // to b.com
browser.back(1);     // to a.com
browser.forward(1);  // to b.com

browser.visit("d.com");
// forward history cut: c.com is removed

browser.forward(2);  // no effect, already at end


    
}





public ListNode reverseKGroup(ListNode head, int k) {
    ListNode node = head;
    for (int i = 0; i < k; i++) {
        if (node == null) return head;
        node = node.next;
    }
    ListNode prev = reverseKGroup(node, k);
    while (k-- > 0) {
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
    }
    return prev;
}
class Node {
    int val;
    Node next, random;
    Node(int val) { this.val = val; }
}

public Node copyRandomList(Node head) {
    Map<Node, Node> map = new HashMap<>();
    Node cur = head;
    while (cur != null) {
        map.put(cur, new Node(cur.val));
        cur = cur.next;
    }
    cur = head;
    while (cur != null) {
        map.get(cur).next = map.get(cur.next);
        map.get(cur).random = map.get(cur.random);
        cur = cur.next;
    }
    return map.get(head);
}
class LRUCache {
    class Node {
        int key, val;
        Node prev, next;
        Node(int k, int v) { key = k; val = v; }
    }
    int cap;
    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap<>();
    
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            remove(n);
            insert(n);
            return n.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) remove(map.get(key));
        if (map.size() == cap) remove(tail.prev);
        insert(new Node(key, value));
    }

    void remove(Node n) {
        map.remove(n.key);
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    void insert(Node n) {
        map.put(n.key, n);
        n.next = head.next;
        n.prev = head;
        head.next.prev = n;
        head.next = n;
    }
}


public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
    for (ListNode node : lists) if (node != null) pq.add(node);
    ListNode dummy = new ListNode(0), curr = dummy;
    while (!pq.isEmpty()) {
        ListNode min = pq.poll();
        curr.next = min;
        curr = curr.next;
        if (min.next != null) pq.add(min.next);
    }
    return dummy.next;
}
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0), curr = dummy;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }
    return dummy.next;
}
public ListNode getIntersectionNode(ListNode a, ListNode b) {
    ListNode p1 = a, p2 = b;
    while (p1 != p2) {
        p1 = (p1 == null) ? b : p1.next;
        p2 = (p2 == null) ? a : p2.next;
    }
    return p1;
}
public Node flatten(Node head) {
    if (head == null) return head;
    Stack<Node> stack = new Stack<>();
    Node curr = head;
    while (curr != null) {
        if (curr.child != null) {
            if (curr.next != null) stack.push(curr.next);
            curr.next = curr.child;
            curr.child.prev = curr;
            curr.child = null;
        } else if (curr.next == null && !stack.isEmpty()) {
            curr.next = stack.pop();
            curr.next.prev = curr;
        }
        curr = curr.next;
    }
    return head;
}
public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode slow = head, fast = head, prev = null;
    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    prev.next = null;
    ListNode l1 = sortList(head);
    ListNode l2 = sortList(slow);
    return merge(l1, l2);
}

ListNode merge(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0), curr = dummy;
    while (l1 != null && l2 != null) {
        if (l1.val < l2.val) {
            curr.next = l1; l1 = l1.next;
        } else {
            curr.next = l2; l2 = l2.next;
        }
        curr = curr.next;
    }
    curr.next = (l1 != null) ? l1 : l2;
    return dummy.next;
}
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy, slow = dummy;
    for (int i = 0; i <= n; i++) fast = fast.next;
    while (fast != null) {
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
}


