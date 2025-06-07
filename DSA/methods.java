// public class methods { 
//     public static int addnum(int a,int b){
//     int sum= a+b;
//     return sum;
// }

// public static void main ( String [] args){
//     int a =5; int b=6;
//     int result = addnum(a, b);        // store the returned value
//         System.out.println(result); 
// }
// }



// class calculator {
//        public int sub ( int a, int b)
//        {
//         return a-b;
//        }

//        static void greet(){
//         system.out.println("welcoome here ")
//        }
//        class method{
//         public static void main (String[] args)
//        {
//         calculator.greet();
//         calculator calc = new calculator ();
//         system.out.println(calc.sub(15,8));

//        }

//        }
       
// }




// // Java program demonstrates how to call a method
// class Add {
//     int s = 0;
    
//     // Method 
//     public int addTwoInt(int a, int b) {
//         // Perfrom sum of two numbers given as argument
//         s = a + b;
        
//         // Return the sum of two numbers
//         return s;
//     }
// }

// class Geeks
// {
//     public static void main(String[] args) {
        
//         // Creating an object of Add class
//         Add a = new Add();
        
//         // Calling method using object and storing the return 
//         // Value in res variable of int type
//         int res = a.addTwoInt(1, 2);
        
//         // Printing the output
//         System.out.println("Sum: " + res);  
//     }
// }

// // Java Program to Illustrate Method Calling
// import java.io.*;

// // Helper class
// class Test {

//     public static int i = 0;

//     // Constructor to count objects
//     Test() {
//         i++;
//     }

//     // Static method to get the 
//     // number of objects created
//     public static int get() {
//         return i;
//     }

//     // Instance method m1 calling 
//     // another method m2
//     public int m1() {
//         System.out.println("Inside the method m1");
//         this.m2();  // Calling m2 method
//         return 1;
//     }

//     // Method m2 that prints a message
//     public void m2() {
//         System.out.println("In method m2");
//     }
// }

// // Main class
// class Geeks 
// {
//     // Main driver method
//     public static void main(String[] args) {

//         // Creating object of Test class
//         Test obj = new Test();

//         // Calling m1 method using the class object
//         int i = obj.m1();
//         System.out.println("Control returned after m1: " + i);

//         // Calling the get method directly using the class name
//         int o = Test.get();
        
//         // Printing the value
//         System.out.println("No of instances created: " + o);
//     }
// }

// public class Geeks
// {
//     private int num;
//     private String n;

//     // Accessor (getter) methods
//     public int getNumber() 
//     { 
//       return num; 
//     }
    
//     public String getName() 
//     { 
//       return n; 
//     }

//     // Mutator (setter) methods
//     public void setNumber(int num) 
//     { 
//       this.num = num; 
//     }
    
//     public void setName(String n) 
//     { 
//       this.n = n; 
//     }

//     // Other methods
//     public void printDetails() {
//         System.out.println("Number: " + num);
//         System.out.println("Name: " + n);
//     }

//     // Main method to run the code
//     public static void main(String[] args) {
//         Geeks g = new Geeks();
//         g.setNumber(123);  
//         g.setName("GFG Write");   
//         g.printDetails();  
//     }
// }

// class git{
//     void greet (){
//                 System.out.println("This is a user-defined method.");

//     }
//        public static void main(String[] args) {
//         git obj = new git;
//         obj.greet();
//        }
// }



// import java.io.*;

// class Test {
//     static void hello(){
//         System.out.println(" good morning babe ");
//     }
// }

// class methods {
//     public static void main ( String[] args){
//         // calling the hello function through Test 
//         Test.hello();
//     }
// }


class Test {
    void hello (){
        System .out.println(" you a mororn ?");
    }
}
class methods{
    void run(){
        Test t= new Test();
        t.hello();
    }

public static void main (String[]  args ){
    methods m= new methods();
    m.run();
}
}