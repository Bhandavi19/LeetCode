class Solution {
    public int maxProduct(int[] nums) {
        int prev = 1;
        int suff = 1;
        int n=nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            
            if(prev == 0) prev = 1;
            if(suff == 0) suff = 1;
            prev *= nums[i];
            suff *= nums[n-1-i];
            max=Math.max(max,Math.max(prev,suff));

        }
        return max;
    }
}