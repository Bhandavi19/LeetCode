class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;
        
        int[] count = new int[total + 1];
        
        // Count frequencies
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }
        
        int repeated = -1, missing = -1;
        
        // Find repeated and missing
        for (int i = 1; i <= total; i++) {
            if (count[i] == 2) {
                repeated = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{repeated, missing};
    }
}