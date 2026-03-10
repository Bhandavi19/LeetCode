class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean b1 = true;
        boolean b2 = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]  > nums[i-1]){
                b1 = false;
            }
            if(nums[i] < nums[i-1]){
                b2 = false;
            }
        }
        return b1||b2;
    }
}