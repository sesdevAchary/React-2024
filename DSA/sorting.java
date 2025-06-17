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












import java.util.*;

public class sorting {
    public static void conquer(int [] arr,int low,int mid ,int high){
        int[] merged = new int [high-low+1];
        int idx1=low;
        int idx2=mid+1;
        int x = 0;

        // merging the elemetns in order //
        while(idx1<=mid && idx2<=high){
           if (arr[idx1] <= arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }

        // copying the remaining elements //
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }

        // copying the remaining elements of right subarray 
        while(idx2<=high){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=low;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }


    public static void divide(int[] arr,int low,int high){
        if(low>=high)
        return;
    
    int mid = low+(high-low)/2;
    divide(arr,low,mid);
    divide(arr,mid+1,high);
    conquer(arr,low,mid,high);
    }

    public static void main (String args[]){
        int arr[]= {7,8,9,5,3,4,11};
        int n = arr.length;

        divide(arr,0,n-1);
         for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    }
}












c