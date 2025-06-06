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



class calculator {
       public int sub ( int a, int b)
       {
        return a-b;
       }

       static void greet(){
        system.out.println("welcoome here ")
       }
       class method{
        public static void main (String[] args)
       {
        calculator.greet();
        calculator calc = new calculator ();
        system.out.println(calc.sub(15,8));

       }

       }
       
}




// Java program demonstrates how to call a method
class Add {
    int s = 0;
    
    // Method 
    public int addTwoInt(int a, int b) {
        // Perfrom sum of two numbers given as argument
        s = a + b;
        
        // Return the sum of two numbers
        return s;
    }
}

class Geeks
{
    public static void main(String[] args) {
        
        // Creating an object of Add class
        Add a = new Add();
        
        // Calling method using object and storing the return 
        // Value in res variable of int type
        int res = a.addTwoInt(1, 2);
        
        // Printing the output
        System.out.println("Sum: " + res);  
    }
}