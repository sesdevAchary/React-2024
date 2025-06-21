// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello from Gitpod!");
//     }
// }


// int print(){
//     System.out.println(" xyz");
//     a=87;
//     b=97;
//     system.out.println(sum(a+b));   // this program has time complexity O(1) constant always //
// }


// for (int i = 0; i < n; i++) {
//     // constant time operation o(n)
// }

// while(n>1)
//  system.out.println(n)
//  n=n/2   // each time it gets halved so O(logn)


// for (int i = 0; i < n; i++) {
//     for(int j=0; j<n;j++){
//         //
//     }
// }              // O(n)+O(1) = O(n)


// for (int i = 0; i < n/2; i++) {
//     system.out.println(" value 1");
// }                 // O(n/2)→O(n)

 
//  for (int i = 0; i < n; i++) {
//     for(int j=0; j<m;j++){
//         //
//     }
// }        // Time Complexity = O(n * m)


// boolean swapped;
// for (int i = 0; i < n - 1; i++) {
//     swapped = false;
//     for (int j = 0; j < n - 1 - i; j++) {
//         if (arr[j] > arr[j + 1]) {
//             int temp = arr[j];
//             arr[j] = arr[j + 1];
//             arr[j + 1] = temp;
//             swapped = true;
//         }
//     }
//     if (!swapped) break; // bubble sort O(n^2)
// }




// for ( int i = 0; i<n;i++){
//  system.out.println("one")
// }

// for(int j=0; j<n;j++)
// {
//  system.out.println("one")
// }                     // Herer there comes 2 different loops but single at a time so O(n)+O(n)




//    // Single loop
//         for (int i = 0; i < n; i++) {
//             System.out.println(i);
//         }

//         // Nested loop
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.println(i + "," + j);
//             }
//         }      // 2 different loops but are associated sooo O(n)+O(n^2)




//         for (int i = 0; i < n; i++) {       // Runs n times
//     for (int j = 0; j < 5; j++) {   // Always runs 5 times (constant)
//         System.out.println();      // Constant time operation
//     }
// }                  // outer loop n times but inner loop only 5 times sooooooo O(n)






// public class Practice2 {
//     public static void main(String[] args) {
//         int n = 10;

//         for (int i = 0; i < n; i++) {
//             System.out.println("i: " + i);
//         }

//         for (int i = 1; i < n; i = i * 2) {
//             System.out.println("Log loop i: " + i);   //log2(n) each time it gets multiplied by 2 so
//         }
//     }
//           }             // O(n)+O(logn) but dominant is O(n)








// ----------------------------------------------------------------------------------------------------------------------------------------------



// import java.util.scanner;

// pubblic class uniqueCharChecker{
//     pubblic static void main(String args[])
//     scanner sc = new scanner(system.in);
//     system.out.print(" enter a string : ")
//     string input = sc.nextLine(); // to read the entire line

//      string result= " ";

//      for(i = 0 ; i<=input.length();i++)
//      {
//         if(!result.contains(string.valueOf(input.charAt(i))));
//           result= result+ input.charAt(i);
//      }

// }

// System.out.println(result);


// import java.util.Scanner;

// public class UniqueCharacters {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);   // to take input
//         System.out.print("Enter a string: ");
//         String input = sc.nextLine();          // read the entire line

//         String result = "";

//         for (int i = 0; i < input.length(); i++) {
//             if (!result.contains(String.valueOf(input.charAt(i)))) {
//                 result += input.charAt(i);
//             }
//         }

//         System.out.println("String after removing duplicates: " + result);
//     }
// }


// String first = "Hello";
// String second = "World";
// System.out.println(first + " " + second);
// String word = "Programming";
// System.out.println(word.length());
// String text = "Java";
// System.out.println(text.charAt(2)); // Output: v

