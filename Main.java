import java.util.Arrays;
import Algorithms.*;
/* Main functions to run test for all algorithms classes */


public class Main{
    public static void main (String[] args){
        
        //Test different sort algorithms
        int[] elements = {3, 7, 1, 0, 9, 8, 5};
        
        //Selection sorted
        System.out.print(Arrays.toString(Sort.SelectionSort(elements)));
    }
}