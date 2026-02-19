class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0]=1;
        for(int i=0;i<nums.length-1;i++){
            ans[i+1] = ans[i]*nums[i];
        }
        int m = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] = m*ans[i];
            m*=nums[i];
        }
        return ans;
    }
}