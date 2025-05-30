public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Gitpod!");
    }
}


int print(){
    System.out.println(" xyz");
    a=87;
    b=97;
    system.out.println(sum(a+b));   // this program has time complexity O(1) constant always //
}


for (int i = 0; i < n; i++) {
    // constant time operation o(n)
}


for (int i = 0; i < n; i++) {
    for(int j=0; j<n;j++){
        //
    }
}              // O(n)+O(1) = O(n)


for (int i = 0; i < n/2; i++) {
    system.out.println(" value 1");
}                 // O(n/2)→O(n)
 
 for (int i = 0; i < n; i++) {
    for(int j=0; j<m;j++){
        //
    }
}        // Time Complexity = O(n * m)

boolean swapped;
for (int i = 0; i < n - 1; i++) {
    swapped = false;
    for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            swapped = true;
        }
    }
    if (!swapped) break; // bubble sort O(n^2)
}
