public class sampleStack{
    static class Node{
        int data;Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }

    }

    static class Stack{
        public Node head;


        public boolean isEmpty(){
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

        public static int pop(){
            if(isEmpty())
            return -1;

            int top=head.data;
            head=head.next;
            return top;
        }

         public static int peek(){
            if(isEmpty())
            return -1;

            return head.data;
        }


    }

    public static void main(String args[]){
        Stack s=new Stack();

        s.push(1);s.push(2);s.push(3);s.push(4);s.push(5);s.push(6);s.push(7);s.push(8);


    }



}