// String msg = "HelloWorld";
// System.out.println(msg.substring(5)); // Output: World   extracting a particular string 
// String s = "";
// System.out.println(s.isEmpty()); // true
// String a = "Java";
// String b = "Java";
// System.out.println(a.equals(b)); // true
// String x = "Coding";
// System.out.println(x.toUpperCase()); // CODING
// System.out.println(x.toLowerCase()); // coding
// String sentence = "apples are red";
// System.out.println(sentence.replace("red", "green"));
// public class Main {
//  public class Main {

// public static void main ( String[] args){
//    String og= " are you a gay ";
//     String reversed  = new StringBuilder(og).reverse().toString();
//      System.out.print(reversed);
//      int count = og.length();
//      System.out.println("Length of string: " + count);

// StringBuilder sb = new StringBuilder(" ethan hunt");

// for (int i=0;i<sb.length()/2;i++)
// {
//     int front=i; int back = sb.length()-1-i;
//     // accessing the front and back char
//      char frontC=sb.charAt(front);
//      char backC=sb.charAt(back);

//      sb.setCharAt(front,backC);
//      sb.setCharAt(back,frontC);
// }


// }
// }

// import java.util.*;
// public class Main {
//     public static void main ( String[] args){
//         StringBuilder sb = new StringBuilder("Ethan Hunt"); 
//         System.out.println(sb);
        
//         System.out.println(sb.charAt(3));

//                 sb.setCharAt(3, 'u');                    // Change 'a' to 'u'
//         System.out.println(sb);

//     }
// }


//  import java.util.*;
//  public class Main {


//       string s= "java";
//       char[] arr = s.toCharArray();
//       for(char:arr){
//         System.out.println(c+" ");
//       }
//  }


// string s =  " a b c "
// string[]  parts = s.split(" ");
// for(string word:parts){
//   Sysytem.out.println(word);
// }



// public static String reverse(String s){
//   StringBuilder sb =  new StringBuilder(s);
//    return sb.reverse().toString();
// }
// public static void main ( String[] args){
//   System.out.println(reverse("hello"));
// }



// public static int countV( String s){
//   int count = 0;
//   s= s.toLowerCase();

//   for(char c:s.toCharArray()){      // converts the s to char array //
//     if("aeiou".indexOf(c) !=-1){    // checks the aeiou in index of char c 
//       count ++;
//     }
//   }
//   return count;
// }
// public static void main (String[] args){
//           System.out.println(countV("education"));  // 5



// public static boolean palindrome(String s){
//   int left =0; int right = s.length() -1;

//   while(left<right){
//     if ( s.charAt(left++) != s.charAt(right--))
//     return false;
   
//   }
//   return true;
  
// }
// public static void main (String[] args){
//   System.out.println(palindrome("madam"));  
//         System.out.println(palindrome("java"));   
// }





// public static boolean anagrams(String s1, String s2){
//     // remove spaces and convert it to lowercase
//     s1= s1.replaceAll("\\s","").toLowerCase();
//     s2=s2.replaceAll("\\s","").toLowerCase();

//     //checking for length are equal are not
//     if(s1.length()!=s2.length())
//     return false ;

//     //con
//     char[] arr1 = s1.toCharArray();
//     char[] arr2=s2.toCharArray();

//     Arrays.sort(arr1);
//     Arrays.sort(arr2);

//     return Arrays.equals(arr1,arr2);
// }

// public static void main(String[] args) {
//         System.out.println(anagrams("listen", "silent"));  // true
//         System.out.println(anagrams("hello", "world"));    // false
//     }



//  import java.util.*;
//  public class Main {

// public static String reverseString( String s){
//     String reversed = "";
//     for(int i=s.length()-1; i>=0;i--){
//         reversed+= s.charAt(i);
//     }
//     return reversed;

// }

//  public static void main ( String[] args){
//     Scanner sc = new Scanner ( System.in);
    
//     System.out.println("enter the string of yours choice ");
//     String input= sc.nextLine();

