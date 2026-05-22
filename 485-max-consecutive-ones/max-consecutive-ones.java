class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                cnt++;
            }
            else{
                
                cnt=0;
            }
            res = Math.max(res,cnt);
        }
        return res;
    }
}