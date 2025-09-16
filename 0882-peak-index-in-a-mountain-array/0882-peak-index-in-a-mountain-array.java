class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        // ================ Brute force / linear search =========
        // int i = 0;
        // while (arr[i] < arr[i + 1]) {
        //     i++;
        // }
        // return i;

        // ============= Linear search by using for loop =========
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         return i;  // peak found
        //     }
        // }
        // return -1; // should not reach here if input is valid mountain array


        // =========binary search==============


        int low = 0, high = arr.length - 1;

        while (low < high) {

            //int mid=low + high/2;     isme overflow ka issue aajata h to isse use nhi krenge
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is in the right half
                low = mid + 1;
            } else {
                // Peak is at mid or in the left half
                high = mid;
            }
        }

        return low; // or high, both point to the peak



    }
}
