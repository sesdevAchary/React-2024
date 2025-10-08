import java.util.*;
public class practiceQueue {
// QUEUE using 2 STACKS//
/*q-1 poppig out element from s1 then add new element in s1 again push all  */
   static class queueY{
    static Stack<Integer> s1= new Stack<>();
    static Stack<Integer> s2= new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }

    public static void add(int data){
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
            
        }
    }

    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("empty list");
            return -1;
        }
        return s1.pop();
    }

    
   }
    
}
