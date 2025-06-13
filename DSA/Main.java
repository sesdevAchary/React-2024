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


 import java.util.*;
 public class Main {


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



public static string reverse(string s){
  StringBuilder sb =  new StringBuilder(s);
   return sb.reverse.toString();
}
public static void main ( string[] args){
  SYstem.out.println(reverse("hello"));
}

}


