Printing `*` (asterisks) in Java can be done in multiple ways, depending on the pattern you want to print. Here are some basic examples:

// 1. Printing a Single 

public class StarPrint {
    public static void main(String[] args) {
        System.out.println("*");
    }
}
```

// 2. Printing a Line of 

public class StarPrint {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
    }
}
```
**Output:**
```
* * * * * 
```

// 3. Printing a Square of 

public class StarPrint {
    public static void main(String[] args) {
        int n = 5; // Size of the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
**Output:**
```
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
```

//4. **Printing a Right-Angled Triangle**

public class StarPrint {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
**Output:**
```
* 
* * 
* * * 
* * * * 
* * * * * 
```
 //5. Printing a Pyramid
`
public class StarPrint {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Printing spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Printing stars
            }
            System.out.println();
        }
    }
}
```
**Output:**
```
    *    
   ***   
  *****  
 ******* 
*********
```

Let me know if you need more patterns! 🚀
