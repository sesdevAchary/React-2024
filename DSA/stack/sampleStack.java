import java.util.*;

public class sampleStack{
//    public static void main(String args[]){
//     Stack <Integer> s= new Stack<>();

//     s.push(1);s.push(2);s.push(3);s.push(4);

//     while(!s.isEmpty()){
//         System.out.println(s.peek());
//         s.pop();
//     }
//    }

import java.util.*;

public class sampleStack {

    // Insert `data` at the bottom of stack s using recursion
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {        // base case
            s.push(data);         // when stack empty, pushing here places `data` at bottom
            return;
        }
        int top = s.pop();        // remove top and save it temporarily
        pushAtBottom(data, s);    // recursive call to go deeper (toward bottom)
        s.push(top);              // restore the saved top back on top
    }

    // Reverse entire stack s using recursion
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {        // base case: empty stack is already reversed
            return;
        }
        int top = s.pop();        // remove top element
        reverse(s);               // reverse the remaining (smaller) stack
        pushAtBottom(top, s);     // put the removed top at the bottom of the now-reversed stack
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();   // create a new empty Stack object
        s.push(1); s.push(2); s.push(3); s.push(4);  // push 1,2,3,4 (4 is on top)

        System.out.println("Before reversing (bottom -> top): " + s);
        reverse(s);  // reverse the stack in-place

        System.out.println("After reversing  (bottom -> top): " + s);

        System.out.println("Popping all elements (printed in order):");
        while (!s.isEmpty()) {
            System.out.println(s.peek());  // print top
            s.pop();                       // remove top
        }
    }
}


 // Push `data` to the BOTTOM of stack s using recursion
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);        // base case: empty -> push at bottom
            return;
        }
        int top = s.pop();       // temporarily remove top
        pushAtBottom(data, s);   // recursive call to go deeper
        s.push(top);             // restore the popped element
    }

    // Reverse the stack using recursion + pushAtBottom
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;              // base case: nothing to reverse
        }
        int top = s.pop();       // remove top
        reverse(s);              // reverse remaining stack
        pushAtBottom(top, s);    // insert removed top at bottom
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1); s.push(2); s.push(3); s.push(4);

        System.out.println("Before reversing (top -> bottom): " + s);
        reverse(s);
        System.out.println("After reversing  (top -> bottom): " + s);

        System.out.println("Popping all elements (order printed):");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}