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

    //Helper functions for exchange two elements in the array
    private  static int[] exch(int[] a, int i, int j){
        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}