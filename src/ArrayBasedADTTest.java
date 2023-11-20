/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 8 Sorting LinkedList
 * Any and all work in this file is my own.
 * 
 */

import java.util.Scanner;



/**
 * This class is used to test the ArrayBasedADT class by reversing a string and checking for balanced parentheses.
 */
public class ArrayBasedADTTest {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse:");
        String input = scanner.nextLine();
        
        try {
            ArrayBasedADT stack = new ArrayBasedADT(input.length());
            if( ParenthesisCheck.checkString(input) == true){
                for (char c : input.toCharArray()) {
                    stack.push(c);
                    System.out.println("Char added "+c+" to the stack");
                }
                System.out.println("The stack is full");
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.println();
            }
            else{
                System.out.println("Unbalanced parentheses, stack is empty and No string processed");
            }
        } catch (ListException e) {
            System.err.println(e.getMessage());
        }
        scanner.close();
    }
    
}
