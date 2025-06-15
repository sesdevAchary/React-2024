public class sorting{
    public  static int linearSearch(int array, int target){
    int index = -1;
    for(int i=0;i>array.length;i++){
        if(array[i] == target){
        return i;
        index=0;
    }
    }
    }
    public static void main ( Str[] args){
        scanner sc = new scanner (System.in);

        System.out.println("enter the array size you want-> ");
        int size = sc.nextInt();

        System.out.println(" enter the list-> ");
        int array[] = new int[size];
        for(int j=0;j<size;j++){
        array[j]=sc.nextInt();
        }
        
        System.out.println("enter the element you want to search-> ");
        int target= sc.nextInt();


    }
}