public class queueClass{
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;

        queue(int n){
            arr= new  int[n];
            this.size=n;
            
        }

        public static boolean isEmpty(){
             return rear == -1;
        }

    }

    public static void main ( String[] args){

    }
    
}