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

        int pointer = low + 1;
        for(int i = low + 1; i <= high; i++) {
            if(arr[i] <= val) {
                //if less than, swap?
                swap(arr, i, pointer);

                pointer++;
            }
        }

        //swap at end
        swap(arr, pointer - 1, low);

        return pointer - 1;
    }

    //swaps the value at a to b (and vice versa)
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
}