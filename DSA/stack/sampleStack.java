import java.util.*;

// // public class sampleStack{
// // //    public static void main(String args[]){
// // //     Stack <Integer> s= new Stack<>();

// // //     s.push(1);s.push(2);s.push(3);s.push(4);

// // //     while(!s.isEmpty()){
// // //         System.out.println(s.peek());
// // //         s.pop();
// // //     }
// // //    }

// import java.util.*;

// public class sampleStack {

//     public static void pushAtBottom(int data,Stack<Integer> s){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top=s.pop();            // remove top and save it temporarily
//         pushAtBottom(data,s);       // recursive call to go deeper (toward bottom)
//         s.push(top);                // restore the saved top back on top
//     }

//     public void reverse( stack <Integer> s){
//         if(s.isEmpty()){
//             return;                  // already reversed //
//         }
//         int top=s.pop();         // gettig the top element at each reverse fun call thus reverse(s) after each s.pop untill []
//         reverse(s);
//         pushAtBottom(top,s);    //  [1,2]->[2,1] again [2,1,3]->[3,2,1];
//     }

//     public static void main( String args[]){
//         stack<Integer>=new s stack<>();
//         s.push(1); s.push(2); s.push(3); s. push(4);  // push 1,2,3,4 (4 is on top)

//         pushAtBottom(5,s);

//         while( !s.isEmpty()){
//             System.out.println(s.peek());

//         }
//     }
//     // // Reverse entire stack s using recursion
//     // public static void reverse(Stack<Integer> s) {
//     //     if (s.isEmpty()) {        // base case: empty stack is already reversed
//     //         return;
//     //     }
//     //     int top = s.pop();        // remove top element
//     //     reverse(s);               // reverse the remaining (smaller) stack
//     //     pushAtBottom(top, s);     // put the removed top at the bottom of the now-reversed stack
//     // }

//     // public static void main(String[] args) {
//     //     Stack<Integer> s = new Stack<>();   // create a new empty Stack object
//     //     s.push(1); s.push(2); s.push(3); s.push(4);  // push 1,2,3,4 (4 is on top)

//     //     System.out.println("Before reversing (bottom -> top): " + s);
//     //     reverse(s);  // reverse the stack in-place

//     //     System.out.println("After reversing  (bottom -> top): " + s);

//     //     System.out.println("Popping all elements (printed in order):");
//     //     while (!s.isEmpty()) {
//     //         System.out.println(s.peek());  // print top
//     //         s.pop();                       // remove top
//     //     }
//     // }
// }


public class sampleStack{
    // public static boolean isValid( String S){
    //     Stack <Character> s = new Stack<>();   
        
    //     for( char c: S.toCharArray()){
    //         if( c=='(' || c=='{' || c=='['){
    //             s.push(c);
    //         }else{
    //             if(s.isEmpty()){
    //                 return false;
    //             }

    //             char top = s.pop();

    //             if((c==')' && top != '(') || (c=='}' && top != '{') || (c==']' && top != '[')){
    //                 return false;
    //             }
    //         }
    //     }

    //     return s.isEmpty();

    // }

    // public static void main( String args[]){
    //     String s1 = "()";
    //     String s2 = "()[]{}";
    //     String s3 = "(]";

    //     System.out.println(isValid(s1));
    //     System.out.println(isValid(s2));
    //     System.out.println(isValid(s3));
    // }


    public static int longestValidParentheses(String S){
        Stack<Integer> s= new Stack<>();
        s.push(-1);
        int maxLen=0;

        for ( int i=0;i<S.length();i++)
        {
            char c= S.charAt(i);

            if( c== '('){
                s.push(i);
            }else
            {
                s.pop();

                if(s.isEmpty()){
                    s.push(i);
                }
                maxLen=Math.max(maxLen,i-s.peek());
            }
        }



       return maxLen;
    }

     public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));    // prints 2
        System.out.println(longestValidParentheses(")()())")); // prints 4
    }
}


if (c == '(') {
    stack.push(i);       // store index of '('
} else {                 // c == ')'
    stack.pop();         // try to match with a previous '('
    if (stack.isEmpty()) {
        stack.push(i);   // no matching '(', set new base index
    } else {
        maxLen = Math.max(maxLen, i - stack.peek()); // current valid length
    }
}
