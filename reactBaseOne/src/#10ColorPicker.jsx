import { useState } from "react"
import react from 'react'

function colorpicker(){
    const[color,setColor]= useState("#FFFFFF");

    function handleColorChange(event){
        setColor(event.target.value);
    }


    // CREAING HTML ELEMENT WITHIN THE RETURN APP //
    return(
        <div className="color-picker-container">
            <h1>COLOR PICKER </h1>
            
            <div className="color-display" style={{backgroundColor:color}}> {/*for white background color  */}
                <p> Selected color:{color}</p>
            </div>
            <label htmlFor=""> SELECT A COLOR </label>
            <input type="color" value={color} onChange={handleColorChange}/> {/*default-changed-want to change; format */}
        </div>
    )
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
public class Sum {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Sum: " + (a + b));
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
public class Factorial {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
public class Palindrome {
    public static void main(String[] args) {
        int num = 121, rev = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Reversed: " + reversed);
    }
}
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}

public class Largest {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest: " + max);
    }
}
public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }
}
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
public class VowelCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                count++;
        }
        System.out.println("Vowel Count: " + count);
    }
}
function add(a, b) {
  return a + b;
}
console.log(add(5, 3)); // Output: 8
function isEven(n) {
  return n % 2 === 0;
}
console.log(isEven(4)); // true
const fruits = ["apple", "banana", "cherry"];
fruits.forEach(fruit => console.log(fruit));
const person = {
  name: "Alice",
  age: 30,
  greet() {
    console.log(`Hello, my name is ${this.name}`);
  }
};
person.greet();
document.getElementById("btn").addEventListener("click", () => {
  alert("Button clicked!");
});
setTimeout(() => {
  console.log("Executed after 2 seconds");
}, 2000);
