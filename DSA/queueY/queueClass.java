public class queueClass{
//     static class queue{
//         static int arr[];
//         static int size;
//         static int rear=-1; static int front = -1;

//         queue(int n){
//             arr= new  int[n];
//             this.size=n;
            
//         }
// ////////////////// FOR NORMAL QUEUE //////////////////////
//         // public static boolean isEmpty(){
//         //      return rear == -1;
//         // }

//         // public static void add(int data){
//         //     if(rear == size -1){
//         //         System.out.println (" Queue is already full my Lord");
//         //     }

//         //     rear++;
//         //     arr[rear]=data;
//         // }

//         // public static int delete(){
//         //     if(isEmpty()){
//         //         System.out.println("Queue is already the least");
//         //         return -1;
//         //     }

//         //     int front=arr[0];
//         //     for(int i=0;i<rear;i++){
//         //         arr[i]=arr[i+1];
                
//         //     }
//         //     rear --;
//         //     return front;
//         // }
//         // public static int peek(){
//         //     if(isEmpty()){
//         //         System.out.println("Queue is already the least");
//         //         return -1;
//         //     }
//         //     return arr[0];
//         // }


//         ////////////////// FOR CIRCULAR  QUEUE //////////////////////
//         // public static boolean isEmpty(){
//         //     return  front == -1 && rear == -1 ;
//         // }
//         // public static boolean isFull(){
//         //     return (rear +1 ) % size == front;
//         // }

//         // public static void add(int data){
//         //     if(isFull()){
//         //         System.out.println("Already Full)");return;

//         //     }

//         //     // for 1st element //
//         //     if(front == -1)
//         //     {
//         //         front=0;
//         //     }

//         //     rear=(rear+1)%size;
//         //     arr[rear]=data;
//         // }
//         // public static int  delete(){
//         //     if(isEmpty()){
//         //         System.out.println("Already empty sorry ");return -1;
//         //     }
//         //     int result=arr[front];

//         //     if(front ==rear){
//         //         rear=front=-1;
//         //     }else{
//         //         front=(front+1)%size;
//         //     }
//         //     return result;
//         // }

//         // public static int peek(){
//         //     if(isEmpty()){
//         //         System.out.println("Already empty sorry ");return -1;
//         //     }
//         //     return arr[front];
//         // }


//     }

//     public static void main ( String[] args){
//         queue q= new queue(5);
//         q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
//         System.out.println(q.delete());
//         q.add(6);
//         System.out.println(q.delete());
//         q.add(7);
//         //12345 then 62345 then 76345


//         while ( !q.isEmpty()){
//             System.out.println(q.peek());
//         q.delete();
//         }


//     }
    static class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
   }

   static class queue{
    static Node head=null;
    static Node tail=null;

    static boolean isEmpty(){
        return (head == null & tail == null);
    }

    public static void  add(int data)
    {
        Node nd= new Node(data);

        if(tail == null)
        {
            head=tail=nd;
        }
        tail=tail.next;
        tail=nd;
    }
    public static int deque(){
        if(isEmpty()){
            System.out.println("Already empty you cant delete anything ");
            return -1;
        }
        int front=head.data;

        if(head== null)
        tail=null;

        head=head.next;
        return front;
    }
}

}