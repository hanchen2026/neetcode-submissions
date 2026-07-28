class Solution {
    public int tribonacci(int n) {
        int[] cache = new int[n+1];
        if (n > 0) cache[1] = 1;
        if (n > 1) cache[2] = 1; 

        return fibRecursive(n, cache);
    }

    private int fibRecursive(int n, int[] arr) {
        System.out.println("FASOUKLDhAKSJDH");
        //if small number return the filled in number
        if (n < 3) return arr[n];

        //if in the cache, return the value instead of fibbing
        if (arr[n] != 0) return arr[n];

        //else it is not in cache, so perform tribonacci, and then fill in the cache
        int trib = fibRecursive(n-1, arr) + fibRecursive(n-2, arr) + fibRecursive(n-3, arr);
        arr[n] = trib;
        return trib;
    }
}