package Algorithms;


/* Class for all the sort algorithms (sort integers in ascending order) */

public class Sort {

    public Sort(){
        //default constructors
    }

    //Selection Sort
    public static int[] SelectionSort(int[] elements){
        int N = elements.length;
        for (int i = 0; i < N; i++)
        {
           int min = i;
           for (int j = i+1; j < N; j++){
              if (elements[j] < elements[min]){
                 min = j;
              }
            }
           elements = exch(elements, i, min);
        }
        return elements;
    }

    //Insertion Sort
    public static int[] InsertionSort(int[] elements){
        int N = elements.length;
        for (int i = 0; i < N; i++){
            for (int j = i; j > 0; j--){
                if (elements[j] < elements[j-1]){
                    exch(elements, j, j-1);
                }else{
                    break;
                } 
            }
        }
        return elements;
    }

    // Merge Sort
    // https://www.geeksforgeeks.org/merge-sort/
    public static int[] MergeSort(int[] elements, int left, int right){
        if (left < right) {
            // Find the middle point
            int middle =left + (right-left)/2;
  
            // Sort first and second halves
            MergeSort(elements, left, middle);
            MergeSort(elements, middle + 1, right);
  
            // Merge the sorted halves
            merge(elements, left, middle, right);
        }

        return elements;
    }

    //Quick Sort
    public static int[] QuickSort(int[] elements, int low, int high){
        if (low < high) {
          
            // pivot is partitioning index, elements[p]
            // is now at right place 
            int pivot = partition(elements, low, high);
  
            // Separately sort elements before
            // partition and after partition
            QuickSort(elements, low, pivot - 1);
            QuickSort(elements, pivot + 1, high);
        }

        return elements;
    }

    // Helper function for Quick Sort that sorted subarray and return the pivot
    private static int partition(int[] elements, int low, int high){
      
        // pivot
        int pivot = elements[high]; 
      
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1); 
  
        for(int j = low; j <= high - 1; j++){
          
            // If current element is smaller 
            // than the pivot
            if (elements[j] < pivot) {
              
                // Increment index of 
                // smaller element
                i++; 
                exch(elements, i, j);
            }
        }
        exch(elements, i + 1, high);
        return (i + 1);
    }

    // Helper function for Merge Sort that merge two subarrays together inorder
    // https://www.geeksforgeeks.org/merge-sort/
    private static void merge(int elements[], int left, int middle, int right)
    {
        // Find sizes of two subelementsays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;
  
        /* Create temp arrays */
        int LEFT[] = new int[n1];
        int RIGHT[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i){
            LEFT[i] = elements[left + i];
        }
        for (int j = 0; j < n2; ++j){
            RIGHT[j] = elements[middle + 1 + j];
        }
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (LEFT[i] <= RIGHT[j]) {
                elements[k] = LEFT[i];
                i++;
            }
            else {
                elements[k] = RIGHT[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of LEFT[] if any */
        while (i < n1) {
            elements[k] = LEFT[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of RIGHT[] if any */
        while (j < n2) {
            elements[k] = RIGHT[j];
            j++;
            k++;
        }
    }
            

    //Helper functions for exchange two elements in the array
    private  static int[] exch(int[] a, int i, int j){
        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}