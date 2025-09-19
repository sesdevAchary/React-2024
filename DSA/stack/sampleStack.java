public class sampleStack{
    static class Node{
        int data;Node next;
        public Node(int data){
            this.data=data;
            Next=null;
        }

    }

    static class Stack{
        public Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newd=new Node(data);
            if(isEmpty()){
                head=newd;
                return;
            }
            newd.next=head;head=newd;

        }
    }



}