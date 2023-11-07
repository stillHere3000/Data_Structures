/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 3 Recursion
 * Any and all work in this file is my own.
 * 
 */


import java.util.Scanner;

/**
 * This class contains methods to calculate the nth Fibonacci number recursively, and to print asterisks in a pattern using recursion.
 * The main method prompts the user to enter a value for n, calculates the nth Fibonacci number using the fib method, and prints the result to the console.
 * 
 * It also prompts the user to enter another value for n, and calls the printUp and printDown methods to print asterisks in a pattern using recursion.
 * 
 */
public class Recursion{

    /**
     * This method calculates the nth Fibonacci number recursively.
     * 
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    public static int fib(int n) {
        if( n== 0) return 0;

        if (n == 2 || n==1  ) {
            return 1;
        } 
        
        return fib(n - 1) + fib(n - 2);        
    }

    /**
     * This method prompts the user to enter a value for n, calculates the nth Fibonacci number using the fib method,
     * and prints the result to the console.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // PART 1 FIBONACCI PROBLEM
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n to compute the nth Fibonacci number: ");
        
        // Read the value of n from the user
        int n = scanner.nextInt(); 

        // Call the recursive fib method and print the result
        int fibonacciNumber = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);

        System.out.print("Enter the value of n: ");
        int w = scanner.nextInt();
        
        // PART 2 PRINTING PROBLEM
        printUp(w);         System.out.println("Printing up:");
        printDown(w);       System.out.println("\nPrinting down:");


        scanner.close();
    }

    
    /**
     * Recursively prints asterisks in ascending order up to n.
     * @param n the number of asterisks to print
     */
    public static void printUp(int n) {
        if (n > 0) {
            printUp(n - 1); // Recursive call
            // Print asterisks for the current level
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

    
    /**
     * This method prints asterisks in descending order recursively.
     * @param n the number of asterisks to print in the current level
     */
    public static void printDown(int n) {
        if (n > 0) {
            // Print asterisks for the current level
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
            printDown(n - 1); // Recursive call
        }
    }


}

