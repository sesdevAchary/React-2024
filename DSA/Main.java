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

while(n>1)
 system.out.println(n)
 n=n/2   // each time it gets halved so O(logn)


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




for ( int i = 0; i<n;i++){
 system.out.println("one")
}

for(int j=0; j<n;j++)
{
 system.out.println("one")
}                     // Herer there comes 2 different loops but single at a time so O(n)+O(n)




   // Single loop
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Nested loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j);
            }
        }      // 2 different loops but are associated sooo O(n)+O(n^2)