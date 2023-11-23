/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 10 Sorting Arrays
 * Any and all work in this file is my own.
 * 
 */

// This program performs sequential search, bubble sort, binary search, and merge sort on two arrays.
public class Sorting {

    
    /**
     * The main method of the Sorting class.
     * It performs sequential search, bubble sort, binary search, and merge sort on the arrays.
     *
     * @param args the command line arguments
     * @throws Exception if an error occurs during execution
     */
    public static void main(String[] args) throws Exception {
        int[] array = {2, 5, 8, 9, 10, 15, 20, 25, 32, 45, 54, 55, 97};
        int[] array2 = {10, 20, 15, 25, 2, 8, 5, 32, 54, 9, 4, 6, 1, 55, 97, 45};


        int searchTerm = 20; int searchTerm2 = 35;
        int index = sequentialSearch(array, searchTerm);
        bubbleSort(array);
        int temp= binarySearch(array, 0, array.length-1, searchTerm);
        int temp2= binarySearch(array, 0, array.length-1, searchTerm2);

        System.out.println("Displaying Array");
        displayArray( array2);
        mergeSort(array2, 0, array2.length-1);
        System.out.println("\nSorted Array Merge Sort: " );
        displayArray( array2);

        if (temp == -1) {
            System.out.println("\nSearch Term NOT Found recursively");
        }
        else {
            System.out.println("\nFound at index recursively: " + searchTerm);
        }

        if(temp2 == -1) {
            System.out.println("\nSearch Term NOT Found recursively "+ searchTerm2);
        }
        else {
            System.out.println("\nFound at index recursively: " + searchTerm2);
        }
    }

    /**
     * Performs sequential search on the given array to find the target element.
     *
     * @param arr the array to be searched
     * @param target the target element to be found
     * @return the index of the target element if found, -1 otherwise
     */
    public static int sequentialSearch(int[] arr, int target) {
        System.out.println("Searching for " + target+ " Sequentially");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("\nFound at index " + i);
                return i;
            }
        }
        System.out.println("\nSearch Term NOT Found at index: " + target);
        return -1;
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param arr the array in which the elements are to be swapped
     * @param i the index of the first element
     * @param j the index of the second element
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return;
    }

    /**
     * Sorts the given array using bubble sort algorithm.
     *
     * @param array the array to be sorted
     */
    public static void bubbleSort(int[] array) {
        System.out.println("Bubble Sort on array" );
        displayArray( array);
        int n = array.length;
        boolean swapped = true; // flag to check if any swaps were made
        while (swapped) { // loop until no swaps are made
            swapped = false;
            for (int i = 1; i < n; i++) { // loop through the array
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i); // swap the elements
                    swapped = true; // set the flag to true
                }
            }
            n--;
        }
        System.out.println("\nSorted Array: " );
        displayArray( array);
        return;
    }

    /**
     * Displays the elements of the given array.
     *
     * @param array the array to be displayed
     */
    public static void displayArray(int[] array) {
        System.out.println("Displaying Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        return;
    }

    /**
     * Performs binary search on the given array to find the target element.
     *
     * @param array the array to be searched
     * @param start the starting index of the search range
     * @param end the ending index of the search range
     * @param k the target element to be found
     * @return the index of the target element if found, -1 otherwise
     */
    public static int binarySearch(int[] array, int start, int end, int k) {
       if(start < 0 || start >= array.length || end < 0 || end >= array.length ||  start > end) { // check for invalid indices
           return -1;
       }
       else{
            int mid = (start + end) / 2; // find the middle index
            if(array[mid] == k) { // base case
                System.out.println("\nFound at index " + k);
                return mid;
            }
            else if(array[mid] > k) { // recursive case
                return binarySearch(array, start, mid - 1, k);
            }
            else { // recursive case
                return binarySearch(array, mid + 1, end, k);
            }
       }       
    }

    /**
     * Sorts the given array using merge sort algorithm.
     *
     * @param array the array to be sorted
     * @param start the starting index of the sort range
     * @param end the ending index of the sort range
     */
    public static void mergeSort(int[] array, int start, int end) {
        if(start < 0 || start >= array.length || end < 0 || end >= array.length ||  start > end) { // check for invalid indices
            return;
        }
        else if(start == end) { // base case
            return;
        }
        else {
            int mid = (start + end) / 2; // find the middle index
            mergeSort(array, start, mid); // recursively sort the first half of the array
            mergeSort(array, mid + 1, end); // recursively sort the second half of the array
            merge(array, start, mid, end); // merge the sorted subarrays
        }
    }

    /**
     * Merges two sorted subarrays into a single sorted subarray.
     *
     * @param array the array containing the subarrays to be merged
     * @param start the starting index of the first subarray
     * @param mid the ending index of the first subarray and the starting index of the second subarray
     * @param end the ending index of the second subarray
     */
    public static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];  // temporary array to store the merged subarrays
        int i = start; int j = mid + 1; int k = 0;
        while(i <= mid && j <= end) { // merge the subarrays
            if(array[i] < array[j]) { // compare the elements of the subarrays
                temp[k] = array[i]; // store the smaller element in the temporary array
                i++; // move to the next element in the first subarray
            }
            else {
                temp[k] = array[j]; // store the smaller element in the temporary array
                j++; // move to the next element in the second subarray
            }
            k++; // move to the next element in the temporary array
        }
        while(i <= mid) {   // copy the remaining elements of the first subarray
            temp[k] = array[i]; 
            i++;
            k++;
        }
        while(j <= end) {  // copy the remaining elements of the second subarray
            temp[k] = array[j];
            j++;
            k++;
        }
        for(int x = 0; x < temp.length; x++) { 
            array[start + x] = temp[x]; // copy the elements of the temporary array to the original array
        }
    }
    
}
