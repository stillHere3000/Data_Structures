/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 8 ArrayBased ADT
 * Any and all work in this file is my own.
 * 
 */

/**
 * The ParenthesisCheck class checks if a given string has balanced parentheses.
 */
public class ParenthesisCheck {
    /**
     * The checkString method prompts the user to enter a string and checks if the parentheses in the string are balanced.
     * @param args The command-line arguments.
     */
    public static boolean checkString(String s) {
        ArrayBasedADT stack = new ArrayBasedADT(s.length());
        int numofOpen = 0;
        try {
            boolean balanced = true;
            for (int i = 0; i < s.length() ; i++) {
                char c = s.charAt(i);
                
                if (c == '(') {
                   stack.push(c);
                } else { 
                    if (c == ')') {
                        if (stack.isEmpty()) {
                            System.out.println("Unbalanced parentheses");
                            return false;
                        }  
                        stack.pop();                     
                    }
                }
            }

            System.out.println(stack.isEmpty() ? "Parentheses are balanced" : "Unbalanced parentheses");
            if(stack.isEmpty() ){
              return true;
            }
        } catch (ListException e) {
            System.err.println(e.getMessage());
        }
        return (numofOpen == 0)?true:false;
    }
}