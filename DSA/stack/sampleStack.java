import java.util.*;

public class sampleStack{
   public static void main(String args[]){
    Stack <Integer> s= new Stack<>();

    s.push(1);s.push(2);s.push(3);s.push(4);

    while(!s.isEmpty()){
        System.out.println(peek());
        s.pop();
    }
   }

}



