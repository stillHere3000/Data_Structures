/**
Author: Trevor Maliro
Student ID: 239498690
Lab 2 Part 1 & 2
Menu Driven Input
Any and all work in this file is my own.
*/
import java.util.Scanner;

/**
 * The Recursion class contains:
 * methods for recursively printing numbers down to zero by three and finding the highest ASCII character in a given string.
 * The main method prompts the user to enter a word and calls the maximumChar method to find the highest ASCII character in the word.
 * The downToZeroByThree method recursively prints numbers down to zero by three.
 * The maximumChar method recursively finds the highest ASCII character in a given string.
 * If the input string is empty or null, an IllegalArgumentException is thrown.
 * @author 
 * @version 
 * @see 
 */
public class Recursion {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner1 = new Scanner(System.in);
        do{
            System.out.println("\nProgram Menu1\n1- for downToZeroByThree"+
                                "\n2- finds the character with the highest ASCII value "+
                                "\n3- Reverses the digits of a given integer"+
                                "\nEnter 0 to exit"); 
            System.out.print("Choose a program to execute:\t");
            switch(scanner.nextInt()){
                case 1:
                    System.out.println("Enter any number to decrement:\t");
                    downToZeroByThree(new Scanner(System.in).nextInt());
                    break;
                case 2:
                    promptUser();
                    break;
                case 3:
                    System.out.println("Enter any number:\t");
                    System.out.println("Reversed Number is\t"+reverseNumber(new Scanner(System.in).nextInt()));
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while(true);      
        
    }

    /**
     * This method takes an integer value as input and prints out the value and recursively calls itself 
     * with the value decreased by 3 until the value is 1. 
     * If the input value causes an exception, StackOverflowError, Error, or Throwable, the method catches the exception and prints an error message.
     * @param value the integer value to start the recursion with
     */
    public static void downToZeroByThree(int value) {
        try{
            if(value != 1) {
                System.out.println(value);
                downToZeroByThree(value - 3);
            }
        }
        catch(Exception e){
            System.out.println("Your input causes an Exception, Would run to inifinte\t"+e);
            return;
        }
        catch(StackOverflowError e){
            System.out.println("Your input causes an StackOverflowError, Would run to inifinte\t. Returning to Menu"+e);
            return;

        }
        catch(Error e){
            //System.out.println("Your input causes an Error, Would run to inifinte\t"+e);
            System.err.println("Your input causes an Error, Would run to inifinte\t");
            return;
        }
        catch(Throwable e){
            System.out.println("Your input causes an Throwable, Would run to inifinte\t"+e);
            return;
        }
    }

    
    /**
     * Prompts the user to enter a word and finds the character with the highest ASCII value in the word.
     * The result is printed to the console.
     */
    public static void promptUser() {
        System.out.println("Enter any word: ");
         
        String word = (new Scanner(System.in)).nextLine();
        char c= maximumChar(word, '\0');
        System.out.println("Highighest Ascii Char is\t"+c);
        //scanner.close();
    }

   
    /**
     * This method takes a string and a character as input and returns the highest ASCII value character in the string.
     * If the input string is empty or null, an IllegalArgumentException is thrown.
     * @param str the input string
     * @param max the maximum character found so far
     * @return the highest ASCII value character in the string
     * @throws IllegalArgumentException if the input string is empty or null
     */
    public static char maximumChar(String str, char max) {
        try{
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Input string must not be empty or null.");
            }
        
            /*
             * the base case of the recursion, i.e., the string has only one character left. 
             * 
             */
            if (str.length() == 1) {
                char tempC = str.charAt(0);
                max = (tempC > max) ? tempC : max; // 
                //System.out.println("Highighest Ascii Char is\t"+max);
                return max;            
            }
        
            char tempC = str.charAt(0); // get the first character of the substring
            max = (tempC > max) ? tempC : max;
        
            return maximumChar(str.substring(1), max);  // recursive call
        }        
        
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException is\t"+e);
            return max;
        }
        
    }

    /**
     * Reverses the digits of a given integer.
     * If the integer is negative, it returns the reverse of its absolute value with a negative sign at the end.
     * @param num the integer to be reversed
     * @return the reversed integer
     */
    public static String reverseNumber(int x) {
        
        int reversed = reversePositiveNumber(Math.abs(x));
        
        return ( x < 0)?(reversed+"-"):(reversed+" ");
    }
    
    /**
     * This method takes a positive integer and returns its reverse.
     * @param num the positive integer to be reversed
     * @return the reverse of the input positive integer
     */
    private static int reversePositiveNumber(int x) {
        if (x < 10) {
            return x;
        } else {
            int lastDigit = x % 10;
            int remainingDigits = x / 10;
            int reversed = reversePositiveNumber(remainingDigits);
            int reversedNum = Integer.parseInt(String.valueOf(lastDigit) + String.valueOf(reversed));
            return reversedNum;
        }
    }  
}
