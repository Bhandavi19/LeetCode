class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int ans = 0;
        double avg = 0;
        double res = Double.NEGATIVE_INFINITY;
        for(int r=0;r<nums.length;r++){
            ans += nums[r];
            if(r-l+1 == k){
                avg = (double)ans/k;
                res = Math.max(res,avg);                
                ans-=nums[l];
                l++;
            }            
        }
        return res;
    }
}