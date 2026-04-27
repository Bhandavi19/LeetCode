class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1];
        
        // Build prefix sum array
        // prefix[i] stores sum of first i elements
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // Sum from left to right inclusive
        return prefix[right + 1] - prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */