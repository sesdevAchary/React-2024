import java.util.*;
 public class queueClass{
// //     static class queue{
// //         static int arr[];
// //         static int size;
// //         static int rear=-1; static int front = -1;

// //         queue(int n){
// //             arr= new  int[n];
// //             this.size=n;
// //        }
// // ////////////////// FOR NORMAL QUEUE //////////////////////
// //         // public static boolean isEmpty(){
// //         //      return rear == -1;
// //         // }

// //         // public static void add(int data){
// //         //     if(rear == size -1){
// //         //         System.out.println (" Queue is already full my Lord");
// //         //     }

// //         //     rear++;
// //         //     arr[rear]=data;
// //         // }

// //         // public static int delete(){
// //         //     if(isEmpty()){
// //         //         System.out.println("Queue is already the least");
// //         //         return -1;
// //         //     }

// //         //     int front=arr[0];
// //         //     for(int i=0;i<rear;i++){
// //         //         arr[i]=arr[i+1];
                
// //         //     }
// //         //     rear --;
// //         //     return front;
// //         // }
// //         // public static int peek(){
// //         //     if(isEmpty()){
// //         //         System.out.println("Queue is already the least");
// //         //         return -1;
// //         //     }
// //         //     return arr[0];
// //         // }


// //         ////////////////// FOR CIRCULAR  QUEUE //////////////////////
// //         // public static boolean isEmpty(){
// //         //     return  front == -1 && rear == -1 ;
// //         // }
// //         // public static boolean isFull(){
// //         //     return (rear +1 ) % size == front;
// //         // }

// //         // public static void add(int data){
// //         //     if(isFull()){
// //         //         System.out.println("Already Full)");return;

// //         //     }

// //         //     // for 1st element //
// //         //     if(front == -1)
// //         //     {
// //         //         front=0;
// //         //     }

// //         //     rear=(rear+1)%size;
// //         //     arr[rear]=data;
// //         // }
// //         // public static int  delete(){
// //         //     if(isEmpty()){
// //         //         System.out.println("Already empty sorry ");return -1;
// //         //     }
// //         //     int result=arr[front];

// //         //     if(front ==rear){
// //         //         rear=front=-1;
// //         //     }else{
// //         //         front=(front+1)%size;
// //         //     }
// //         //     return result;
// //         // }

// //         // public static int peek(){
// //         //     if(isEmpty()){
// //         //         System.out.println("Already empty sorry ");return -1;
// //         //     }
// //         //     return arr[front];
// //         // }


// //     }

// //     public static void main ( String[] args){
// //         queue q= new queue(5);
// //         q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
// //         System.out.println(q.delete());
// //         q.add(6);
// //         System.out.println(q.delete());
// //         q.add(7);
// //         //12345 then 62345 then 76345


// //         while ( !q.isEmpty()){
// //             System.out.println(q.peek());
// //         q.delete();
// //         }


// //     }
// //         ////////////////// FOR   QUEUE  USING LINKEDLIST //////////////////////

// //     static class Node{  // CREATING node for linklist//
// //     int data;
// //     Node next;

// //     Node(int data){
// //         this.data=data;
// //         next=null;
// //     }
// //    }

// //    static class queue{  // creating queue class of variable size cause linkedlist is of variable size//
// //     static Node head=null;
// //     static Node tail=null;

// //     static boolean isEmpty(){
// //         return (head == null & tail == null);
// //     }

// //     public static void  add(int data)
// //     {
// //         Node nd= new Node(data);

// //         if(tail == null)
// //         {
// //             head=tail=nd;
// //         }
// //         tail.next=nd;
// //         tail=nd;
// //     }
// //     public static int delete(){
// //         if(isEmpty()){
// //             System.out.println("Already empty you cant delete anything ");
// //             return -1;
// //         }
// //         int front=head.data;

// //         if(head== null)
// //         tail=null;

// //         head=head.next;
// //         return front;
// //     }

// //     public static int peek(){
// //         if(isEmpty()){
// //             System.out.println("Already empty you cant delete anything ");
// //             return -1;
// //         }
// //         return head.data;
// //     }
// // }

// // public static void main(String args[]){
// //     queue q =  new queue();
// //     q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);  q.add(6);

// //     while(!q.isEmpty()){
// //         System.out.println(q.peek());
// //         q.delete();
// //     }
// // }

// ////////  QUEUE USING COLLECTION FRAMEWORK //////////// ARRAYDEQUE n LINKLIST//

// public static void main( String args[])
// {
//     Queue<Integer> q= new LinkedList<>();
//     /*   //creates a new ll behaves like a queue n store it a var thst allows queue operations//
//     QUEUE IS AN INTERFACE - A CONTRACT
//                                 DEFINE WHAT METHOD EXIST,NOT HOW THEY WORK
//     LL IS A CLASS -CONTRACTER
//                        PROVIDES REAL IMPLEMETATION FOR THE QUEUE METHODS{add,remove}
//     */
    
//     q.add(1);q.add(2);
//     while(!q.isEmpty())
//     {
//         System.out.println(q.peek());
//         q.remove();

//     }

//     /*we can do the above same like
//      * Queue<Integer> q = new ArrayDeque<>();
//      * BOTH SAME o(1)
//      * BUT WHEN WE SEARCH AN MIDDLE ELEMENT ARRAYDEQUE O(1) LL-O(n)
//      */
    
// }



// static void reverseQuese(Queue<Integer> q)
// //“When this method is called, we eed  to pass a queue of integers so that It can work on it"//
// {
//     Stack <Integer> s= new Stack<>();

//     //pushing elements to stack//
//     while(!q.isEmpty())
//     {
//         s.push(q.remove());
//     }

//     //pop from stack and push to q
//     while(!s.isEmpty())
//     {
//         q.add(s.pop());
//     }
// }
// public static void main(String args[])
// {
//    Queue<Integer> q =     new LinkedList<>();

//    q.add(10);q.add(20);q.add(30);q.add(40);
//    System.out.println("Original Queue: " + q);
//         reverseQuese(q);
//         System.out.println("Reversed Queue: " + q);

// }

//  }

public static void generateBinary(int n)
{
    Queue q= new LinkedList<>();
    q.add("1");

    for(int i=0;i<=n;i++)
    {
        String front=q.remove(); // remove 1 first ,10,11,100
        System.out.println(front); //print 1, i2-10 , i3-11,i4-100

        q.add(front+"0"); // add 0 to 1 i2- add 0 to 10, i3- add 0
        q.add(front+"1"); // add 1 to 1 i2- add 1 to 10, i3- add 1
    }
}
 public static void main(String[] args) {
        int n = 10;
        System.out.println("Binary numbers from 1 to " + n + ":");
        generateBinary(n);
    }
 








public static void reverseKElements(Queue<Integer> q , int k)
{
    Stack<Integer> s= new Stack<>();

    if(q.isEmpty() || k<0 || k>q.size()) return;

    for(int i=0;i<k;i++)
    {
        s.push(q.remove());
    }

    while(!s.isEmpty())
    {
        q.add(s.pop());
    }

    int rem=q.size()-k;
    for(int o=0;o<rem;o++)
    {
        q.add(q.remove());
    }
}


public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();
    q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);q.add(60);

    int k=3;

    System.out.println("Original Queue: " + q);

    reverseKElements(q, k);

    System.out.println("Queue after reversing first " + k + " elements: " + q);
}



}