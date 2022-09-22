public class BubbleSort {
    
    public static int[] bubbleSort(int[] arr) { // bubble sort method
        int temp; // temporary int for swapping integers
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) { // check if j > j+1 swap for ascending order
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}