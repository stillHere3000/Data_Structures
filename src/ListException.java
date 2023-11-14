/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 5 Abstract Data Type Lis
 * Any and all work in this file is my own.
 * 
 */


/**
 * This class contains the ListException. 
 * It extends the Runtime Exception and gives an error message if a logic error has occurred.
 * and handling errors such as outofbound indexes, null pointers .
 * @author 
 * @version 
 */
public class ListException extends RuntimeException {
    public ListException(String message) {
        super(message);
    }
}