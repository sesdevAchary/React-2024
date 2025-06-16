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

//     }
public void sorting{
    public static int binarySearch(int[] array , int target){
        int low =0; int high = array.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(array[mid] == target)
            return target;

            if( target<array[mid]){
            high=mid-1;
            }
            else{
                low=mid+1
            }

return -1;
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the array size you want -> ");
    int size = sc.nextInt();

    System.out.println("Enter the list -> ");
    int[] array = new int[size];
    for (int j = 0; j < size; j++) {
        array[j] = sc.nextInt();
    }

    // ✅ Sort the array before binary search
    Arrays.sort(array);  // <-- This line fixes the logical error

    System.out.println("Enter the element you want to search -> ");
    int target = sc.nextInt();

    int foundIndex = binarySearch(array, target);

    if (foundIndex == -1) {
        System.out.println("Element not found.");
    } else {
        System.out.println("Element found successfully at index: " + foundIndex);
    }

    sc.close();
}
}