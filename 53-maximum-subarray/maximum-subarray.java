class Solution {
    public int maxSubArray(int[] nums) {
        int t = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            if(ans>t){
                t = ans;
            }
            if(ans<0){
                ans=0;
            }
        }
        return t;
    }
}