

// // // public class sampleStack{
// // // //    public static void main(String args[]){
// // // //     Stack <Integer> s= new Stack<>();

// // // //     s.push(1);s.push(2);s.push(3);s.push(4);

// // // //     while(!s.isEmpty()){
// // // //         System.out.println(s.peek());
// // // //         s.pop();
// // // //     }
// // // //    }

// // import java.util.*;

// // public class sampleStack {

// //     public static void pushAtBottom(int data,Stack<Integer> s){
// //         if(s.isEmpty()){
// //             s.push(data);
// //             return;
// //         }
// //         int top=s.pop();            // remove top and save it temporarily
// //         pushAtBottom(data,s);       // recursive call to go deeper (toward bottom)
// //         s.push(top);                // restore the saved top back on top
// //     }

// //     public void reverse( stack <Integer> s){
// //         if(s.isEmpty()){
// //             return;                  // already reversed //
// //         }
// //         int top=s.pop();         // gettig the top element at each reverse fun call thus reverse(s) after each s.pop untill []
// //         reverse(s);
// //         pushAtBottom(top,s);    //  [1,2]->[2,1] again [2,1,3]->[3,2,1];
// //     }

// //     public static void main( String args[]){
// //         stack<Integer>=new s stack<>();
// //         s.push(1); s.push(2); s.push(3); s. push(4);  // push 1,2,3,4 (4 is on top)

// //         pushAtBottom(5,s);

// //         while( !s.isEmpty()){
// //             System.out.println(s.peek());

// //         }
// //     }
// //     // // Reverse entire stack s using recursion
// //     // public static void reverse(Stack<Integer> s) {
// //     //     if (s.isEmpty()) {        // base case: empty stack is already reversed
// //     //         return;
// //     //     }
// //     //     int top = s.pop();        // remove top element
// //     //     reverse(s);               // reverse the remaining (smaller) stack
// //     //     pushAtBottom(top, s);     // put the removed top at the bottom of the now-reversed stack
// //     // }

// //     // public static void main(String[] args) {
// //     //     Stack<Integer> s = new Stack<>();   // create a new empty Stack object
// //     //     s.push(1); s.push(2); s.push(3); s.push(4);  // push 1,2,3,4 (4 is on top)

// //     //     System.out.println("Before reversing (bottom -> top): " + s);
// //     //     reverse(s);  // reverse the stack in-place

// //     //     System.out.println("After reversing  (bottom -> top): " + s);

// //     //     System.out.println("Popping all elements (printed in order):");
// //     //     while (!s.isEmpty()) {
// //     //         System.out.println(s.peek());  // print top
// //     //         s.pop();                       // remove top
// //     //     }
// //     // }
// // }

// // import java.util.*;
// // public class sampleStack{


//     // public static boolean isValid( String S){
//     //     Stack <Character> s = new Stack<>();   
        
//     //     for( char c: S.toCharArray()){
//     //         if( c=='(' || c=='{' || c=='['){
//     //             s.push(c);
//     //         }else{
//     //             if(s.isEmpty()){
//     //                 return false;
//     //             }

//     //             char top = s.pop();

//     //             if((c==')' && top != '(') || (c=='}' && top != '{') || (c==']' && top != '[')){
//     //                 return false;
//     //             }
//     //         }
//     //     }

//     //     return s.isEmpty();

//     // }

//     // public static void main( String args[]){
//     //     String s1 = "()";
//     //     String s2 = "()[]{}";
//     //     String s3 = "(]";

//     //     System.out.println(isValid(s1));
//     //     System.out.println(isValid(s2));
//     //     System.out.println(isValid(s3));
//     // }


// //     public static int longestValidParentheses( String string1){
// //         Stack<Integer> s= new Stack<>();  // creates a new stack
// //         s.push(-1);                       // push -1 for initial reference
// //         int maxlen=0;                     // counting the maxlen

// //         for( int i=0;i< string1.length();i++){     // going through the given string
// //             char c = string1.charAt(i);            // placing the index value of the each char converted s

// //             if( c=='('){                         // if opening bracket then simply push its index to the stack [0]
// //                 s.push(i);                            
// //             }else{
// //                 s.pop();                         // else pop an element from the []

// //                 if(s.isEmpty()){
// //                     s.push(i);
// //                 }else{
// //                     maxlen=Math.max(maxlen, i-s.peek()); // if i=4 then 4-top i.e.=0 so 4-0=0;
// //                 }
// //             }
// //         }
// //         return maxlen;     // returning 4
// //     }
    

// //     public static void main(String[] args) {
// //         System.out.println(longestValidParentheses("(()"));    // prints 2
// //         System.out.println(longestValidParentheses(")()())")); // prints 4
// //     }
// // }



