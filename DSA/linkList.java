class linkList{
    Node head ;
    class Node{
         String data;
         Node next;
        Node(String data){
            this.data = data ;
            this.next= null;
        }
    }

    // public void addfront(String data){
    //    Node newNd = new Node (data);
    //    if(head == null){
    //     head = newNd;
    //     return;
    //    }
    //    else{
    //     newNd.next = head;
    //     head = newNd;
    //    }

    // }


    public void
     addlast(String data){
        Node newNd= new Node(data);
        if(head == null){
            head = newNd;
        }
        Node current=head;
        while(current.next!= null){
            current=current.next;
        }
        current.next=newNd;
    }

public void PrintList(){
    Node current = head;

    while(current != null){
        System.out.println(current.data+"->");
        current= current.next;
    }
}
    public static void main ( String[] args){
        linkList ll = new linkList();
        ll.addlast("a");
        ll.addlast("b");
        ll.addlast("c");
        ll.PrintList(); 
    }
}











public class linkList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the end
    public void addLast(String data) {
        Node newNd = new Node(data);
        if (head == null) {
            head = newNd;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNd;
    }

    public void PrintList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkList ll = new linkList();
        ll.addLast("a");
        ll.addLast("b");
        ll.addLast("c");

        ll.PrintList();  // Output: a → b → c → null
    }
}

public void addfront(String data){
   Node newNd = new Node(data);import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printStudent() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Neha", 22));
        students.add(new Student("Amit", 21));
        students.add(new Student("Ravi", 20));

        System.out.println("Original List:");
        for (Student s : students) {
            s.printStudent();
        }

        // Sort by name
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            s.printStudent();
        }

        // Sort by age
        students.sort((s1, s2) -> s1.age - s2.age);

        System.out.println("\nSorted by Age:");
        for (Student s : students) {
            s.printStudent();
        }
    }
}

   newNd.next = head;  // Connect to existing list
   head = newNd;       // Move head to new node
}
public void addfront(String data){
   Node newNd = new Node (data);
   if(head == null){
        head = newNd;
        return;
   }
   else{
        newNd.next = null;  // ❌ WRONG LINE
        head = newNd;
   }
}
