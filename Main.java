import java.util.Arrays;
import Algorithms.*;
/* Main functions to run test for all algorithms classes */


public class Main{
    public static void main (String[] args){
        
        //Test different sort algorithms
        int[] elements = {3, 7, 1, 0, 9, 8, 5};
        int[] test; //temporary array for testing sort functions
        
        //Selection sorted
        test = elements.clone();
        System.out.println(Arrays.toString(Sort.SelectionSort(test)));

        //Insertion sorted
        test = elements.clone();
        System.out.println(Arrays.toString(Sort.InsertionSort(test)));

        //Merge sorted
        test = elements.clone();
        System.out.println(Arrays.toString(Sort.MergeSort(test, 0, test.length -1)));

    }
}