// // for the longest valid paranthesis and the int main*() fuunction has its iqo414.
// // for{
// //     int i=0;i<num.function 1;i
// //     if( int i=0)
// //     {
// //         for( any value of i =12)
// //         for(any char c= s.toCharArray(index(p)))
// //         for(any char c= s.toCharArray(index t))
// //         foreach (char i &&  char u){
// //             if( int i=0;i++;i for each case of y)
// //         }
// //     }




// // public int maxWater( int[] height){
// //     int n= height.length;

// //     if(n==0) return 0;

// //     int[] leftmax= new int[n];
// //     int[] rightmax=new int[n];

// //     // building the right max 

// //     rightmax[n-1]=height[n-1];
// //     for ( int i=n-2;i>=0;i--){
// //         rightmax[i]= Math.max(rightmax[i+1],height[i]);
// //     }

// //     // building the leftmax //

// //      leftmax[0]=height[0];
// //      for (  int i=1;i<n;i++){
// //         leftmax[i]=Math.max( leftmax[i-1], height[i]);
// //      }


// //      // calculating the tapped water inside it
// //      int tapped=0;
// //      for(int i=0;i<n;i++){
// //         tapped=tapped + Math.min( leftmax[i],rightmax[i]-height[0]);
// //      }
// //    return tapped;
// // }

// // public class sampleStack{

// // public static String simplifyPath(String path){
// //     if(path == null || path.length()==0) return "/";

// //     Deque<String> s= new ArrayDeque<>();     // will hold directory names in order
// //     String[] parts = path.split("/");     // split by '/', ignoring positions

// //     for(String p:parts){
// //         if(p.isEmpty() || p.equals("."))
// //         {
// //             continue; //// skip empty parts (from '//' or leading '/') and '.' (current dir)
// //         }
// //         else if ( p.equals(".."))
// //         {
// //             if(!s.isEmpty()) s.removeLast();
// //         }
// //         else{
// //             s.addLast(p);
// //         }




// //     }

// //     if(s.isEmpty()) return("/");
// //     else{
// //         StringBuilder sb = new StringBuilder();
// //         for( String dir:s){
// //             sb.append("/").append(dir);

// //         }
// //         return sb.toString();
// //     }


// // }

// // public static void main ( String[] args){
// //         System.out.println(simplifyPath("/home/"));                // -> /home
// //         System.out.println(simplifyPath("/../"));                  // -> /
// //         System.out.println(simplifyPath("/home//foo/"));           // -> /home/foo
// //         System.out.println(simplifyPath("/a/./b/../../c/"));       // -> /c
// //         System.out.println(simplifyPath("/a//b////c/d//././/..")); // -> /a/b/c

// // }
// // }




// import java.util.Stack;

// public class LargestRectangle {
//     public int largestRectangleArea(int[] heights) {
//         int n = heights.length;
//         Stack<Integer> stack = new Stack<>();   // stack of indices, increasing heights
//         stack.push(-1);                         // sentinel to simplify width calc
//         int maxArea = 0;
//         for (int i = 0; i < n; i++) {
//             // While current bar is lower or equal than top-of-stack bar,
//             // the top-of-stack bar's right boundary is i-1, so compute area.
//             while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
//                 int height = heights[stack.pop()];
//                 int width = i - stack.peek() - 1;   // distance between previous smaller and i
//                 maxArea = Math.max(maxArea, height * width);
//             }
//             stack.push(i); // push current index as a candidate left boundary
//         }
//          // Clean up remaining bars in stack (they extend to the end of histogram)
//         while (stack.peek() != -1) {
//             int height = heights[stack.pop()];
//             int width = n - stack.peek() - 1;       // right boundary is n-1
//             maxArea = Math.max(maxArea, height * width);
//         }

//         return maxArea;
//     }
// }

/////////////// Implement Stack using Linked List ///////////
/// 
/// 
/// 
/// 
import java.util.*;

public class sampleStack{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data; next=null;
        }
    }
    static class stackLL{
        public Node top;
        stackLL(){
            top=null;
        }

        public void push(int data){
            Node newNode=new Node(data);
            newNode.next=top;
            top=newNode;
            System.out.println(data+"pushed to the stack ");
        }

        public int pop(){
            if(top==null)return -1;
            top=top.next;
            return top.data;
        }

        public int peek()
        {
            if(top == null) return -1;
            return top.data;
        }

        public void display()
        {
            Node temp=top;
            while(temp != null)
            {
                System.out.println(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main( String args[])
    {
        stackLL l= new stackLL();
        l.push(1);l.push(2);l.push(3);l.push(4);
        l.display();

        System.out.println("Popped: " + l.pop());
        l.display();

        System.out.println("Top element: " + l.peek());
    }
}


