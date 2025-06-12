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


// class Test {
//     void hello (){
//         System .out.println(" you a mororn ?");
//     }
// }
// class methods{
//     void run(){
//         Test t= new Test();
//         t.hello();
//     }

// public static void main (String[]  args ){
//     methods m= new methods();
//     m.run();
// }
// }





// class Test {
//     void hello (){
//         System .out.println(" you a mororn ?");
//     }
// }
// class methods{
   
// public static void main (String[]  args ){
//     Test t= new Test();
//         t.hello();
// }
// }



// import java.util.Arrays;


// public class Main{
//     public static void main ( String[] args){
//         int array [] = { 10,20,30,40,50,60,70,80 };
//         //  System.out.println(Arrays.toString(array));  // It takes an array (like int[]) and returns a string representation of its contents.
//           array[2]= 100; //  changing the value of the partiuclar index
//         for(int element: array){
//             System.out.println( element+ " ");  // using the forEach loop //
//         }

//     }
// }

// import java.util.Arrays;


// public class methods{
//     public static int largestElement(int array[]){
//         int largest=array[0];
//         for ( int i=0;i<array.length;i++){
//             if ( array[i]>largest)
//             { 
//                 largest=array[i];
//             }
//         }
//         return largest;
//     }

//     public static void main ( String[] args ){
//         int arr[]= {10,5,65,12,78,35,24,1,37} ;
//         System.out.println(largestElement(arr));
//     }
// }





// import java.util.*;


// public class methods{
//     public static int largestElement(int array[]){
//         int largest=array[0];
//         for ( int i=0;i<array.length;i++){
//             if ( largest > array[i])
//             { 
//                 largest=array[i];
//             }
//         }
//         return largest;
//     }

//     public static void main ( String[] args ){
//         int arr[]= {10,5,65,12,78,35,24,1,37} ;
//         System.out.println(largestElement(arr));
//     }
// }
// COUNTING THE NUMBER OF TIMES 
// public class methods{
//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);
        
//         System.out.println("enter the array of numbers you want ");
//         String input= sc.nextLine();

//         System.out.println("enter the exact number you want ");
//         int target = sc.nextInt();

//           int count = 0;
//         Scanner inputsc= new Scanner(input);
//         while(inputsc.hasNextInt()){
//             int number = inputsc.nextInt();
//             if(number== target)
//             {
//                 count++;
//             }
//         }

//         System.out.println("the number"+target+"occured"+count+"times");

//         sc.close();
//         inputsc.close();
//     }
// }



// non  zero numbers first then the zero numbers //

// public class methods{
//     public static void main (int[] args){
//         int index = 0;

//         for (int num:arr){
//             if ( num !=0)
//             arr[index++]=num;
//         }
//         while(index<arr.length){
//             arr[index++]=0;
//         }
//     }

//      public static void main(String[] args) {
//         int[] arr = {0, 1, 0, 3, 12};
//         methods(arr);
//         System.out.println("Array after moving zeroes: " + Arrays.toString(arr)); // converts the array into a redable string //
//     }
// }

import java.util.*;


// public class methods {
//     public static boolean sorted( int[] arr ){
//         for(int i =1 ; i<arr.length ; i++){
//             if ( arr[i] < arr[i-1]){
//                 return false;
//             }
//         }
//         return true;
//     }


// // SORTING THE ARRAY ..........................................................// // // // // // // // //

//     public static void main (String[] args ){
//         // int [] arr1=    {1,2,3,4,5};
//         // int []arr2= {4,1,5,7,3,2,4,5,9,8,4,1,2,5,3,5,74};
          
//         // System.out.println("arr1 is sorted? " + sorted(arr1));
//         // System.out.println("arr2 is sorted? " + sorted(arr2));

// Scanner sc = new Scanner(System.in);



//     System.out.println("enter the number of elements ");
//     int size = sc.nextInt();

// int[] array = new int[size];


//     System.out.println("enter " + size + "elements ");

//     for (int i=0; i<size;i++){
//         array[i]=sc.nextInt();
//     }

// System.out.println("Is the array sorted? " + sorted(array));


//         sc.close();

//     }
// }


// public class methods{
//    public static int findSecondLargest(int[] arr) {
//         if (arr.length < 2) {
//             System.out.println("Array must contain at least two elements.");
//             return -1; // Or throw an exception
//         }

//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for (int num : arr) {
//             if (num > largest) {
//                 secondLargest = largest;  // Update second largest before changing largest
//                 largest = num;
//             } else if (num > secondLargest && num != largest) {
//                 secondLargest = num;  // Only update if it's less than largest and not equal
//             }
//         }

//         if (secondLargest == Integer.MIN_VALUE) {
//             System.out.println("No distinct second largest element found.");
//             return -1;
//         }

//         return secondLargest;
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 35, 1, 10, 34, 1};
//         int second = findSecondLargest(arr);
//         if (second != -1) {
//             System.out.println("Second largest element: " + second);
//         }
//     }


// }


public class Methods {
    // array to store data
    private int[] array;

    // index where next element will be inserted
    private int index;

    // capacity of the array
    private int capacity;

    // Constructor
    public Methods(int size) {
        this.capacity = size;
        this.array = new int[capacity];
        this.index = 0;  // initialize index to 0
    }

    // Method to insert a value
    public void insert(int value) {
        if (index == capacity) {
            System.out.println("Array is full already");
            return;
        }
        array[index] = value;
        index++;
    }


    public void delete(int delIndex){
      if ( delIndex<0 || delIndex >=index){
        System.out.println("invalid index this is ");
     }
     for (int i=delIndex; i<index-1;i++){
      array[i]=array[i+1];
     }
     index -- ;
         array[index] = 0;  // Optional: clears last slot

    }


    public int  search( int value ){
      int indexResult= -1;
      for (int i =0;i<index;i++){
        if(arr[i]=value){
        indexResult=i;
        break;
        }
      }
      return indexResult;
    }


    public int get(int getIndex){
           if(getIndex<0|| getIndex>this.index){
            System.out.println("invalid index");
            return -1;
           }
           return array[getIndex];

    }

    public void traverse(){
      for(int i=0;i<this.index;i++){
        System.out.print(array[i]+"\t");
      }
      System.out.print(" no data is here");
    }


    public void updateIndex( int upIndex, int value){
      if(upIndex< index || upIndex >=index){
                    System.out.println("invalid index");
            return ;
      }
      array[upIndex]= value;


      public  static void main ( string[] args){
        methods mt= new methods[5];

        mt.insert(20);    // pass integer directly
mt.insert(300);
mt.insert(2000);

      }
    }
}