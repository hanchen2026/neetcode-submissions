class Solution {
    public int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        quicksort(nums, l, r);

        return nums;

    }

    //quicksort algorithm
    private void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            //lemunto partitioning
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    //move items such that nums < val is before, > after.
    private int partition(int[] arr, int low, int high) {
        //random for edge cases 
        Random r = new Random();
        int pivotIndex = r.nextInt(high - low + 1) + low;
        int val = arr[pivotIndex];

        //swap to left index
        swap(arr, low, pivotIndex);

        //this pointer points to the last value smaller than pivot
        int pointer = low;

        for(int i = low + 1; i <= high; i++) {
            // if comparision is less than pivot, 
            // swap it with index the lowest it can be. Else do nothing.

            if(arr[i] <= val) {
                pointer++;  //increment before swapping
                swap(arr, i, pointer);
            }
        }

        //Swap at end. Lemunto partitioning.
        //This guarantees that the pivot will be at the right spot (sorted).
        swap(arr, pointer, low);
        return pointer;
    }

    //swaps the value at a to b (and vice versa)
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
}