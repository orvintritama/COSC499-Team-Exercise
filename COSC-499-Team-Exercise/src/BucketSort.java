public class BucketSort {

    public static int[] bucketSort(int[] arr) {
        int maximum_value = max(arr);
        //creating an empty array called newbucket which is considered as bucket array
        int[] buckets = new int[maximum_value + 1];

        //creating another empty array called sorted_array to store the result array
        int[] sorted_array = new int[arr.length];

        //add each input element in buckets
        for (int a= 0; a <arr.length; a++) {
            buckets[arr[a]]++;
        }

        //sorting each element in bucket and adding to sorted array
        int position = 0;
        for (int b = 0; b < buckets.length; b++) {
            for (int c = 0; c < buckets[b]; c++) {
                sorted_array[position++] = b;
            }
        }

        return sorted_array;
    }
    
    public static int max(int[] arr) {
      int max = arr[0];
      for (int value : arr) {
        if (value > max) {
          max = value;
        }
      }
      return max;
    }

}
