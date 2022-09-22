public class InsertionSort                                                      // Java program for implementation of insertion sort for integer arrays
{
    public static int[] insertionSort(int[] array)                              // method to sort array using Insertion Sort
    {
        int n = array.length;                                                   // initialize n to the array length

        for(int i = 1; i < n; i++)                              
        {
                int key = array[i];                                             // start at the second element
                int j = i - 1;                                                  // variable j starts at 0

                while (j >= 0 && array[j] > key)                                // move elements of array that are greater to one position ahead
                {
                        array[j + 1] = array[j];
                        j = j - 1;
                }

                array[j + 1] = key;                                    
        }

        return array;                                                           // return sorted array to the calling method
    }
}
