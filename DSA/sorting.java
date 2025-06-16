// import java.util.*;

// public class sorting{
//     public  static int linearSearch(int[] array, int target){
//     for(int i=0;i<array.length;i++){
//         if(array[i] == target){
//         return i;
//     }
//     }
//     return -1 ; 
//     }
//     public static void main ( String[] args){
//         Scanner sc = new Scanner (System.in);

//         System.out.println("enter the array size you want-> ");
//         int size = sc.nextInt();

//         System.out.println(" enter the list-> ");
//         int array[] = new int[size];
//         for(int j=0;j<size;j++){
//         array[j]=sc.nextInt();
//         }
        
//         System.out.println("enter the element you want to search-> ");
//         int target= sc.nextInt();

//  int foundIndex= linearSearch(array, target);
//          if(foundIndex==-1){
//             System.out.println("element not found: ");
//          }
//          else{
//             System.out.println("Element found successfully: ");
//          }
        
//    sc.close();

// //     }
// public void sorting{
//     public static int binarySearch(int[] array , int target){
//         int low =0; int high = array.length-1;
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             if(array[mid] == target)
//             return target;

//             if( target<array[mid]){
//             high=mid-1;
//             }
//             else{
//                 low=mid+1
//             }

// return -1;
//         }
//     }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the array size you want -> ");
//     int size = sc.nextInt();

//     System.out.println("Enter the list -> ");
//     int[] array = new int[size];
//     for (int j = 0; j < size; j++) {
//         array[j] = sc.nextInt();
//     }

//     // ✅ Sort the array before binary search
//     Arrays.sort(array);  // <-- This line fixes the logical error

//     System.out.println("Enter the element you want to search -> ");
//     int target = sc.nextInt();

//     int foundIndex = binarySearch(array, target);

//     if (foundIndex == -1) {
//         System.out.println("Element not found.");
//     } else {
//         System.out.println("Element found successfully at index: " + foundIndex);
//     }

//     sc.close();
// }
// }












import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Maximum number is: " + max);
    }
}

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Printing all elements
        System.out.println("List: " + list);

        // Accessing element at index 1
        System.out.println("Element at index 1: " + list.get(1));

        // Removing element at index 0
        list.remove(0);
        System.out.println("List after removal: " + list);

        // Checking if list contains an element
        if (list.contains(20)) {
            System.out.println("List contains 20");
        }

        // Size of the list
        System.out.println("Size of the list: " + list.size());
    }
}

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Printing the list
        System.out.println("Names: " + names);

        // Add to front and end
        names.addFirst("Zara");
        names.addLast("Tom");

        System.out.println("Updated List: " + names);

        // Remove an element
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);

        // Get element at index
        System.out.println("Element at index 2: " + names.get(2));
    }
}

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Printing the list
        System.out.println("Names: " + names);

        // Add to front and end
        names.addFirst("Zara");
        names.addLast("Tom");

        System.out.println("Updated List: " + names);

        // Remove an element
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);

        // Get element at index
        System.out.println("Element at index 2: " + names.get(2));
    }
}

