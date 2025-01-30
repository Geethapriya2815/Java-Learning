//You have two numbers, and your challenge is to write a program that performs both addition and subtraction with them.
//However, if any subtraction results in a negative number, display it as a positive value.
// How will you tackle this and show the final results?

import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number a is : ");
    int a = sc.nextInt();
    System.out.println("Enter a number b is :");
    
    int b = sc.nextInt();
    add(a,b);
    sub(a,b);
        sc.close();
  }

  public static void add(int a , int b){
    int sum = a + b;
        System.out.println("Addition result: " + sum);
    
  
  }
     public static void sub(int a , int b){
       int diff = Math.abs(a - b);
        System.out.println("Subtraction result (absolute value): " + diff);
   
  }

  }
    
    
    