//     String result = reverseString(input);
//     System.out.println(" the reversed string is:"+ result);

//     sc.close();

//  }


// public static int calcpow(int x,int n){
//     if(n==0){
//         return 1;
//     }
//     if(x==0){
//         return 0;
//     }
//     int xpownm1= calcpow(x,n-1);
//     int xpown= x * xpownm1;
//     return xpown;
// }
// public static void main ( String  args[]){
//     int x=2 ; int n=6;
//     int ans = calcpow(x,n);
//     System.out.println("answer is "+ ans);
// }
// }



// public class Main {
//   public statis void perm( String str , String permutation){
//     if(str.length==0){
//       System.out.println(permutation)
//       return ;
//     }
//     for (int i =0; i<str.length();i++){
//       char currChar = str.charAt(i);
//       String newstr= str.substring(0,i)+str.substring(i+1);
//       perm(newstr,permutation+currChar);
//     }
//   }
//   public static void main(String args[]) {
//         String str = "abcd";
//         Perm(str, "");
//     }
// }





// class   Pen{

//     // instance variable //  this belong to the object not to the class //
//     String color;
//     String type;


// public void write(){
//     System.out.println(" beginning of the code ");
// }
// public void printColor(){
//     System.out.println(this.color);  //this.color means: "the color variable that belongs to this specific object."//
//     System.out.println(this.type);
// }
// }


// class Student{
//     String name;
//     int age;


//     public void printStud(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         // Pen pen1=new Pen();
//         // pen1.color="blue";
//         // pen1.type="gel";

//         // pen1.printColor();
        
//         Student S1= new Student();
//         S1.name= " Rahul JayKar";
//         S1.age=25;

//         S1.printStud();
// }
// }

// USIN THE CONSTRUCTOR //



// class Student {
//     String name;
//     int age;

//     // Constructor to initialize name and age
//     public Student(String name, int age) {
//         this.name = name;  // this.name refers to the instance variable
//         this.age = age;
//     }

//     public Student(){
//         this.name="unknown";
//         this.age=52;
//     }

//      public Student(String name){
//         this.name=name;
//         this.age=52;
//     }
    
    

//     public void printStud() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create student with constructor
//         Student s1 = new Student("Ram", 19);
//         Student s2 = new Student();
//         Student s3 = new Student();


//         s1.printStud();     // Ram 19
//         s2.printStud();     // unknown 52
//         s3.printStud();     // vaisakh 52

//     }
// }

////// THE ACCESS MODIFIERS ///

//     class Bank{
//         public String name; public int age;  // this is public class can be accessed anywhere //

//         protected String mail; // Protected class can be accessed by  own class + subclass of other package //

//         private int num;

//         public void setNum(int n){   // setter for private variable 
//             num =n;
//         }
//         public int  getnum(){        // getter for private variable
//             return num;
//         }
//     }


//     public class Main{
//         public static void main ( String args[]){
        
//         // public ->  can be accessed anywhere
//             Bank ba= new Bank();
//             ba.name= " Jaggu daa "; 

           
//         // private -> cant be accessed anywhere else getter and setter 
//             // ba.num = 45;  // this is the private modifier  cant be accessed like this 
//             ba.setNum(45);
//             System.out.println("the private number is"+ ba.getnum());  // accessing the private method through a setter getter fun .....


//        // protected -> can be accessed within the same class or obj or sub class by extending the class 
//             ba.mail="xyz@gmail.com"  ; // it can be accessible because same class



        
//         }
//     }

// class Bank {
//     protected String mail = "protected@mail.com";
// }

// class Account extends Bank {
//     public void showMail() {
//         System.out.println(mail);  // ✅ Allowed: subclass can access protected member
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Account ac = new Account();
//         ac.showMail();  // ✅ Accessed through subclass method
//     }
// }







import java.util.*;

class Main{
        public static void main (String[] args) {
            ArrayList<Integer> a = new ArrayList<Integer>
        }

}














